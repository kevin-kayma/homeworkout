// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.common.view.CEditTextView;
import com.common.view.CTextView;
import com.github.jhonnyx2012.horizontalpicker.HorizontalPicker;
import com.loseweight.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogWeightWithDateBinding extends ViewDataBinding {
  @NonNull
  public final HorizontalPicker dtpWeightSet;

  @NonNull
  public final CEditTextView editWeight;

  @NonNull
  public final CTextView tvKG;

  @NonNull
  public final CTextView tvLB;

  protected DialogWeightWithDateBinding(Object _bindingComponent, View _root, int _localFieldCount,
      HorizontalPicker dtpWeightSet, CEditTextView editWeight, CTextView tvKG, CTextView tvLB) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dtpWeightSet = dtpWeightSet;
    this.editWeight = editWeight;
    this.tvKG = tvKG;
    this.tvLB = tvLB;
  }

  @NonNull
  public static DialogWeightWithDateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_weight_with_date, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogWeightWithDateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogWeightWithDateBinding>inflateInternal(inflater, R.layout.dialog_weight_with_date, root, attachToRoot, component);
  }

  @NonNull
  public static DialogWeightWithDateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_weight_with_date, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogWeightWithDateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogWeightWithDateBinding>inflateInternal(inflater, R.layout.dialog_weight_with_date, null, false, component);
  }

  public static DialogWeightWithDateBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static DialogWeightWithDateBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogWeightWithDateBinding)bind(component, view, R.layout.dialog_weight_with_date);
  }
}