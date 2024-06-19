package com.loseweight.utils

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.facebook.ads.Ad
import com.facebook.ads.InterstitialAdListener
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import com.loseweight.interfaces.AdsCallback


object CommonConstantAd {

    fun loadBannerGoogleAd(context: Context, llAdview: RelativeLayout, adId: String, type: String) {

        try {
            val adViewBottom = AdView(context)
            if (type == "GOOGLE_BANNER_TYPE_AD") {
                adViewBottom.setAdSize(AdSize.BANNER)
            } else if (type == "GOOGLE_RECTANGLE_BANNER_TYPE_AD") {
                adViewBottom.setAdSize(AdSize.MEDIUM_RECTANGLE)
            }
            adViewBottom.adUnitId = adId
            llAdview.addView(adViewBottom)
            val adRequest = AdRequest.Builder().build()
            adViewBottom.loadAd(adRequest)
            adViewBottom.adListener = object : AdListener() {
                override fun onAdLoaded() {
                    adViewBottom.visibility = View.VISIBLE
                    llAdview.visibility = View.VISIBLE
                    Log.e("TAG", "onAdLoaded:::Google Ad::: ")
                }

                override fun onAdFailedToLoad(p0: LoadAdError) {
                    llAdview.visibility = View.GONE
                    Log.e("TAG", "onAdFailedToLoad:::Google Ad::: $p0")
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    fun loadFbAdFacebook(context: Context, banner_container: LinearLayout, adId: String,adType:String) {

        Log.e("TAG", "loadFbAdFacebook::::::::::: ")
        var adView: com.facebook.ads.AdView? = null
        adView = com.facebook.ads.AdView(context, adId, com.facebook.ads.AdSize.BANNER_HEIGHT_50)



        banner_container.addView(adView)

        val adListener: com.facebook.ads.AdListener = object : com.facebook.ads.AdListener {
            override fun onError(ad: Ad?, adError: com.facebook.ads.AdError) {
                // Ad error callback
                Log.e("TAG", "onError:Fb:::: ${adError.errorMessage}  ${adError.errorCode}")
                banner_container.visibility = View.GONE
            }

            override fun onAdLoaded(ad: Ad?) {
                // Ad loaded callback
                Log.e("TAG", "onAdLoaded:::::: ")
                banner_container.visibility = View.VISIBLE
            }

            override fun onAdClicked(ad: Ad?) {
                // Ad clicked callback
            }

            override fun onLoggingImpression(ad: Ad?) {
                // Ad impression logged callback
            }


        }

        adView.loadAd(adView.buildLoadAdConfig().withAdListener(adListener).build())
    }


    private fun getAdRequest(): AdRequest {
        return AdRequest.Builder().build()
    }


    /*Google Full Ad*/


    var mInterstitialAd: InterstitialAd? = null
    fun googlebeforloadAd(context: Context,adId:String) {

        try {
            InterstitialAd.load(
                context, adId, getAdRequest(),
                object : InterstitialAdLoadCallback() {
                    override fun onAdFailedToLoad(adError: LoadAdError) {
                        Log.e("TAG ERRRR:::: ", adError.message)
                        mInterstitialAd = null
                    }

                    override fun onAdLoaded(interstitialAd: InterstitialAd) {
                        Log.e("TAG", "Ad was loaded.")
                        mInterstitialAd = interstitialAd
                    }
                }
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
    fun showInterstitialAdsGoogle(context: Context,adsCallback: AdsCallback) {

        try {
            if (mInterstitialAd != null) {
                mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback() {
                    override fun onAdDismissedFullScreenContent() {
                        Log.d("TAG", "Ad was dismissed.")
                        // Don't forget to set the ad reference to null so you
                        // don't show the ad a second time.
                        mInterstitialAd = null
                        adsCallback.startNextScreen()

                    }

                    override fun onAdFailedToShowFullScreenContent(adError: AdError) {
                        Log.d("TAG", "Ad failed to show.")
                        // Don't forget to set the ad reference to null so you
                        // don't show the ad a second time.
                        mInterstitialAd = null
                        adsCallback.startNextScreen()
                    }

                    override fun onAdShowedFullScreenContent() {
                        Log.d("TAG", "Ad showed fullscreen content.")
                        // Called when ad is dismissed.
//                        adsCallback.onLoaded()
                    }
                }
                mInterstitialAd?.show(context as Activity)
            } else {
                Log.e("TAG", "showInterstitialAdsGoogle:::::NOT LOADED:::::  " )
                adsCallback.startNextScreen()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    /*Google Full Ad*/
    var mRewardedAd: RewardedAd? = null
    fun loadRewardedAdGoogle(context: Context) {

        try {


            RewardedAd.load(
                context, "ca-app-pub-8360405123776241/2724481042", getAdRequest(),
                object : RewardedAdLoadCallback() {
                    override fun onAdFailedToLoad(adError: LoadAdError) {
                        Log.e("TAG ERRRR:::: ", adError.message)
                        mRewardedAd = null
                    }

                    override fun onAdLoaded(rewardedAd: RewardedAd) {
                        Log.e("TAG", "Ad was loaded.")
                        mRewardedAd = rewardedAd
                    }
                }
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
    fun showRewardedAdGoogle(context: Context,adsCallback: AdsCallback) {

        try {
            if (mRewardedAd != null) {
                mRewardedAd?.fullScreenContentCallback = object : FullScreenContentCallback() {
                    override fun onAdDismissedFullScreenContent() {
                        Log.d("TAG", "Ad was dismissed.")
                        // Don't forget to set the ad reference to null so you
                        // don't show the ad a second time.
                        mInterstitialAd = null
                        adsCallback.adClose()

                    }

                    override fun onAdFailedToShowFullScreenContent(adError: AdError) {
                        Log.d("TAG", "Ad failed to show.")
                        // Don't forget to set the ad reference to null so you
                        // don't show the ad a second time.
                        mInterstitialAd = null
                        adsCallback.adClose()
                    }

                    override fun onAdShowedFullScreenContent() {
                        Log.d("TAG", "Ad showed fullscreen content.")
                        // Called when ad is dismissed.
//                        adsCallback.onLoaded()
                    }
                }
                mRewardedAd?.show(context as Activity) { adsCallback.startNextScreen() }
            } else {
                Log.e("TAG", "showInterstitialAdsGoogle:::::NOT LOADED:::::  " )
                adsCallback.startNextScreen()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

}
