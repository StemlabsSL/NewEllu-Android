package com.stemlabs.ellu.ui.component.loginflow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000J\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stemlabs/ellu/ui/component/loginflow/GoogleSignInUtils;", "", "()V", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "initialize", "signOutIfAlreadySignedIn", "thenSignIn", "", "Companion", "app_debug"})
public final class GoogleSignInUtils {
    private com.google.android.gms.auth.api.signin.GoogleSignInClient googleSignInClient;
    public static final int RC_SIGN_IN = 600;
    private static final java.lang.String TAG = "GoogleSignInUtils: ";
    private static com.stemlabs.ellu.ui.component.loginflow.GoogleSignInUtils instance;
    private static android.content.Context context;
    public static final com.stemlabs.ellu.ui.component.loginflow.GoogleSignInUtils.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.loginflow.GoogleSignInUtils initialize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.loginflow.GoogleSignInUtils signOutIfAlreadySignedIn() {
        return null;
    }
    
    public final void thenSignIn() {
    }
    
    public GoogleSignInUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/stemlabs/ellu/ui/component/loginflow/GoogleSignInUtils$Companion;", "", "()V", "RC_SIGN_IN", "", "TAG", "", "context", "Landroid/content/Context;", "instance", "Lcom/stemlabs/ellu/ui/component/loginflow/GoogleSignInUtils;", "getAccountFromIntent", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "data", "Landroid/content/Intent;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.stemlabs.ellu.ui.component.loginflow.GoogleSignInUtils getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccountFromIntent(@org.jetbrains.annotations.Nullable()
        android.content.Intent data) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}