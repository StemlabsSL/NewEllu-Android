package com.stemlabs.ellu.ui.component.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0014J\b\u0010*\u001a\u00020(H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020(H\u0016J\u001a\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00106\u001a\u00020(H\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00067"}, d2 = {"Lcom/stemlabs/ellu/ui/component/home/LinkFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "()V", "dottedList", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/data/model/DayModel;", "getDottedList", "()Ljava/util/ArrayList;", "setDottedList", "(Ljava/util/ArrayList;)V", "dottedPhoneAdapter", "Lcom/stemlabs/ellu/ui/component/aboutband/adapter/DottedPhoneAdapter;", "getDottedPhoneAdapter", "()Lcom/stemlabs/ellu/ui/component/aboutband/adapter/DottedPhoneAdapter;", "setDottedPhoneAdapter", "(Lcom/stemlabs/ellu/ui/component/aboutband/adapter/DottedPhoneAdapter;)V", "isBand", "", "()Z", "setBand", "(Z)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "timer", "Landroid/os/CountDownTimer;", "getTimer", "()Landroid/os/CountDownTimer;", "setTimer", "(Landroid/os/CountDownTimer;)V", "viewModelFactory", "Lcom/stemlabs/ellu/ui/ViewModelFactory;", "getViewModelFactory", "()Lcom/stemlabs/ellu/ui/ViewModelFactory;", "setViewModelFactory", "(Lcom/stemlabs/ellu/ui/ViewModelFactory;)V", "initView", "", "initializeViewModel", "observeViewModel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setTimerView", "app_debug"})
public final class LinkFragment extends com.stemlabs.ellu.ui.base.BaseFragment {
    private boolean isBand = false;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.aboutband.adapter.DottedPhoneAdapter dottedPhoneAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.DayModel> dottedList;
    private int position = 0;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.stemlabs.ellu.ui.ViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.Nullable()
    private android.os.CountDownTimer timer;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isBand() {
        return false;
    }
    
    public final void setBand(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.aboutband.adapter.DottedPhoneAdapter getDottedPhoneAdapter() {
        return null;
    }
    
    public final void setDottedPhoneAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.aboutband.adapter.DottedPhoneAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.DayModel> getDottedList() {
        return null;
    }
    
    public final void setDottedList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.DayModel> p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.ViewModelFactory p0) {
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
    
    private final void setTimerView() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    public LinkFragment() {
        super();
    }
}