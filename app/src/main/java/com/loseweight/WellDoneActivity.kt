package com.loseweight

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.loseweight.databinding.ActivityWellDoneBinding
import com.loseweight.utils.Constant


class WellDoneActivity : BaseActivity() {
    val TAG = WellDoneActivity::class.java.name + Constant.ARROW

    var binding: ActivityWellDoneBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_well_done)
        init()
    }


    private fun init() {

        binding!!.btnNext.setOnClickListener {
            val intent = Intent(getActivity(), HomeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
        }

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
