package com.stemlabs.ellu.ui.component.chat.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "listener", "Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog$OnClickChatPopUp;", "getListener", "()Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog$OnClickChatPopUp;", "setListener", "(Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog$OnClickChatPopUp;)V", "viewPager", "Landroid/view/View;", "getViewPager", "()Landroid/view/View;", "setViewPager", "(Landroid/view/View;)V", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setChatPopUpListener", "setupDialog", "dialog", "Landroid/app/Dialog;", "style", "", "OnClickChatPopUp", "app_debug"})
public final class PagerDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public android.view.View viewPager;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog.OnClickChatPopUp listener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getViewPager() {
        return null;
    }
    
    public final void setViewPager(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setupDialog(@org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog, int style) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog.OnClickChatPopUp getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog.OnClickChatPopUp p0) {
    }
    
    public final void setChatPopUpListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog.OnClickChatPopUp listener) {
    }
    
    public PagerDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog$OnClickChatPopUp;", "", "setClickPopUp", "", "app_debug"})
    public static abstract interface OnClickChatPopUp {
        
        public abstract void setClickPopUp();
    }
}