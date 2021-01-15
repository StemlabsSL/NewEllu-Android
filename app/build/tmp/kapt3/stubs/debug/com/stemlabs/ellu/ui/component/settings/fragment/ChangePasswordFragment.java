package com.stemlabs.ellu.ui.component.settings.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020)H\u0002J\b\u0010,\u001a\u00020)H\u0014J\b\u0010-\u001a\u00020)H\u0016J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u0011H\u0016J\u0012\u00100\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u00010\u001dH\u0016J&\u00102\u001a\u0004\u0018\u00010\u001d2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020;H\u0016J\u001a\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020\u001d2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010>\u001a\u00020)H\u0002J\u0010\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020#H\u0016J\u0010\u0010A\u001a\u00020)2\u0006\u0010@\u001a\u00020#H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006B"}, d2 = {"Lcom/stemlabs/ellu/ui/component/settings/fragment/ChangePasswordFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/stemlabs/ellu/ui/component/profile/fragment/view/SettingFragmentView;", "()V", "errorPasswordDialog", "Lcom/stemlabs/ellu/ui/component/settings/dialog/ErrorChangePasswordDialog;", "getErrorPasswordDialog", "()Lcom/stemlabs/ellu/ui/component/settings/dialog/ErrorChangePasswordDialog;", "setErrorPasswordDialog", "(Lcom/stemlabs/ellu/ui/component/settings/dialog/ErrorChangePasswordDialog;)V", "isPasswordVisible", "", "()Z", "setPasswordVisible", "(Z)V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mPresenter", "Lcom/stemlabs/ellu/ui/component/profile/fragment/presenter/SettingFragmentPresenter;", "getMPresenter", "()Lcom/stemlabs/ellu/ui/component/profile/fragment/presenter/SettingFragmentPresenter;", "setMPresenter", "(Lcom/stemlabs/ellu/ui/component/profile/fragment/presenter/SettingFragmentPresenter;)V", "mView", "Landroid/view/View;", "getMView", "()Landroid/view/View;", "setMView", "(Landroid/view/View;)V", "userid", "", "getUserid", "()Ljava/lang/String;", "setUserid", "(Ljava/lang/String;)V", "changePassword", "", "hideProgressBar", "initView", "initializeViewModel", "observeViewModel", "onAttach", "context", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSuccessfullyChangePassword", "response", "Lcom/stemlabs/ellu/data/model/CommonResponse;", "onViewCreated", "view", "setHeader", "showMessage", "message", "showProgressBar", "app_debug"})
public final class ChangePasswordFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener, com.stemlabs.ellu.ui.component.profile.fragment.view.SettingFragmentView {
    @org.jetbrains.annotations.Nullable()
    private android.view.View mView;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userid = "";
    private boolean isPasswordVisible = true;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.settings.dialog.ErrorChangePasswordDialog errorPasswordDialog;
    @org.jetbrains.annotations.NotNull()
    public android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.profile.fragment.presenter.SettingFragmentPresenter mPresenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getMView() {
        return null;
    }
    
    public final void setMView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserid() {
        return null;
    }
    
    public final void setUserid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isPasswordVisible() {
        return false;
    }
    
    public final void setPasswordVisible(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.settings.dialog.ErrorChangePasswordDialog getErrorPasswordDialog() {
        return null;
    }
    
    public final void setErrorPasswordDialog(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.settings.dialog.ErrorChangePasswordDialog p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.profile.fragment.presenter.SettingFragmentPresenter getMPresenter() {
        return null;
    }
    
    public final void setMPresenter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.profile.fragment.presenter.SettingFragmentPresenter p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void initView() {
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
    
    @java.lang.Override()
    public void onSuccessfullyChangePassword(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.CommonResponse response) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void hideProgressBar() {
    }
    
    @java.lang.Override()
    public void showProgressBar(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void changePassword() {
    }
    
    public ChangePasswordFragment() {
        super();
    }
}