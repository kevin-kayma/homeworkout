package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/loseweight/utils/CarouselEffectTransformer;", "Landroidx/viewpager/widget/ViewPager$PageTransformer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "maxTranslateOffsetX", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "dp2px", "dipValue", "", "transformPage", "", "view", "Landroid/view/View;", "position", "app_release"})
public final class CarouselEffectTransformer implements androidx.viewpager.widget.ViewPager.PageTransformer {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final int maxTranslateOffsetX = 0;
    @org.jetbrains.annotations.Nullable
    private androidx.viewpager.widget.ViewPager viewPager;
    
    public CarouselEffectTransformer(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public void transformPage(@org.jetbrains.annotations.NotNull
    android.view.View view, float position) {
    }
    
    /**
     * Dp to pixel conversion
     */
    private final int dp2px(android.content.Context context, float dipValue) {
        return 0;
    }
}