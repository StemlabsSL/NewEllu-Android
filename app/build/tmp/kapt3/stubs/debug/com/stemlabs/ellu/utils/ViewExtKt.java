package com.stemlabs.ellu.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0006\u001a.\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u000e\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e\u001a.\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\f2\u0006\u0010\u000f\u001a\u00020\u000e\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0017\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0018"}, d2 = {"hideKeyboard", "", "Landroid/view/View;", "setTextFutureExt", "Landroidx/appcompat/widget/AppCompatEditText;", "text", "", "Landroidx/appcompat/widget/AppCompatTextView;", "setupSnackbar", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "snackbarEvent", "Landroidx/lifecycle/LiveData;", "Lcom/stemlabs/ellu/utils/Event;", "", "timeLength", "showKeyboard", "showSnackbar", "snackbarText", "showToast", "", "toGone", "toInvisible", "toVisible", "app_debug"})
public final class ViewExtKt {
    
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showKeyboard) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideKeyboard) {
    }
    
    public static final void toVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toVisible) {
    }
    
    public static final void toGone(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toGone) {
    }
    
    public static final void toInvisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toInvisible) {
    }
    
    /**
     * Transforms static java function Snackbar.make() to an extension function on View.
     */
    public static final void showSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showSnackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String snackbarText, int timeLength) {
    }
    
    /**
     * Triggers a snackbar message when the value contained by snackbarTaskMessageLiveEvent is modified.
     */
    public static final void setupSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setupSnackbar, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.stemlabs.ellu.utils.Event<java.lang.Integer>> snackbarEvent, int timeLength) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showToast, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.stemlabs.ellu.utils.Event<java.lang.Object>> snackbarEvent, int timeLength) {
    }
    
    public static final void setTextFutureExt(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView $this$setTextFutureExt, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public static final void setTextFutureExt(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText $this$setTextFutureExt, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
}