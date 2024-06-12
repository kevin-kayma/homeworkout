// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.common.view.CMTextView;
import com.loseweight.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogTestVoiceFailBinding extends ViewDataBinding {
  @NonNull
  public final CMTextView tvDownloadTTSEngine;

  @NonNull
  public final CMTextView tvSelectTTSEngine;

  protected DialogTestVoiceFailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CMTextView tvDownloadTTSEngine, CMTextView tvSelectTTSEngine) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvDownloadTTSEngine = tvDownloadTTSEngine;
    this.tvSelectTTSEngine = tvSelectTTSEngine;
  }

  @NonNull
  public static DialogTestVoiceFailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_test_voice_fail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogTestVoiceFailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogTestVoiceFailBinding>inflateInternal(inflater, R.layout.dialog_test_voice_fail, root, attachToRoot, component);
  }

  @NonNull
  public static DialogTestVoiceFailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_test_voice_fail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogTestVoiceFailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogTestVoiceFailBinding>inflateInternal(inflater, R.layout.dialog_test_voice_fail, null, false, component);
  }

  public static DialogTestVoiceFailBinding bind(@NonNull View view) {
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
  public static DialogTestVoiceFailBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogTestVoiceFailBinding)bind(component, view, R.layout.dialog_test_voice_fail);
  }
}
