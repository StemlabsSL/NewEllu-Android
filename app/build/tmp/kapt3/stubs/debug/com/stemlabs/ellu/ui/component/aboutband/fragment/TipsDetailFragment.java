package com.stemlabs.ellu.ui.component.aboutband.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0014J\b\u0010&\u001a\u00020$H\u0016J\u0012\u0010\'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J&\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00103\u001a\u00020$H\u0002J\b\u00104\u001a\u00020$H\u0002J\b\u00105\u001a\u00020$H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019\u00a8\u00066"}, d2 = {"Lcom/stemlabs/ellu/ui/component/aboutband/fragment/TipsDetailFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "tipsAdapterFourth", "Lcom/stemlabs/ellu/ui/component/aboutband/adapter/TipsViewpagerAdapter;", "getTipsAdapterFourth", "()Lcom/stemlabs/ellu/ui/component/aboutband/adapter/TipsViewpagerAdapter;", "setTipsAdapterFourth", "(Lcom/stemlabs/ellu/ui/component/aboutband/adapter/TipsViewpagerAdapter;)V", "tipsAdapterOne", "getTipsAdapterOne", "setTipsAdapterOne", "tipsAdapterThird", "getTipsAdapterThird", "setTipsAdapterThird", "tipsAdapterTwo", "getTipsAdapterTwo", "setTipsAdapterTwo", "tipsListFour", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/data/model/TipsModel;", "getTipsListFour", "()Ljava/util/ArrayList;", "setTipsListFour", "(Ljava/util/ArrayList;)V", "tipsListOne", "getTipsListOne", "setTipsListOne", "tipsListThree", "getTipsListThree", "setTipsListThree", "tipsListTwo", "getTipsListTwo", "setTipsListTwo", "initView", "", "initializeViewModel", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setAdapter", "setHeader", "updateData", "app_debug"})
public final class TipsDetailFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter tipsAdapterOne;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter tipsAdapterTwo;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter tipsAdapterThird;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter tipsAdapterFourth;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> tipsListOne;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> tipsListTwo;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> tipsListThree;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> tipsListFour;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter getTipsAdapterOne() {
        return null;
    }
    
    public final void setTipsAdapterOne(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter getTipsAdapterTwo() {
        return null;
    }
    
    public final void setTipsAdapterTwo(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter getTipsAdapterThird() {
        return null;
    }
    
    public final void setTipsAdapterThird(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter getTipsAdapterFourth() {
        return null;
    }
    
    public final void setTipsAdapterFourth(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> getTipsListOne() {
        return null;
    }
    
    public final void setTipsListOne(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> getTipsListTwo() {
        return null;
    }
    
    public final void setTipsListTwo(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> getTipsListThree() {
        return null;
    }
    
    public final void setTipsListThree(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> getTipsListFour() {
        return null;
    }
    
    public final void setTipsListFour(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.TipsModel> p0) {
    }
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
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
    
    private final void setHeader() {
    }
    
    private final void initView() {
    }
    
    private final void updateData() {
    }
    
    private final void setAdapter() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public TipsDetailFragment() {
        super();
    }
}