// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.loseweight.R;
import com.shawnlin.numberpicker.NumberPicker;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogDobBinding extends ViewDataBinding {
  @NonNull
  public final NumberPicker npDay;

  @NonNull
  public final NumberPicker npMonth;

  @NonNull
  public final NumberPicker npYear;

  protected DialogDobBinding(Object _bindingComponent, View _root, int _localFieldCount,
      NumberPicker npDay, NumberPicker npMonth, NumberPicker npYear) {
    super(_bindingComponent, _root, _localFieldCount);
    this.npDay = npDay;
    this.npMonth = npMonth;
    this.npYear = npYear;
  }

  @NonNull
  public static DialogDobBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_dob, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogDobBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogDobBinding>inflateInternal(inflater, R.layout.dialog_dob, root, attachToRoot, component);
  }

  @NonNull
  public static DialogDobBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_dob, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogDobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogDobBinding>inflateInternal(inflater, R.layout.dialog_dob, null, false, component);
  }

  public static DialogDobBinding bind(@NonNull View view) {
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
  public static DialogDobBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogDobBinding)bind(component, view, R.layout.dialog_dob);
  }
}