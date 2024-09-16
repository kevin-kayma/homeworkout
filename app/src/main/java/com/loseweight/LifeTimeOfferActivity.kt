package com.loseweight

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.style.StrikethroughSpan
import android.util.Log
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
import com.loseweight.databinding.ActivityLifeTimeOfferBinding
import com.loseweight.utils.Constant
import com.loseweight.utils.Utils

class LifeTimeOfferActivity : BaseActivity() {
    var binding: ActivityLifeTimeOfferBinding? = null
    private var skuDetail: String = Constant.LIFETIME_SKU
    private var billingClient: BillingClient? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_life_time_offer)
        // Set strike-through on the text
        val priceText = "$59.99 "
        val content = SpannableString(priceText)
        content.setSpan(StrikethroughSpan(), 0, content.length, 0)

        // Apply the SpannableString to the TextView
        binding!!.strikeText.text = content
        init()
    }

    private fun init() {
        binding!!.handler = ClickHandler()
        initInAppPurchase()
    }

    inner class ClickHandler{
        fun onBackClick() {
            if(intent.getBooleanExtra("fromIntro", false)){
                val intent = Intent(this@LifeTimeOfferActivity, ActivityReviewPrompt::class.java)
                startActivity(intent)
                finish()
            }else{
                finish()
            }
        }
        fun onContinueClick() {
            onPurchaseClick(skuDetail, BillingClient.ProductType.INAPP)
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
                           if(productType == BillingClient.ProductType.INAPP){
                                // No need to deal with offerToken for INAPP products
                                val productDetailsParamsList = listOf(
                                    BillingFlowParams.ProductDetailsParams.newBuilder()
                                        .setProductDetails(productDetails)
                                        .build()
                                )
                                val billingFlowParams = BillingFlowParams.newBuilder()
                                    .setProductDetailsParamsList(productDetailsParamsList)
                                    .build()
                                billingClient!!.launchBillingFlow(this@LifeTimeOfferActivity, billingFlowParams)
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
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun getSKUDetails() {
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
                        binding!!.lifeTimePrice.text = productDetails.oneTimePurchaseOfferDetails!!.formattedPrice
                    }
                }
            }
        }
    }
}