package com.stemlabs.ellu.ui.component.settings.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\b\u00102\u001a\u000200H\u0002J\b\u00103\u001a\u000200H\u0014J\b\u00104\u001a\u000200H\u0016J\"\u00105\u001a\u0002002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020\u001dH\u0016J\b\u0010<\u001a\u000200H\u0016J\u001a\u0010=\u001a\u0002002\u0006\u0010>\u001a\u0002072\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u000200H\u0016J\u001a\u0010B\u001a\u0002002\u0006\u0010C\u001a\u0002072\b\u0010D\u001a\u0004\u0018\u00010@H\u0016J\b\u0010E\u001a\u000200H\u0016J\u0012\u0010F\u001a\u0002002\b\u0010G\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010H\u001a\u000200H\u0016J\b\u0010I\u001a\u000200H\u0016J\b\u0010J\u001a\u000200H\u0016J\u0012\u0010K\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J&\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\b\u0010U\u001a\u000200H\u0016J\b\u0010V\u001a\u000200H\u0016J\u001a\u0010W\u001a\u0002002\u0006\u0010X\u001a\u00020M2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\u0010\u0010Y\u001a\u0002002\u0006\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u000200H\u0002J\b\u0010]\u001a\u000200H\u0002J\b\u0010^\u001a\u000200H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006_"}, d2 = {"Lcom/stemlabs/ellu/ui/component/settings/fragment/SettingsFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$switchClick;", "Lcom/an/biometric/BiometricCallback;", "()V", "authIntent", "Landroid/content/Intent;", "getAuthIntent", "()Landroid/content/Intent;", "setAuthIntent", "(Landroid/content/Intent;)V", "currentStatus", "", "getCurrentStatus", "()Ljava/lang/String;", "setCurrentStatus", "(Ljava/lang/String;)V", "keyguardManager", "Landroid/app/KeyguardManager;", "getKeyguardManager", "()Landroid/app/KeyguardManager;", "mBiometricManager", "Lcom/an/biometric/BiometricManager;", "getMBiometricManager", "()Lcom/an/biometric/BiometricManager;", "setMBiometricManager", "(Lcom/an/biometric/BiometricManager;)V", "mcontext", "Landroid/content/Context;", "getMcontext", "()Landroid/content/Context;", "setMcontext", "(Landroid/content/Context;)V", "settingList", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/data/model/SettingsModel;", "getSettingList", "()Ljava/util/ArrayList;", "setSettingList", "(Ljava/util/ArrayList;)V", "settingListAdapter", "Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter;", "getSettingListAdapter", "()Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter;", "setSettingListAdapter", "(Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter;)V", "auth", "", "checkLock", "initView", "initializeViewModel", "observeViewModel", "onActivityResult", "requestCode", "", "resultCode", "data", "onAttach", "context", "onAuthenticationCancelled", "onAuthenticationError", "errorCode", "errString", "", "onAuthenticationFailed", "onAuthenticationHelp", "helpCode", "helpString", "onAuthenticationSuccessful", "onBiometricAuthenticationInternalError", "error", "onBiometricAuthenticationNotAvailable", "onBiometricAuthenticationNotSupported", "onBiometricAuthenticationPermissionNotGranted", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onSdkVersionNotSupported", "onViewCreated", "view", "oncick", "value", "", "setData", "setHeader", "setRecyclearView", "app_debug"})
public final class SettingsFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener, com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.switchClick, com.an.biometric.BiometricCallback {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.SettingsModel> settingList;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter settingListAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentStatus = "facedetection";
    @org.jetbrains.annotations.NotNull()
    public android.content.Context mcontext;
    @org.jetbrains.annotations.NotNull()
    public com.an.biometric.BiometricManager mBiometricManager;
    @org.jetbrains.annotations.Nullable()
    private android.content.Intent authIntent;
    @org.jetbrains.annotations.Nullable()
    private final android.app.KeyguardManager keyguardManager = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.SettingsModel> getSettingList() {
        return null;
    }
    
    public final void setSettingList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.SettingsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter getSettingListAdapter() {
        return null;
    }
    
    public final void setSettingListAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentStatus() {
        return null;
    }
    
    public final void setCurrentStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMcontext() {
        return null;
    }
    
    public final void setMcontext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.an.biometric.BiometricManager getMBiometricManager() {
        return null;
    }
    
    public final void setMBiometricManager(@org.jetbrains.annotations.NotNull()
    com.an.biometric.BiometricManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent getAuthIntent() {
        return null;
    }
    
    public final void setAuthIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.KeyguardManager getKeyguardManager() {
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
    
    private final void setHeader() {
    }
    
    private final void setData() {
    }
    
    private final void setRecyclearView() {
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
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void oncick(boolean value) {
    }
    
    public final void auth() {
    }
    
    @java.lang.Override()
    public void onSdkVersionNotSupported() {
    }
    
    @java.lang.Override()
    public void onBiometricAuthenticationNotSupported() {
    }
    
    @java.lang.Override()
    public void onBiometricAuthenticationNotAvailable() {
    }
    
    @java.lang.Override()
    public void onBiometricAuthenticationPermissionNotGranted() {
    }
    
    @java.lang.Override()
    public void onBiometricAuthenticationInternalError(@org.jetbrains.annotations.Nullable()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void onAuthenticationFailed() {
    }
    
    @java.lang.Override()
    public void onAuthenticationCancelled() {
    }
    
    @java.lang.Override()
    public void onAuthenticationSuccessful() {
    }
    
    @java.lang.Override()
    public void onAuthenticationHelp(int helpCode, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence helpString) {
    }
    
    @java.lang.Override()
    public void onAuthenticationError(int errorCode, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence errString) {
    }
    
    public final void checkLock() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public SettingsFragment() {
        super();
    }
}