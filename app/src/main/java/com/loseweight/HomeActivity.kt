package com.loseweight

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.ColorStateList
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.appopen.AppOpenAd
import com.google.firebase.messaging.FirebaseMessaging
import com.loseweight.databinding.ActivityHomeBinding
import com.loseweight.facebookad.AudienceNetworkInitializeHelper
import com.loseweight.fragments.MeFragment
import com.loseweight.fragments.PlanFragment
import com.loseweight.fragments.ReportsFragment
import com.loseweight.interfaces.BottomBarClickListener
import com.loseweight.utils.Constant
import com.loseweight.utils.Constant.GOOGLE_APP_OPEN_ID
import com.loseweight.utils.Debug
import com.loseweight.utils.ExitStrategy
import com.loseweight.utils.Utils
import com.loseweight.utils.watertracker.AlarmHelper
import com.utillity.db.DataHelper
import java.util.*
import kotlin.math.roundToInt


class HomeActivity : BaseActivity() {

    var binding: ActivityHomeBinding? = null
    private var pagerAdapter: ScreenSlidePagerAdapter? = null
    private var appOpenAd: AppOpenAd? = null
    private var isAdDisplayed: Boolean = false
    private var isAdLoaded: Boolean = false
    // Check if the activity was started from the intro
    private var fromIntro : Boolean =false
    private var isFirstLaunched : Boolean =false

    @SuppressLint("HardwareIds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (dialogPermission == null)
            checkPermissions(getActivity())
        else if (dialogPermission != null && dialogPermission!!.isShowing.not())
            checkPermissions(getActivity())
        fromIntro = intent.getBooleanExtra("fromIntro", false)
        if(!Utils.isPurchased(this)){
            if (fromIntro) {
                // Redirect to AccessAllFeaturesActivity if fromIntro is true
                val intent = Intent(this, AccessAllFeaturesActivity::class.java)
                startActivity(intent)
            }
        }

        AudienceNetworkInitializeHelper.initialize(this)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        DataHelper(this).checkDBExist()
        Utils.printHashKey(this)
        initIntentParam()
        callGetAdsId()
        loadAppOpenAd()
        init()
    }

    private val appOpenAdLoadCallback = object : AppOpenAd.AppOpenAdLoadCallback() {
        override fun onAdLoaded(ad: AppOpenAd) {
            appOpenAd = ad
            if (!fromIntro && !isFirstLaunched) {
                appOpenAd!!.show(this@HomeActivity)
            }
            isAdLoaded = true
        }

        override fun onAdFailedToLoad(loadAdError: LoadAdError) {
            // Handle ad loading failure
            isAdLoaded = false
        }
    }

    private fun loadAppOpenAd() {
        val adRequest = AdRequest.Builder().build()
        AppOpenAd.load(
            this,
            GOOGLE_APP_OPEN_ID,
            adRequest,
            AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT,
            appOpenAdLoadCallback
        )
    }

    fun startapp() {
        if (Utils.getPref(
                this@HomeActivity,
                Constant.PREF_IS_FIRST_TIME,
                true
            ) && Utils.getPref(this@HomeActivity, Constant.PREF_GOAL, "")
                .isNullOrEmpty()
        ) {
            val i = Intent(getActivity(), ChooseYourPlanActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(i)
            isFirstLaunched = true;
            finish()
        }
    }

    private fun initIntentParam() {
        if(intent.extras != null){
            if(intent.extras!!.containsKey("isFrom") && intent.extras!!.get("isFrom") == Constant.FROM_DRINK_NOTIFICATION)
            {
                if (Utils.getPref(this@HomeActivity, Constant.PREF_IS_WATER_TRACKER_ON, false)) {
                    AlarmHelper.setNotificationsAlarm(this)
                    AlarmHelper.setCancelNotificationAlarm(this)
                }

                val i = Intent(this@HomeActivity, WaterTrackerActivity::class.java)
                startActivity(i)
            }
        }
    }

    private fun init() {
        binding!!.handler = ClickHandler()
        binding!!.bottombar.bottomClickListener = BotomBarClickListener()
        binding!!.badge.setNumber(2, true)

        pagerAdapter = ScreenSlidePagerAdapter((this as AppCompatActivity).supportFragmentManager)
        binding!!.pagerFragment.offscreenPageLimit = pagerAdapter!!.count
        binding!!.pagerFragment.adapter = pagerAdapter
        binding!!.pagerFragment.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                fillWaterTracker()
            }

        })

        //subScribeToFirebaseTopic()
    }

    private fun subScribeToFirebaseTopic() {
        FirebaseMessaging.getInstance().subscribeToTopic("lose_weight_topic")
            .addOnCompleteListener { task ->
                if (!task.isSuccessful) {
                    Debug.e("subScribeFirebaseTopic", ": Fail")
                } else {
                    Debug.e("subScribeFirebaseTopic", ": Success")
                }
            }
    }



    fun fillWaterTracker() {
        if (Utils.getPref(this, Constant.PREF_IS_WATER_TRACKER_ON, false)) {
            val lastDate = Utils.getPref(this, Constant.PREF_WATER_TRACKER_DATE, "")
            val currDate = Utils.parseTime(Date().time, "dd-MM-yyyy")
            if (lastDate.equals(currDate).not()) {
                Utils.setPref(this, Constant.PREF_WATER_TRACKER_DATE, currDate)
                Utils.setPref(this, Constant.PREF_WATER_TRACKER_GLASS, 0)
                binding!!.circularProgressBar.progress = 0f
                binding!!.badge.setText("0", true)
            } else {
                binding!!.circularProgressBar.progress = Utils.getPref(
                    this,
                    Constant.PREF_WATER_TRACKER_GLASS, 0
                ).toFloat()
                binding!!.badge.setText(binding!!.circularProgressBar.progress.roundToInt().toString(), true)
                binding!!.circularProgressBar.progress.toInt()
            }

        } else {
            AlarmHelper.stopNotificationsAlarm(this)
            binding!!.badge.setText("0", true)
            binding!!.circularProgressBar.progress = 0f
        }
    }

    inner class ScreenSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(
        fm,
        FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {
        override fun getItem(position: Int): Fragment {
            var tp: Fragment? = null

            if (position == 0) {
                tp = PlanFragment.newInstance("", "")
            } else if (position == 1) {
                tp = ReportsFragment.newInstance("", "")
            } else {
                tp = MeFragment.newInstance("", "")
            }

            return tp
        }

        override fun getCount(): Int {
            return 3
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return ""
        }
    }

    override fun onResume() {
        super.onResume()
        if (!isAdDisplayed && isAdLoaded && !fromIntro) {
            appOpenAd?.let {
                it.show(this)
                isAdDisplayed = true // Mark the ad as displayed
            } ?: run {
                loadAppOpenAd() // If the ad is null, load it again
            }
        }
        fillWaterTracker()
    }

    open inner class BotomBarClickListener : BottomBarClickListener {
        override fun onTopBarClickListener(view: View?, value: String?) {

            if (value.equals(getString(R.string.plan))) {
                binding!!.bottombar.imgPlan.imageTintList = ColorStateList.valueOf( ContextCompat.getColor(
                    this@HomeActivity,
                    R.color.primary
                ))
//                binding!!.bottombar.tvPlan.setTextColor(
//                    ContextCompat.getColor(
//                        this@HomeActivity,
//                        R.color.primary
//                    )
//                )
                binding!!.bottombar.imgReports.imageTintList = ColorStateList.valueOf( ContextCompat.getColor(
                    this@HomeActivity,
                    R.color.gray_light_
                ))
//                binding!!.bottombar.tvReports.setTextColor(
//                    ContextCompat.getColor(
//                        this@HomeActivity,
//                        R.color.col_666
//                    )
//                )
                binding!!.bottombar.imgMe.imageTintList = ColorStateList.valueOf( ContextCompat.getColor(
                    this@HomeActivity,
                    R.color.gray_light_
                ))
//                binding!!.bottombar.tvMe.setTextColor(
//                    ContextCompat.getColor(
//                        this@HomeActivity,
//                        R.color.col_666
//                    )
//                )
                binding!!.pagerFragment.currentItem = 0
                binding!!.flWaterProgress.visibility = View.VISIBLE
                binding!!.tvTitle.text = getString(R.string.app_name)
            }

            if (value.equals(getString(R.string.reports))) {
                binding!!.bottombar.imgPlan.imageTintList = ColorStateList.valueOf( ContextCompat.getColor(
                    this@HomeActivity,
                    R.color.gray_light_
                ))
//                binding!!.bottombar.tvPlan.setTextColor(
//                    ContextCompat.getColor(
//                        this@HomeActivity,
//                        R.color.col_666
//                    )
//                )
                binding!!.bottombar.imgReports.imageTintList = ColorStateList.valueOf( ContextCompat.getColor(
                    this@HomeActivity,
                    R.color.primary
                ))
//                binding!!.bottombar.tvReports.setTextColor(
//                    ContextCompat.getColor(
//                        this@HomeActivity,
//                        R.color.primary
//                    )
//                )
                binding!!.bottombar.imgMe.imageTintList = ColorStateList.valueOf( ContextCompat.getColor(
                    this@HomeActivity,
                    R.color.gray_light_
                ))
//                binding!!.bottombar.tvMe.setTextColor(
//                    ContextCompat.getColor(
//                        this@HomeActivity,
//                        R.color.col_666
//                    )
//                )
                binding!!.pagerFragment.currentItem = 1
                binding!!.flWaterProgress.visibility = View.INVISIBLE
                binding!!.tvTitle.text = getString(R.string.reports)
            }

            if (value.equals(getString(R.string.me))) {
                binding!!.bottombar.imgPlan.imageTintList = ColorStateList.valueOf( ContextCompat.getColor(
                    this@HomeActivity,
                    R.color.gray_light_
                ))
//                binding!!.bottombar.tvPlan.setTextColor(
//                    ContextCompat.getColor(
//                        this@HomeActivity,
//                        R.color.col_666
//                    )
//                )
                binding!!.bottombar.imgReports.imageTintList = ColorStateList.valueOf( ContextCompat.getColor(
                    this@HomeActivity,
                    R.color.gray_light_
                ))
//                binding!!.bottombar.tvReports.setTextColor(
//                    ContextCompat.getColor(
//                        this@HomeActivity,
//                        R.color.col_666
//                    )
//                )
                binding!!.bottombar.imgMe.imageTintList = ColorStateList.valueOf( ContextCompat.getColor(
                    this@HomeActivity,
                    R.color.primary
                ))
//                binding!!.bottombar.tvMe.setTextColor(
//                    ContextCompat.getColor(
//                        this@HomeActivity,
//                        R.color.primary
//                    )
//                )
                binding!!.pagerFragment.currentItem = 2
                binding!!.flWaterProgress.visibility = View.INVISIBLE
                binding!!.tvTitle.text = getString(R.string.me)
            }
        }
    }

    inner class ClickHandler {

        fun onWaterTrackerClick() {
            if (Utils.getPref(this@HomeActivity, Constant.PREF_IS_WATER_TRACKER_ON, false)) {
                val i = Intent(this@HomeActivity, WaterTrackerActivity::class.java)
                startActivity(i)
            } else {
                val i = Intent(this@HomeActivity, TurnOnWaterActivity::class.java)
                startActivity(i)
            }
        }

    }

    override fun onBackPressed() {
        try {
            if (ExitStrategy.canExit()) {
                super.onBackPressed()
            } else {
                ExitStrategy.startExitDelay(2000)
                showToast(getString(R.string.exit_msg))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun callGetAdsId() {
        try {
            if (Utils.isInternetConnected(this)) {
                if (Constant.ENABLE_DISABLE == Constant.ENABLE && !Utils.isPurchased(this)) {
//                    Utils.setPref(this, Constant.GOOGLE_BANNER, Constant.GOOGLE_BANNER_ID)
//                    Utils.setPref(this, Constant.GOOGLE_INTERSTITIAL, Constant.GOOGLE_INTERSTITIAL_ID)
                    Utils.setPref(this, Constant.STATUS_ENABLE_DISABLE, Constant.ENABLE_DISABLE)
                    setAppAdId(Constant.GOOGLE_ADMOB_APP_ID)
                    Log.e("TAG", "callGetAdsId::::: "+Utils.isPurchased(this) )
                } else {
                    Utils.setPref(this, Constant.STATUS_ENABLE_DISABLE, Constant.ENABLE_DISABLE)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    fun setAppAdId(id: String?) {
        try {
            val applicationInfo =
                    packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)
            val bundle = applicationInfo.metaData
            val beforeChangeId = bundle.getString("com.google.android.gms.ads.APPLICATION_ID")
            Debug.e("TAG", "setAppAdId:BeforeChange:::::  $beforeChangeId")
            applicationInfo.metaData.putString("com.google.android.gms.ads.APPLICATION_ID", id)
            val AfterChangeId = bundle.getString("com.google.android.gms.ads.APPLICATION_ID")
            Debug.e("TAG", "setAppAdId:AfterChange::::  $AfterChangeId")
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        } catch (e: NullPointerException) {
            e.printStackTrace()
        }
    }

}
