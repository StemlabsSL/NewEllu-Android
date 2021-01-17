package com.stemlabs.ellu.ui.component.profile.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H\u0002J\b\u00100\u001a\u00020.H\u0014J\b\u00101\u001a\u00020.H\u0016J\u0010\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\u0013H\u0016J\u0012\u00104\u001a\u00020.2\b\u00105\u001a\u0004\u0018\u000106H\u0016J&\u00107\u001a\u0004\u0018\u0001062\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J*\u0010>\u001a\u00020.2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020BH\u0016J\u0010\u0010E\u001a\u00020.2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u00020.2\u0006\u0010F\u001a\u00020GH\u0016J\u001a\u0010I\u001a\u00020.2\u0006\u0010?\u001a\u0002062\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010J\u001a\u00020.H\u0002J\u000e\u0010K\u001a\u00020.2\u0006\u0010F\u001a\u00020GJ\u0010\u0010L\u001a\u00020.2\u0006\u0010M\u001a\u00020(H\u0016J\u0010\u0010N\u001a\u00020.2\u0006\u0010M\u001a\u00020(H\u0016J\u000e\u0010O\u001a\u00020.2\u0006\u0010P\u001a\u00020QJ\u000e\u0010R\u001a\u00020.2\u0006\u0010P\u001a\u00020QR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006S"}, d2 = {"Lcom/stemlabs/ellu/ui/component/profile/fragment/ProfileFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/wdullaer/materialdatetimepicker/date/DatePickerDialog$OnDateSetListener;", "Lcom/stemlabs/ellu/ui/component/profile/fragment/view/ProfileFragmentView;", "()V", "dialogPhotoSelection", "Lcom/stemlabs/ellu/ui/component/profile/dialog/ProfilePhotoSelectionDialog;", "getDialogPhotoSelection", "()Lcom/stemlabs/ellu/ui/component/profile/dialog/ProfilePhotoSelectionDialog;", "setDialogPhotoSelection", "(Lcom/stemlabs/ellu/ui/component/profile/dialog/ProfilePhotoSelectionDialog;)V", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mPresenter", "Lcom/stemlabs/ellu/ui/component/profile/fragment/presenter/ProfileFragmentPresenter;", "getMPresenter", "()Lcom/stemlabs/ellu/ui/component/profile/fragment/presenter/ProfileFragmentPresenter;", "setMPresenter", "(Lcom/stemlabs/ellu/ui/component/profile/fragment/presenter/ProfileFragmentPresenter;)V", "userNameDialog", "Lcom/stemlabs/ellu/ui/component/alarm/dialog/AlarmNameDialog;", "getUserNameDialog", "()Lcom/stemlabs/ellu/ui/component/alarm/dialog/AlarmNameDialog;", "setUserNameDialog", "(Lcom/stemlabs/ellu/ui/component/alarm/dialog/AlarmNameDialog;)V", "userStatusDialog", "getUserStatusDialog", "setUserStatusDialog", "userid", "", "getUserid", "()Ljava/lang/String;", "setUserid", "(Ljava/lang/String;)V", "hideProgressBar", "", "initView", "initializeViewModel", "observeViewModel", "onAttach", "context", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateSet", "view", "Lcom/wdullaer/materialdatetimepicker/date/DatePickerDialog;", "year", "", "monthOfYear", "dayOfMonth", "onSuccessfullyGetProfile", "response", "Lcom/stemlabs/ellu/data/model/getProfile/GetProfileResponse;", "onSuccessfullyUpdateProfile", "onViewCreated", "openDatePicker", "setData", "showMessage", "message", "showProgressBar", "updatImage", "request", "Lcom/stemlabs/ellu/data/model/request/ApiRequest;", "updateProfile", "app_debug"})
public final class ProfileFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener, com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener, com.stemlabs.ellu.ui.component.profile.fragment.view.ProfileFragmentView {
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.profile.dialog.ProfilePhotoSelectionDialog dialogPhotoSelection;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog userNameDialog;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog userStatusDialog;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.profile.fragment.presenter.ProfileFragmentPresenter mPresenter;
    @org.jetbrains.annotations.NotNull()
    public android.content.Context mContext;
    @org.jetbrains.annotations.Nullable()
    private java.io.File file;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userid = "";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.profile.dialog.ProfilePhotoSelectionDialog getDialogPhotoSelection() {
        return null;
    }
    
    public final void setDialogPhotoSelection(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.profile.dialog.ProfilePhotoSelectionDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog getUserNameDialog() {
        return null;
    }
    
    public final void setUserNameDialog(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog getUserStatusDialog() {
        return null;
    }
    
    public final void setUserStatusDialog(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.profile.fragment.presenter.ProfileFragmentPresenter getMPresenter() {
        return null;
    }
    
    public final void setMPresenter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.profile.fragment.presenter.ProfileFragmentPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getFile() {
        return null;
    }
    
    public final void setFile(@org.jetbrains.annotations.Nullable()
    java.io.File p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserid() {
        return null;
    }
    
    public final void setUserid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void openDatePicker() {
    }
    
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.Nullable()
    com.wdullaer.materialdatetimepicker.date.DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
    }
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @java.lang.Override()
    public void onSuccessfullyGetProfile(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.getProfile.GetProfileResponse response) {
    }
    
    @java.lang.Override()
    public void onSuccessfullyUpdateProfile(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.getProfile.GetProfileResponse response) {
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
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.getProfile.GetProfileResponse response) {
    }
    
    public final void updateProfile(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request) {
    }
    
    public final void updatImage(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request) {
    }
    
    public ProfileFragment() {
        super();
    }
}