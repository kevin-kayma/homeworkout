package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAccessAllFeatureBindingImpl extends ActivityAccessAllFeatureBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvDes, 7);
        sViewsWithIds.put(R.id.llPerWeek, 8);
        sViewsWithIds.put(R.id.tvWeeklyTitle, 9);
        sViewsWithIds.put(R.id.tvWeeklyPrice, 10);
        sViewsWithIds.put(R.id.tvWeeklyApprox, 11);
        sViewsWithIds.put(R.id.tvWeeklyPerYear, 12);
        sViewsWithIds.put(R.id.llPerMonth, 13);
        sViewsWithIds.put(R.id.tvMonthlyTitle, 14);
        sViewsWithIds.put(R.id.tvMonthlyPrice, 15);
        sViewsWithIds.put(R.id.tvMonthlyApprox, 16);
        sViewsWithIds.put(R.id.tvMonthlyPerYear, 17);
        sViewsWithIds.put(R.id.llPerYear, 18);
        sViewsWithIds.put(R.id.tvYearlyTitle, 19);
        sViewsWithIds.put(R.id.tvYearlyApprox, 20);
        sViewsWithIds.put(R.id.tvYearlyPerYear, 21);
        sViewsWithIds.put(R.id.llPerLifetime, 22);
        sViewsWithIds.put(R.id.tvLifetimeTitle, 23);
        sViewsWithIds.put(R.id.tvLifetimePrice, 24);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView3;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView4;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAccessAllFeatureBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ActivityAccessAllFeatureBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.common.view.CBButtonView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[18]
            , (com.common.view.CTextView) bindings[7]
            , (com.common.view.CBTextView) bindings[24]
            , (com.common.view.CBTextView) bindings[23]
            , (com.common.view.CBTextView) bindings[16]
            , (com.common.view.CTextView) bindings[17]
            , (com.common.view.CTextView) bindings[15]
            , (com.common.view.CBTextView) bindings[14]
            , (com.common.view.CBTextView) bindings[11]
            , (com.common.view.CTextView) bindings[12]
            , (com.common.view.CTextView) bindings[10]
            , (com.common.view.CBTextView) bindings[9]
            , (com.common.view.CBTextView) bindings[20]
            , (com.common.view.CTextView) bindings[21]
            , (com.common.view.CBTextView) bindings[19]
            );
        this.btnContinue.setTag(null);
        this.imgBack.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback33 = new com.loseweight.generated.callback.OnClickListener(this, 6);
        mCallback29 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback30 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback28 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        mCallback32 = new com.loseweight.generated.callback.OnClickListener(this, 5);
        mCallback31 = new com.loseweight.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.handler == variableId) {
            setHandler((com.loseweight.AccessAllFeaturesActivity.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.AccessAllFeaturesActivity.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnContinue.setOnClickListener(mCallback33);
            this.imgBack.setOnClickListener(mCallback28);
            this.mboundView2.setOnClickListener(mCallback29);
            this.mboundView3.setOnClickListener(mCallback30);
            this.mboundView4.setOnClickListener(mCallback31);
            this.mboundView5.setOnClickListener(mCallback32);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // handler
                com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onContinueClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onWeeklyClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onPerMonthClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onBackClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handler
                com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onLifetimeClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onYearlyClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}