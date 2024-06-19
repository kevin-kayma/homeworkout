package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J&\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016J&\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/loseweight/utils/CommonConstantAd;", "", "()V", "mInterstitialAd", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "getMInterstitialAd", "()Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "setMInterstitialAd", "(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V", "mRewardedAd", "Lcom/google/android/gms/ads/rewarded/RewardedAd;", "getMRewardedAd", "()Lcom/google/android/gms/ads/rewarded/RewardedAd;", "setMRewardedAd", "(Lcom/google/android/gms/ads/rewarded/RewardedAd;)V", "getAdRequest", "Lcom/google/android/gms/ads/AdRequest;", "googlebeforloadAd", "", "context", "Landroid/content/Context;", "adId", "", "loadBannerGoogleAd", "llAdview", "Landroid/widget/RelativeLayout;", "type", "loadFbAdFacebook", "banner_container", "Landroid/widget/LinearLayout;", "adType", "loadRewardedAdGoogle", "showInterstitialAdsGoogle", "adsCallback", "Lcom/loseweight/interfaces/AdsCallback;", "showRewardedAdGoogle", "app_debug"})
public final class CommonConstantAd {
    @org.jetbrains.annotations.Nullable
    private static com.google.android.gms.ads.interstitial.InterstitialAd mInterstitialAd;
    @org.jetbrains.annotations.Nullable
    private static com.google.android.gms.ads.rewarded.RewardedAd mRewardedAd;
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.utils.CommonConstantAd INSTANCE = null;
    
    private CommonConstantAd() {
        super();
    }
    
    public final void loadBannerGoogleAd(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.widget.RelativeLayout llAdview, @org.jetbrains.annotations.NotNull
    java.lang.String adId, @org.jetbrains.annotations.NotNull
    java.lang.String type) {
    }
    
    public final void loadFbAdFacebook(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.widget.LinearLayout banner_container, @org.jetbrains.annotations.NotNull
    java.lang.String adId, @org.jetbrains.annotations.NotNull
    java.lang.String adType) {
    }
    
    private final com.google.android.gms.ads.AdRequest getAdRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.android.gms.ads.interstitial.InterstitialAd getMInterstitialAd() {
        return null;
    }
    
    public final void setMInterstitialAd(@org.jetbrains.annotations.Nullable
    com.google.android.gms.ads.interstitial.InterstitialAd p0) {
    }
    
    public final void googlebeforloadAd(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String adId) {
    }
    
    public final void showInterstitialAdsGoogle(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.loseweight.interfaces.AdsCallback adsCallback) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.android.gms.ads.rewarded.RewardedAd getMRewardedAd() {
        return null;
    }
    
    public final void setMRewardedAd(@org.jetbrains.annotations.Nullable
    com.google.android.gms.ads.rewarded.RewardedAd p0) {
    }
    
    public final void loadRewardedAdGoogle(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void showRewardedAdGoogle(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.loseweight.interfaces.AdsCallback adsCallback) {
    }
}