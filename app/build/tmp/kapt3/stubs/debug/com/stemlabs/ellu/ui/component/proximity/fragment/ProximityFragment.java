package com.stemlabs.ellu.ui.component.proximity.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0014J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001dH\u0016J\u001a\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006/"}, d2 = {"Lcom/stemlabs/ellu/ui/component/proximity/fragment/ProximityFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "fromStatus", "", "(Ljava/lang/String;)V", "adapter", "Lcom/stemlabs/ellu/ui/component/proximity/adapter/NearByUserAdapter;", "getAdapter", "()Lcom/stemlabs/ellu/ui/component/proximity/adapter/NearByUserAdapter;", "chatActionList", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/data/model/ChatActionModel;", "getChatActionList", "()Ljava/util/ArrayList;", "getFromStatus", "()Ljava/lang/String;", "setFromStatus", "proximityDialog", "Lcom/stemlabs/ellu/ui/component/proximity/fragment/ProximityBottomDialog;", "getProximityDialog", "()Lcom/stemlabs/ellu/ui/component/proximity/fragment/ProximityBottomDialog;", "timer", "Landroid/os/CountDownTimer;", "getTimer", "()Landroid/os/CountDownTimer;", "setTimer", "(Landroid/os/CountDownTimer;)V", "initView", "", "initializeViewModel", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setHeader", "startAnimationView", "app_debug"})
public final class ProximityFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.stemlabs.ellu.data.model.ChatActionModel> chatActionList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stemlabs.ellu.ui.component.proximity.adapter.NearByUserAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stemlabs.ellu.ui.component.proximity.fragment.ProximityBottomDialog proximityDialog = null;
    @org.jetbrains.annotations.Nullable()
    private android.os.CountDownTimer timer;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromStatus;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.ChatActionModel> getChatActionList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.proximity.adapter.NearByUserAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.proximity.fragment.ProximityBottomDialog getProximityDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.CountDownTimer getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.Nullable()
    android.os.CountDownTimer p0) {
    }
    
    private final void startAnimationView() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setHeader() {
    }
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromStatus() {
        return null;
    }
    
    public final void setFromStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ProximityFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String fromStatus) {
        super();
    }
}