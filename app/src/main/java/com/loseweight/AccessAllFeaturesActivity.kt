package com.loseweight

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.android.billingclient.api.*
import com.loseweight.databinding.ActivityAccessAllFeatureBinding
import com.loseweight.utils.Constant
import com.loseweight.utils.Utils


class AccessAllFeaturesActivity : BaseActivity() {

    var binding: ActivityAccessAllFeatureBinding? = null
    private var skuDetail: String = Constant.WEEKLY_SKU
    private var billingClient: BillingClient? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_access_all_feature)

        initIntentParam()
        init()
    }

    private fun initIntentParam() {
        try {


        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun init() {
        binding!!.handler = ClickHandler()
        initInAppPurchase()
    }


    override fun onResume() {
        super.onResume()
    }


    inner class ClickHandler {

        fun onBackClick() {
            finish()
        }

        fun onYearlyClick() {
            //yearly
            binding!!.llPerYear.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity, R.drawable.btn_bg_round_border_theme)
            binding!!.tvYearlyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvYearlyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvYearlyApprox.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvYearlyPerYear.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )

            //Lifetime
            binding!!.llPerLifetime.backgroundTintList =
                ContextCompat.getColorStateList(this@AccessAllFeaturesActivity, R.color.white)
            binding!!.tvLifetimePrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvLifetimeTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //monthly
            binding!!.llPerMonth.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity, R.drawable.btn_bg_round_theme_transparent)
            binding!!.tvMonthlyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvMonthlyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvMonthlyApprox.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvMonthlyPerYear.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //weekly
            binding!!.llPerWeek.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity, R.drawable.btn_bg_round_theme_transparent)
            binding!!.tvWeeklyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvWeeklyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvWeeklyApprox.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvWeeklyPerYear.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            skuDetail = Constant.YEARLY_SKU
        }

        fun onPerMonthClick() {
            //yearly
            binding!!.llPerYear.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity, R.drawable.btn_bg_round_theme_transparent)
            binding!!.tvYearlyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvYearlyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvYearlyApprox.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvYearlyPerYear.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //weekly
            binding!!.llPerWeek.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity, R.drawable.btn_bg_round_theme_transparent)
            binding!!.tvWeeklyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvWeeklyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvWeeklyApprox.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvWeeklyPerYear.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //Lifetime
            binding!!.llPerLifetime.backgroundTintList =
                ContextCompat.getColorStateList(this@AccessAllFeaturesActivity, R.color.white)
            binding!!.tvLifetimePrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvLifetimeTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //monthly
            binding!!.llPerMonth.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity, R.drawable.btn_bg_round_border_theme)
            binding!!.tvMonthlyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvMonthlyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvMonthlyApprox.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvMonthlyPerYear.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            skuDetail = Constant.MONTHLY_SKU
        }

        fun onWeeklyClick() {
            //yearly
            binding!!.llPerYear.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity, R.drawable.btn_bg_round_theme_transparent)
            binding!!.tvYearlyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvYearlyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvYearlyApprox.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvYearlyPerYear.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //monthly
            binding!!.llPerMonth.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity, R.drawable.btn_bg_round_theme_transparent)
            binding!!.tvMonthlyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvMonthlyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvMonthlyApprox.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvMonthlyPerYear.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //Lifetime
            binding!!.llPerLifetime.backgroundTintList =
                ContextCompat.getColorStateList(this@AccessAllFeaturesActivity, R.color.white)
            binding!!.tvLifetimePrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvLifetimeTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //weekly
            binding!!.llPerWeek.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity, R.drawable.btn_bg_round_border_theme)
            binding!!.tvWeeklyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvWeeklyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvWeeklyApprox.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvWeeklyPerYear.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            skuDetail = Constant.WEEKLY_SKU
        }

        fun onLifetimeClick() {
            //yearly
            binding!!.llPerYear.backgroundTintList =
                ContextCompat.getColorStateList(this@AccessAllFeaturesActivity, R.color.white)
            binding!!.tvYearlyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvYearlyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //monthly
            binding!!.llPerMonth.backgroundTintList =
                ContextCompat.getColorStateList(this@AccessAllFeaturesActivity, R.color.white)
            binding!!.tvMonthlyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvMonthlyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //weekly
            binding!!.llPerWeek.backgroundTintList =
                ContextCompat.getColorStateList(this@AccessAllFeaturesActivity, R.color.white)
            binding!!.tvWeeklyPrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )
            binding!!.tvWeeklyTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.col_999
                )
            )

            //Lifetime
            binding!!.llPerLifetime.backgroundTintList =
                ContextCompat.getColorStateList(this@AccessAllFeaturesActivity, R.color.primary)
            binding!!.tvLifetimePrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvLifetimeTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            skuDetail = Constant.LIFETIME_SKU
        }
        fun onContinueClick() {
            if(skuDetail == Constant.WEEKLY_SKU || skuDetail == Constant.MONTHLY_SKU || skuDetail == Constant.YEARLY_SKU){
                onPurchaseClick(skuDetail, BillingClient.ProductType.SUBS)
            }else{
                onPurchaseClick(skuDetail, BillingClient.ProductType.INAPP)
            }
        }
    }

    private fun onPurchaseClick(SKU: String, productType: String) {
        billingClient!!.startConnection(object : BillingClientStateListener {
            override fun onBillingServiceDisconnected() {

            }

            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if(billingResult.responseCode ==BillingClient.BillingResponseCode.OK){
                    val productList = listOf(
                        QueryProductDetailsParams.Product.newBuilder()
                            .setProductId(SKU)
                            .setProductType(productType)
                            .build()
                    )
                    val param = QueryProductDetailsParams.newBuilder()
                        .setProductList(productList)

                    billingClient!!.queryProductDetailsAsync(param.build()){
                            _,
                            productDetailsList ->
                        for (productDetails in productDetailsList){
                            val offerToken = productDetails.subscriptionOfferDetails!![0].offerToken
                            val productDetailsParamsList = listOf(
                                offerToken?.let {
                                    BillingFlowParams.ProductDetailsParams.newBuilder()
                                        .setProductDetails(productDetails)
                                        .setOfferToken(it)
                                        .build()
                                }
                            )
                            val billingFlowParams = BillingFlowParams.newBuilder()
                                .setProductDetailsParamsList(productDetailsParamsList)
                                .build()
                            billingClient!!.launchBillingFlow(this@AccessAllFeaturesActivity, billingFlowParams)
                        }
                    }
                }
            }
        })
    }


    private fun initInAppPurchase() {
        try {
            billingClient = BillingClient.newBuilder(this).setListener(purchaseUpdateListener)
                .enablePendingPurchases().build()
            billingClient!!.startConnection(object : BillingClientStateListener {
                override fun onBillingServiceDisconnected() {
                    Log.e("TAG", "onBillingServiceDisconnected::::: ")
                }
                override fun onBillingSetupFinished(p0: BillingResult) {
                    Log.e("TAG", "onBillingSetupFinished:::: " + p0.debugMessage)
                    checkSubscriptionList()
                }
            })
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    private val purchaseUpdateListener: PurchasesUpdatedListener =
        PurchasesUpdatedListener { billingResult, _ ->
            try {
                if (billingResult.responseCode != BillingClient.BillingResponseCode.OK) {
                    if (billingResult.responseCode == BillingClient.BillingResponseCode.ITEM_ALREADY_OWNED) {
                        Utils.setPref(this, Constant.PREF_KEY_PURCHASE_STATUS, true)
                        startActivity(Intent(this, HomeActivity::class.java))
                        finish()
                    }
                } else {
                    Utils.setPref(this, Constant.PREF_KEY_PURCHASE_STATUS, true)
                    val intent = Intent(getActivity(), HomeActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                    startActivity(intent)
                    finish()
                }
                checkSubscriptionList()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

    private fun checkSubscriptionList() {
        if (billingClient != null) {
            var isPurchasedSku = false
            try {
                billingClient!!.queryPurchasesAsync(
                    QueryPurchasesParams.newBuilder()
                        .setProductType(BillingClient.ProductType.SUBS)
                        .build()
                ) { purchasesResult, purchaseList ->
                    if (purchasesResult.responseCode == 0) {

                        if (purchaseList.isNotEmpty()) {
                            for (i in 0 until purchaseList.size) {
                                val purchaseData = purchaseList[i]
                                if ((purchaseData.products.contains(Constant.MONTHLY_SKU)) || (purchaseData.products.contains(Constant.YEARLY_SKU)) || (purchaseData.products.contains(Constant.WEEKLY_SKU))) {
                                    isPurchasedSku = true
                                }

                                if (purchaseData.purchaseState == Purchase.PurchaseState.PURCHASED) {
                                    if (!purchaseData.isAcknowledged) {
                                        val acknowledgePurchaseParams =
                                            AcknowledgePurchaseParams.newBuilder()
                                                .setPurchaseToken(purchaseData.purchaseToken)
                                        billingClient!!.acknowledgePurchase(
                                            acknowledgePurchaseParams.build()
                                        ) { p0 ->
                                            Log.e("BillingResult ======>", p0.debugMessage)
                                        }
                                    }
                                }
                            }
                        }
                        Utils.setPref(this, Constant.PREF_KEY_PURCHASE_STATUS, isPurchasedSku)
                        getSKUDetails()
                    }
                }
            } catch (e: java.lang.Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun getSKUDetails() {
        val productListMonth =
            listOf(
                QueryProductDetailsParams.Product.newBuilder()
                    .setProductId(Constant.MONTHLY_SKU)
                    .setProductType(BillingClient.ProductType.SUBS)
                    .build(),
                QueryProductDetailsParams.Product.newBuilder()
                    .setProductId(Constant.YEARLY_SKU)
                    .setProductType(BillingClient.ProductType.SUBS)
                    .build(),
                QueryProductDetailsParams.Product.newBuilder()
                    .setProductId(Constant.WEEKLY_SKU)
                    .setProductType(BillingClient.ProductType.SUBS)
                    .build(),
            )

        val paramsNewMonth = QueryProductDetailsParams.newBuilder().setProductList(productListMonth)

        billingClient!!.queryProductDetailsAsync(paramsNewMonth.build()) { billingResult,
                                                                           skuDetailsList ->
            if (billingResult.responseCode == 0 && skuDetailsList.isNotEmpty()) {
                for (thisResponse in skuDetailsList) {
                    try {
                        runOnUiThread {
                            when (thisResponse.productId) {
                                Constant.MONTHLY_SKU -> {
                                    binding!!.tvMonthlyPrice.text = "${thisResponse.subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0].formattedPrice} / Month"
                                }
                                Constant.YEARLY_SKU -> {
                                    binding!!.tvYearlyPrice.text = "${thisResponse.subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0].formattedPrice} / Yearly"
                                }
                                Constant.WEEKLY_SKU -> {
                                    binding!!.tvWeeklyPrice.text = "${thisResponse.subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0].formattedPrice} / Weekly"
                                }
                            }
                        }
                    } catch (e: java.lang.Exception) {
                        e.printStackTrace()
                    }
                }
            }
        }
        val params = QueryProductDetailsParams.newBuilder()
            .setProductList(
                listOf(
                    QueryProductDetailsParams.Product.newBuilder()
                        .setProductId(Constant.LIFETIME_SKU)
                        .setProductType(BillingClient.ProductType.INAPP)
                        .build()
                )
            ).build()
        billingClient!!.queryProductDetailsAsync(params) { billingResult, productDetailsList ->
            if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                if (productDetailsList.isNotEmpty()) {
                    val productDetails = productDetailsList[0]
                    runOnUiThread {
                        binding!!.tvLifetimePrice.text = "${productDetails.oneTimePurchaseOfferDetails!!.formattedPrice} / Lifetime"
                    }
                }
            }
        }
    }
}
