package com.stemlabs.ellu.ui.component.settings.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0014J\b\u0010&\u001a\u00020\"H\u0016J\"\u0010\'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u001cH\u0016J\b\u0010.\u001a\u00020\"H\u0016J\u001a\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\"H\u0016J\u001a\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u000102H\u0016J\b\u00107\u001a\u00020\"H\u0016J\u0012\u00108\u001a\u00020\"2\b\u00109\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010:\u001a\u00020\"H\u0016J\b\u0010;\u001a\u00020\"H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\u0012\u0010=\u001a\u00020\"2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J&\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\b\u0010G\u001a\u00020\"H\u0016J\u001a\u0010H\u001a\u00020\"2\u0006\u0010I\u001a\u00020?2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\b\u0010J\u001a\u00020\"H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006K"}, d2 = {"Lcom/stemlabs/ellu/ui/component/settings/fragment/SecurityFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/an/biometric/BiometricCallback;", "()V", "authIntent", "Landroid/content/Intent;", "getAuthIntent", "()Landroid/content/Intent;", "setAuthIntent", "(Landroid/content/Intent;)V", "currentStatus", "", "getCurrentStatus", "()Ljava/lang/String;", "setCurrentStatus", "(Ljava/lang/String;)V", "keyguardManager", "Landroid/app/KeyguardManager;", "getKeyguardManager", "()Landroid/app/KeyguardManager;", "mBiometricManager", "Lcom/an/biometric/BiometricManager;", "getMBiometricManager", "()Lcom/an/biometric/BiometricManager;", "setMBiometricManager", "(Lcom/an/biometric/BiometricManager;)V", "mcontext", "Landroid/content/Context;", "getMcontext", "()Landroid/content/Context;", "setMcontext", "(Landroid/content/Context;)V", "auth", "", "checkLock", "initView", "initializeViewModel", "observeViewModel", "onActivityResult", "requestCode", "", "resultCode", "data", "onAttach", "context", "onAuthenticationCancelled", "onAuthenticationError", "errorCode", "errString", "", "onAuthenticationFailed", "onAuthenticationHelp", "helpCode", "helpString", "onAuthenticationSuccessful", "onBiometricAuthenticationInternalError", "error", "onBiometricAuthenticationNotAvailable", "onBiometricAuthenticationNotSupported", "onBiometricAuthenticationPermissionNotGranted", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSdkVersionNotSupported", "onViewCreated", "view", "setHeader", "app_debug"})
public final class SecurityFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener, com.an.biometric.BiometricCallback {
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
    
    public SecurityFragment() {
        super();
    }
}