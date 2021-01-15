package com.stemlabs.ellu.ui.component.chat.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020*H\u0016J\u0012\u0010,\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020*H\u0016J&\u00100\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020*H\u0016J\b\u00108\u001a\u00020*H\u0016J\b\u00109\u001a\u00020*H\u0016J\u001a\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020.2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010<\u001a\u00020*H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006="}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/fragment/StoryBoardFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Ljp/shts/android/storiesprogressview/StoriesProgressView$StoriesListener;", "()V", "PROGRESS_COUNT", "", "counter", "durations", "", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "setImage", "(Landroid/widget/ImageView;)V", "limit", "", "getLimit", "()J", "setLimit", "(J)V", "onTouchListener", "Landroid/view/View$OnTouchListener;", "pressTime", "getPressTime", "setPressTime", "resources", "", "shareLocationDialog", "Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog;", "getShareLocationDialog", "()Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog;", "setShareLocationDialog", "(Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog;)V", "storiesProgressView", "Ljp/shts/android/storiesprogressview/StoriesProgressView;", "getStoriesProgressView", "()Ljp/shts/android/storiesprogressview/StoriesProgressView;", "setStoriesProgressView", "(Ljp/shts/android/storiesprogressview/StoriesProgressView;)V", "initializeViewModel", "", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onComplete", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNext", "onPrev", "onViewCreated", "view", "openShareLocation", "app_debug"})
public final class StoryBoardFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener, jp.shts.android.storiesprogressview.StoriesProgressView.StoriesListener {
    private final int PROGRESS_COUNT = 12;
    @org.jetbrains.annotations.NotNull()
    public jp.shts.android.storiesprogressview.StoriesProgressView storiesProgressView;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView image;
    private int counter = 0;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog shareLocationDialog;
    private final int[] resources = {2131166042, 2131166043, 2131166044, 2131166045, 2131166046, 2131166047, 2131166042, 2131166043, 2131166044, 2131166045, 2131166046, 2131166047};
    private final long[] durations = {500L, 1000L, 1500L, 4000L, 5000L, 1000L};
    private long pressTime = 0L;
    private long limit = 500L;
    private final android.view.View.OnTouchListener onTouchListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final jp.shts.android.storiesprogressview.StoriesProgressView getStoriesProgressView() {
        return null;
    }
    
    public final void setStoriesProgressView(@org.jetbrains.annotations.NotNull()
    jp.shts.android.storiesprogressview.StoriesProgressView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog getShareLocationDialog() {
        return null;
    }
    
    public final void setShareLocationDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog p0) {
    }
    
    public final long getPressTime() {
        return 0L;
    }
    
    public final void setPressTime(long p0) {
    }
    
    public final long getLimit() {
        return 0L;
    }
    
    public final void setLimit(long p0) {
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
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void openShareLocation() {
    }
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    @java.lang.Override()
    public void onPrev() {
    }
    
    @java.lang.Override()
    public void onNext() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public StoryBoardFragment() {
        super();
    }
}