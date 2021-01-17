package com.stemlabs.ellu.ui.component.sos.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u001aH\u0002J\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006."}, d2 = {"Lcom/stemlabs/ellu/ui/component/sos/dialog/SosEndOverlayDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/stemlabs/ellu/utils/MyOnItemClickListener;", "()V", "adapter", "Lcom/stemlabs/ellu/ui/component/sos/adapter/SosEndAdapter;", "list", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/ui/component/sos/model/SosEndModel;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "listener", "Lcom/stemlabs/ellu/ui/component/sos/dialog/SosEndOverlayDialog$OnClickChatPopUp;", "getListener", "()Lcom/stemlabs/ellu/ui/component/sos/dialog/SosEndOverlayDialog$OnClickChatPopUp;", "setListener", "(Lcom/stemlabs/ellu/ui/component/sos/dialog/SosEndOverlayDialog$OnClickChatPopUp;)V", "viewPager", "Landroid/view/View;", "getViewPager", "()Landroid/view/View;", "setViewPager", "(Landroid/view/View;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemClicked", "position", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "setAdapter", "setChatPopUpListener", "setupDialog", "dialog", "Landroid/app/Dialog;", "style", "OnClickChatPopUp", "app_debug"})
public final class SosEndOverlayDialog extends androidx.fragment.app.DialogFragment implements com.stemlabs.ellu.utils.MyOnItemClickListener {
    @org.jetbrains.annotations.NotNull()
    public android.view.View viewPager;
    private com.stemlabs.ellu.ui.component.sos.adapter.SosEndAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.ui.component.sos.model.SosEndModel> list;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.sos.dialog.SosEndOverlayDialog.OnClickChatPopUp listener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getViewPager() {
        return null;
    }
    
    public final void setViewPager(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.ui.component.sos.model.SosEndModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.ui.component.sos.model.SosEndModel> p0) {
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
    
    private final void setAdapter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.sos.dialog.SosEndOverlayDialog.OnClickChatPopUp getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.sos.dialog.SosEndOverlayDialog.OnClickChatPopUp p0) {
    }
    
    public final void setChatPopUpListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.sos.dialog.SosEndOverlayDialog.OnClickChatPopUp listener) {
    }
    
    @java.lang.Override()
    public void onItemClicked(int position, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view) {
    }
    
    public SosEndOverlayDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/stemlabs/ellu/ui/component/sos/dialog/SosEndOverlayDialog$OnClickChatPopUp;", "", "setClickPopUp", "", "app_debug"})
    public static abstract interface OnClickChatPopUp {
        
        public abstract void setClickPopUp();
    }
}