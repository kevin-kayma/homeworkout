package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\f"}, d2 = {"Lcom/loseweight/utils/ApiResponseHandler;", "Lokhttp3/Callback;", "()V", "onFailure", "", "e", "", "content", "", "onFinish", "onStart", "onSuccess", "app_debug"})
public abstract class ApiResponseHandler implements okhttp3.Callback {
    
    public ApiResponseHandler() {
        super();
    }
    
    public abstract void onStart();
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull
    java.lang.String content);
    
    public abstract void onFinish();
    
    public abstract void onFailure(@org.jetbrains.annotations.NotNull
    java.lang.Throwable e, @org.jetbrains.annotations.NotNull
    java.lang.String content);
}