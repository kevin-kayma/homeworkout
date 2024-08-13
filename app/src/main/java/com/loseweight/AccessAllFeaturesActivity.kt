package com.loseweight
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.android.billingclient.api.AcknowledgePurchaseParams
import com.android.billingclient.api.BillingClient
import com.android.billingclient.api.BillingClientStateListener
import com.android.billingclient.api.BillingFlowParams
import com.android.billingclient.api.BillingResult
import com.android.billingclient.api.Purchase
import com.android.billingclient.api.PurchasesUpdatedListener
import com.android.billingclient.api.QueryProductDetailsParams
import com.android.billingclient.api.QueryPurchasesParams
import com.loseweight.databinding.ActivityAccessAllFeatureBinding
import com.loseweight.utils.Constant
import com.loseweight.utils.Utils


class AccessAllFeaturesActivity : BaseActivity() {

    var binding: ActivityAccessAllFeatureBinding? = null
    private var skuDetail: String = Constant.LIFETIME_SKU
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
            binding!!.llPerLifetime.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity,R.drawable.btn_bg_round_theme_transparent)
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
            binding!!.llPerLifetime.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity,R.drawable.btn_bg_round_theme_transparent)
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
            binding!!.llPerLifetime.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity,R.drawable.btn_bg_round_theme_transparent)
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
            //lifetime
            binding!!.llPerLifetime.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity,R.drawable.btn_bg_round_border_theme)
            binding!!.tvLifetimeTitle.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )
            binding!!.tvLifetimePrice.setTextColor(
                ContextCompat.getColor(
                    this@AccessAllFeaturesActivity,
                    R.color.white
                )
            )

            //yearly
            binding!!.llPerYear.background = ContextCompat.getDrawable(this@AccessAllFeaturesActivity, R.drawable.btn_bg_round_theme_transparent)
            binding!!.tvYearlyTitle.setTextColor(
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
                            if(productType == BillingClient.ProductType.SUBS){
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
                            }else if(productType == BillingClient.ProductType.INAPP){
                                // No need to deal with offerToken for INAPP products
                                val productDetailsParamsList = listOf(
                                    BillingFlowParams.ProductDetailsParams.newBuilder()
                                        .setProductDetails(productDetails)
                                        .build()
                                )
                                val billingFlowParams = BillingFlowParams.newBuilder()
                                    .setProductDetailsParamsList(productDetailsParamsList)
                                    .build()
                                billingClient!!.launchBillingFlow(this@AccessAllFeaturesActivity, billingFlowParams)
                            }
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
                // Query Subscriptions
                billingClient!!.queryPurchasesAsync(
                    QueryPurchasesParams.newBuilder()
                        .setProductType(BillingClient.ProductType.SUBS)
                        .build()
                ) { subsResult, subsList ->
                    if (subsResult.responseCode == BillingClient.BillingResponseCode.OK) {
                        if (subsList.isNotEmpty()) {
                            for (purchaseData in subsList) {
                                if ((purchaseData.products.contains(Constant.MONTHLY_SKU)) ||
                                    (purchaseData.products.contains(Constant.YEARLY_SKU)) ||
                                    (purchaseData.products.contains(Constant.WEEKLY_SKU))
                                ) {
                                    isPurchasedSku = true
                                }

                                if (purchaseData.purchaseState == Purchase.PurchaseState.PURCHASED && !purchaseData.isAcknowledged) {
                                    val acknowledgePurchaseParams = AcknowledgePurchaseParams.newBuilder()
                                        .setPurchaseToken(purchaseData.purchaseToken)
                                        .build()
                                    billingClient!!.acknowledgePurchase(acknowledgePurchaseParams) { p0 ->
                                        Log.e("BillingResult ======>", p0.debugMessage)
                                    }
                                }
                            }
                        }
                    }

                    // Query In-App Purchases for LIFETIME_SKU
                    billingClient!!.queryPurchasesAsync(
                        QueryPurchasesParams.newBuilder()
                            .setProductType(BillingClient.ProductType.INAPP)
                            .build()
                    ) { inappResult, inappList ->
                        if (inappResult.responseCode == BillingClient.BillingResponseCode.OK) {
                            if (inappList.isNotEmpty()) {
                                for (purchaseData in inappList) {
                                    if (purchaseData.products.contains(Constant.LIFETIME_SKU)) {
                                        isPurchasedSku = true
                                    }

                                    if (purchaseData.purchaseState == Purchase.PurchaseState.PURCHASED && !purchaseData.isAcknowledged) {
                                        val acknowledgePurchaseParams = AcknowledgePurchaseParams.newBuilder()
                                            .setPurchaseToken(purchaseData.purchaseToken)
                                            .build()
                                        billingClient!!.acknowledgePurchase(acknowledgePurchaseParams) { p0 ->
                                            Log.e("BillingResult ======>", p0.debugMessage)
                                        }
                                    }
                                }
                            }
                        }

                        // Update purchase status and continue
                        Utils.setPref(this, Constant.PREF_KEY_PURCHASE_STATUS, isPurchasedSku)
                        getSKUDetails()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    @SuppressLint("SetTextI18n")
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
                                Constant.YEARLY_SKU -> {
                                    binding!!.tvYearlyApprox.text = thisResponse.subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0].formattedPrice
                                    binding!!.tvYearlyTitle.text = thisResponse.name
                                }
                                Constant.MONTHLY_SKU -> {
                                    val monthlyPrice = thisResponse.subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0].priceAmountMicros / 1_000_000.0
                                    val yearlyPriceFromMonthly = monthlyPrice * 12
                                    val currencySymbol = thisResponse.subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0].formattedPrice.takeWhile { it.isLetterOrDigit().not() } // Extract the currency symbol

                                    binding!!.tvMonthlyPrice.text = "${thisResponse.subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0].formattedPrice} / Month"
                                    binding!!.tvMonthlyApprox.text = "$currencySymbol${"%.2f".format(yearlyPriceFromMonthly)}"
                                    binding!!.tvMonthlyTitle.text = thisResponse.name
                                }
                                Constant.WEEKLY_SKU -> {
                                    val weeklyPrice = thisResponse.subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0].priceAmountMicros / 1_000_000.0
                                    val yearlyPriceFromWeekly = weeklyPrice * 52
                                    val currencySymbol = thisResponse.subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0].formattedPrice.takeWhile { it.isLetterOrDigit().not() } // Extract the currency symbol

                                    binding!!.tvWeeklyPrice.text = "${thisResponse.subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0].formattedPrice} / Week"
                                    binding!!.tvWeeklyApprox.text = "$currencySymbol${"%.2f".format(yearlyPriceFromWeekly)}"
                                    binding!!.tvWeeklyTitle.text = thisResponse.name
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
                        binding!!.tvLifetimePrice.text = productDetails.oneTimePurchaseOfferDetails!!.formattedPrice
                        binding!!.tvLifetimeTitle.text = productDetails.name
                    }
                }
            }
        }
    }
}
