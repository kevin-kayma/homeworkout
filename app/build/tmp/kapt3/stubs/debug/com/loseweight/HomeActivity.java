package com.loseweight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003$%&B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0015J\b\u0010\u001e\u001a\u00020\u0015H\u0014J\u0010\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u0015J\b\u0010#\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/loseweight/HomeActivity;", "Lcom/loseweight/BaseActivity;", "()V", "appOpenAd", "Lcom/google/android/gms/ads/appopen/AppOpenAd;", "appOpenAdLoadCallback", "Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;", "binding", "Lcom/loseweight/databinding/ActivityHomeBinding;", "getBinding", "()Lcom/loseweight/databinding/ActivityHomeBinding;", "setBinding", "(Lcom/loseweight/databinding/ActivityHomeBinding;)V", "fromIntro", "", "isAdDisplayed", "isAdLoaded", "isFirstLaunched", "pagerAdapter", "Lcom/loseweight/HomeActivity$ScreenSlidePagerAdapter;", "callGetAdsId", "", "fillWaterTracker", "init", "initIntentParam", "loadAppOpenAd", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setAppAdId", "id", "", "startapp", "subScribeToFirebaseTopic", "BotomBarClickListener", "ClickHandler", "ScreenSlidePagerAdapter", "app_debug"})
public final class HomeActivity extends com.loseweight.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.loseweight.databinding.ActivityHomeBinding binding;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.HomeActivity.ScreenSlidePagerAdapter pagerAdapter;
    @org.jetbrains.annotations.Nullable
    private com.google.android.gms.ads.appopen.AppOpenAd appOpenAd;
    private boolean isAdDisplayed = false;
    private boolean isAdLoaded = false;
    private boolean fromIntro = false;
    private boolean isFirstLaunched = false;
    @org.jetbrains.annotations.NotNull
    private final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = null;
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.databinding.ActivityHomeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.loseweight.databinding.ActivityHomeBinding p0) {
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadAppOpenAd() {
    }
    
    public final void startapp() {
    }
    
    private final void initIntentParam() {
    }
    
    private final void init() {
    }
    
    private final void subScribeToFirebaseTopic() {
    }
    
    public final void fillWaterTracker() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    private final void callGetAdsId() {
    }
    
    public final void setAppAdId(@org.jetbrains.annotations.Nullable
    java.lang.String id) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0096\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/HomeActivity$BotomBarClickListener;", "Lcom/loseweight/interfaces/BottomBarClickListener;", "(Lcom/loseweight/HomeActivity;)V", "onTopBarClickListener", "", "view", "Landroid/view/View;", "value", "", "app_debug"})
    public class BotomBarClickListener implements com.loseweight.interfaces.BottomBarClickListener {
        
        public BotomBarClickListener() {
            super();
        }
        
        @java.lang.Override
        public void onTopBarClickListener(@org.jetbrains.annotations.Nullable
        android.view.View view, @org.jetbrains.annotations.Nullable
        java.lang.String value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/loseweight/HomeActivity$ClickHandler;", "", "(Lcom/loseweight/HomeActivity;)V", "onWaterTrackerClick", "", "app_debug"})
    public final class ClickHandler {
        
        public ClickHandler() {
            super();
        }
        
        public final void onWaterTrackerClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/loseweight/HomeActivity$ScreenSlidePagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Lcom/loseweight/HomeActivity;Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getPageTitle", "", "app_debug"})
    public final class ScreenSlidePagerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
        
        public ScreenSlidePagerAdapter(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fm) {
            super(null);
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public androidx.fragment.app.Fragment getItem(int position) {
            return null;
        }
        
        @java.lang.Override
        public int getCount() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.Nullable
        public java.lang.CharSequence getPageTitle(int position) {
            return null;
        }
    }
}