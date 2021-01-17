package com.stemlabs.ellu.ui.component.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020*H\u0002J\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\n\u0010.\u001a\u0004\u0018\u00010/H\u0002J\b\u00100\u001a\u00020*H\u0014J\b\u00101\u001a\u00020*H\u0014J\u000e\u00102\u001a\u00020*2\u0006\u00103\u001a\u000204J\b\u00105\u001a\u00020*H\u0016J\"\u00106\u001a\u00020*2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010;\u001a\u00020*H\u0016J\u001a\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u0002082\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u00020*H\u0016J\u001a\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u0002082\b\u0010C\u001a\u0004\u0018\u00010?H\u0016J\b\u0010D\u001a\u00020*H\u0016J\u0012\u0010E\u001a\u00020*2\b\u0010F\u001a\u0004\u0018\u000104H\u0016J\b\u0010G\u001a\u00020*H\u0016J\b\u0010H\u001a\u00020*H\u0016J\b\u0010I\u001a\u00020*H\u0016J\u0006\u0010J\u001a\u00020*J\u0012\u0010K\u001a\u00020*2\b\u0010L\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010M\u001a\u00020*2\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\b\u0010P\u001a\u00020*H\u0014J\b\u0010Q\u001a\u00020*H\u0014J\b\u0010R\u001a\u00020*H\u0014J\b\u0010S\u001a\u00020*H\u0016J\u0010\u0010T\u001a\u00020*2\b\b\u0002\u0010U\u001a\u00020VJ\u0010\u0010W\u001a\u00020*2\u0006\u0010X\u001a\u000208H\u0002J\u0018\u0010Y\u001a\u00020*2\u0006\u0010Z\u001a\u00020\u00182\u0006\u0010[\u001a\u00020\u0018H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006\\"}, d2 = {"Lcom/stemlabs/ellu/ui/component/home/HomeActivity;", "Lcom/stemlabs/ellu/ui/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/an/biometric/BiometricCallback;", "()V", "authIntent", "Landroid/content/Intent;", "getAuthIntent", "()Landroid/content/Intent;", "setAuthIntent", "(Landroid/content/Intent;)V", "keyguardManager", "Landroid/app/KeyguardManager;", "getKeyguardManager", "()Landroid/app/KeyguardManager;", "mBiometricManager", "Lcom/an/biometric/BiometricManager;", "getMBiometricManager", "()Lcom/an/biometric/BiometricManager;", "setMBiometricManager", "(Lcom/an/biometric/BiometricManager;)V", "mMessageReceiver", "Landroid/content/BroadcastReceiver;", "oldView", "Landroid/view/View;", "getOldView", "()Landroid/view/View;", "setOldView", "(Landroid/view/View;)V", "tutorialdialog", "Lcom/stemlabs/ellu/ui/component/home/dialog/TutorialDialog;", "getTutorialdialog", "()Lcom/stemlabs/ellu/ui/component/home/dialog/TutorialDialog;", "setTutorialdialog", "(Lcom/stemlabs/ellu/ui/component/home/dialog/TutorialDialog;)V", "videoCallDialog", "Lcom/stemlabs/ellu/ui/component/home/dialog/VideoCallDismissDialog;", "getVideoCallDialog", "()Lcom/stemlabs/ellu/ui/component/home/dialog/VideoCallDismissDialog;", "setVideoCallDialog", "(Lcom/stemlabs/ellu/ui/component/home/dialog/VideoCallDismissDialog;)V", "auth", "", "defaultClick", "drawerClose", "drawerOpen", "getVisibleFragment", "Landroidx/fragment/app/Fragment;", "initViewBinding", "initializeViewModel", "manageBottomView", "clickStatus", "", "observeViewModel", "onActivityResult", "requestCode", "", "resultCode", "data", "onAuthenticationCancelled", "onAuthenticationError", "errorCode", "errString", "", "onAuthenticationFailed", "onAuthenticationHelp", "helpCode", "helpString", "onAuthenticationSuccessful", "onBiometricAuthenticationInternalError", "error", "onBiometricAuthenticationNotAvailable", "onBiometricAuthenticationNotSupported", "onBiometricAuthenticationPermissionNotGranted", "onBradCast", "onClick", "v", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onSdkVersionNotSupported", "setBottomVisibility", "isVisible", "", "setViewForTutorial", "currentCount", "translate", "viewToMove", "target", "app_debug"})
public final class HomeActivity extends com.stemlabs.ellu.ui.base.BaseActivity implements android.view.View.OnClickListener, com.an.biometric.BiometricCallback {
    @org.jetbrains.annotations.Nullable()
    private android.view.View oldView;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.home.dialog.TutorialDialog tutorialdialog;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.home.dialog.VideoCallDismissDialog videoCallDialog;
    @org.jetbrains.annotations.NotNull()
    public com.an.biometric.BiometricManager mBiometricManager;
    @org.jetbrains.annotations.Nullable()
    private android.content.Intent authIntent;
    @org.jetbrains.annotations.Nullable()
    private final android.app.KeyguardManager keyguardManager = null;
    private final android.content.BroadcastReceiver mMessageReceiver = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getOldView() {
        return null;
    }
    
    public final void setOldView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.home.dialog.TutorialDialog getTutorialdialog() {
        return null;
    }
    
    public final void setTutorialdialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.home.dialog.TutorialDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.home.dialog.VideoCallDismissDialog getVideoCallDialog() {
        return null;
    }
    
    public final void setVideoCallDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.home.dialog.VideoCallDismissDialog p0) {
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
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @java.lang.Override()
    protected void initViewBinding() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void setViewForTutorial(int currentCount) {
    }
    
    public final void setBottomVisibility(boolean isVisible) {
    }
    
    private final androidx.fragment.app.Fragment getVisibleFragment() {
        return null;
    }
    
    public final void drawerOpen() {
    }
    
    public final void drawerClose() {
    }
    
    public final void manageBottomView(@org.jetbrains.annotations.NotNull()
    java.lang.String clickStatus) {
    }
    
    private final void defaultClick() {
    }
    
    private final void translate(android.view.View viewToMove, android.view.View target) {
    }
    
    public final void onBradCast() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
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
    
    public HomeActivity() {
        super();
    }
}