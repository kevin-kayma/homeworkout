// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.loseweight.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PopupLogoutBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout llContainer;

  protected PopupLogoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout llContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llContainer = llContainer;
  }

  @NonNull
  public static PopupLogoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.popup_logout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PopupLogoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PopupLogoutBinding>inflateInternal(inflater, R.layout.popup_logout, root, attachToRoot, component);
  }

  @NonNull
  public static PopupLogoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.popup_logout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PopupLogoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PopupLogoutBinding>inflateInternal(inflater, R.layout.popup_logout, null, false, component);
  }

  public static PopupLogoutBinding bind(@NonNull View view) {
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
  public static PopupLogoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (PopupLogoutBinding)bind(component, view, R.layout.popup_logout);
  }
}
