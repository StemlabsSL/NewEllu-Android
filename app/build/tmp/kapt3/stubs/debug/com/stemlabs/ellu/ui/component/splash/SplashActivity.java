package com.stemlabs.ellu.ui.component.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\'\u001a\u00020(J\b\u0010)\u001a\u00020(H\u0014J\b\u0010*\u001a\u00020(H\u0014J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020(H\u0016J\"\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u00102\u001a\u00020(H\u0016J\u001a\u00103\u001a\u00020(2\u0006\u00104\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020(H\u0016J\u001a\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020/2\b\u0010:\u001a\u0004\u0018\u000106H\u0016J\b\u0010;\u001a\u00020(H\u0016J\u0012\u0010<\u001a\u00020(2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u00020(H\u0016J\b\u0010@\u001a\u00020(H\u0016J\b\u0010A\u001a\u00020(H\u0016J\u0012\u0010B\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\b\u0010E\u001a\u00020(H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006F"}, d2 = {"Lcom/stemlabs/ellu/ui/component/splash/SplashActivity;", "Lcom/stemlabs/ellu/ui/base/BaseActivity;", "Lcom/an/biometric/BiometricCallback;", "()V", "authIntent", "Landroid/content/Intent;", "getAuthIntent", "()Landroid/content/Intent;", "setAuthIntent", "(Landroid/content/Intent;)V", "binding", "Lcom/stemlabs/ellu/databinding/SplashLayoutBinding;", "keyguardManager", "Landroid/app/KeyguardManager;", "getKeyguardManager", "()Landroid/app/KeyguardManager;", "larger_zoom", "Landroid/view/animation/Animation;", "mBiometricManager", "Lcom/an/biometric/BiometricManager;", "getMBiometricManager", "()Lcom/an/biometric/BiometricManager;", "setMBiometricManager", "(Lcom/an/biometric/BiometricManager;)V", "slideFromLeft", "slideFromRight", "slide_to_top_anim", "splashViewModel", "Lcom/stemlabs/ellu/ui/component/splash/SplashViewModel;", "getSplashViewModel", "()Lcom/stemlabs/ellu/ui/component/splash/SplashViewModel;", "setSplashViewModel", "(Lcom/stemlabs/ellu/ui/component/splash/SplashViewModel;)V", "viewModelFactory", "Lcom/stemlabs/ellu/ui/ViewModelFactory;", "getViewModelFactory", "()Lcom/stemlabs/ellu/ui/ViewModelFactory;", "setViewModelFactory", "(Lcom/stemlabs/ellu/ui/ViewModelFactory;)V", "auth", "", "initViewBinding", "initializeViewModel", "navigateToMainScreen", "observeViewModel", "onActivityResult", "requestCode", "", "resultCode", "data", "onAuthenticationCancelled", "onAuthenticationError", "errorCode", "errString", "", "onAuthenticationFailed", "onAuthenticationHelp", "helpCode", "helpString", "onAuthenticationSuccessful", "onBiometricAuthenticationInternalError", "error", "", "onBiometricAuthenticationNotAvailable", "onBiometricAuthenticationNotSupported", "onBiometricAuthenticationPermissionNotGranted", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSdkVersionNotSupported", "app_debug"})
public final class SplashActivity extends com.stemlabs.ellu.ui.base.BaseActivity implements com.an.biometric.BiometricCallback {
    private android.view.animation.Animation slideFromLeft;
    private android.view.animation.Animation slideFromRight;
    private android.view.animation.Animation larger_zoom;
    private android.view.animation.Animation slide_to_top_anim;
    @org.jetbrains.annotations.NotNull()
    public com.an.biometric.BiometricManager mBiometricManager;
    @org.jetbrains.annotations.Nullable()
    private android.content.Intent authIntent;
    @org.jetbrains.annotations.Nullable()
    private final android.app.KeyguardManager keyguardManager = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.stemlabs.ellu.ui.ViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.stemlabs.ellu.ui.component.splash.SplashViewModel splashViewModel;
    private com.stemlabs.ellu.databinding.SplashLayoutBinding binding;
    private java.util.HashMap _$_findViewCache;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.splash.SplashViewModel getSplashViewModel() {
        return null;
    }
    
    public final void setSplashViewModel(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.splash.SplashViewModel p0) {
    }
    
    @java.lang.Override()
    protected void initViewBinding() {
    }
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    private final void navigateToMainScreen() {
    }
    
    @java.lang.Override()
    public void onSdkVersionNotSupported() {
    }
    
    @java.lang.Override()
    public void onBiometricAuthenticationPermissionNotGranted() {
    }
    
    @java.lang.Override()
    public void onAuthenticationCancelled() {
    }
    
    @java.lang.Override()
    public void onBiometricAuthenticationInternalError(@org.jetbrains.annotations.Nullable()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void onBiometricAuthenticationNotSupported() {
    }
    
    @java.lang.Override()
    public void onAuthenticationError(int errorCode, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence errString) {
    }
    
    @java.lang.Override()
    public void onAuthenticationHelp(int helpCode, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence helpString) {
    }
    
    @java.lang.Override()
    public void onAuthenticationSuccessful() {
    }
    
    @java.lang.Override()
    public void onAuthenticationFailed() {
    }
    
    @java.lang.Override()
    public void onBiometricAuthenticationNotAvailable() {
    }
    
    public final void auth() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public SplashActivity() {
        super();
    }
}