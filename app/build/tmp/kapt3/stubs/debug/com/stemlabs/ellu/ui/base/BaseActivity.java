package com.stemlabs.ellu.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J8\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0003\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010!\u001a\u00020\u0013J\b\u0010\"\u001a\u00020\u0013H$J\b\u0010#\u001a\u00020\u0013H$J\b\u0010$\u001a\u00020\u0013H&J\u0012\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*H\u0016J.\u0010+\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u00152\b\b\u0003\u0010\u0019\u001a\u00020\u001aJ.\u0010-\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u00152\b\b\u0003\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010.\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eJ\u001d\u0010/\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u00100\u001a\u00020\u0017H\u0000\u00a2\u0006\u0002\b1J\u0018\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00172\b\b\u0002\u00104\u001a\u00020\u0015J\u0006\u00105\u001a\u00020\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u00066"}, d2 = {"Lcom/stemlabs/ellu/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/stemlabs/ellu/ui/base/listeners/BaseView;", "()V", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "(Landroidx/fragment/app/Fragment;)V", "mDialog", "Landroid/app/Dialog;", "repo", "Lcom/stemlabs/ellu/data/RepoModel;", "getRepo", "()Lcom/stemlabs/ellu/data/RepoModel;", "setRepo", "(Lcom/stemlabs/ellu/data/RepoModel;)V", "addFragment", "", "backStackName", "", "aTAG", "", "popBackStack", "containerViewId", "", "createDrawableFromView", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "dismissProgressDialog", "initViewBinding", "initializeViewModel", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "replaceFragment", "popStack", "replaceWitohutFragment", "setLocale", "showBaseToast", "message", "showBaseToast$app_debug", "showMessageDialog", "msg", "isConfirm", "showProgressDialog", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.stemlabs.ellu.ui.base.listeners.BaseView {
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.data.RepoModel repo;
    private android.app.Dialog mDialog;
    @org.jetbrains.annotations.Nullable()
    private androidx.fragment.app.Fragment fragment;
    private java.util.HashMap _$_findViewCache;
    
    protected abstract void initializeViewModel();
    
    public abstract void observeViewModel();
    
    protected abstract void initViewBinding();
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.data.RepoModel getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.data.RepoModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment getFragment() {
        return null;
    }
    
    public final void setFragment(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void showProgressDialog() {
    }
    
    public final void dismissProgressDialog() {
    }
    
    public final void showMessageDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, boolean isConfirm) {
    }
    
    public final void replaceFragment(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.fragment.app.Fragment fragment, boolean backStackName, boolean popStack, @androidx.annotation.IdRes()
    int containerViewId) {
    }
    
    public final void addFragment(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.fragment.app.Fragment fragment, boolean backStackName, @org.jetbrains.annotations.NotNull()
    java.lang.String aTAG, boolean popBackStack, @androidx.annotation.IdRes()
    int containerViewId) {
    }
    
    public final void replaceWitohutFragment(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.fragment.app.Fragment fragment, boolean backStackName, boolean popStack, @androidx.annotation.IdRes()
    int containerViewId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.graphics.Bitmap createDrawableFromView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public final void showBaseToast$app_debug(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public BaseActivity() {
        super();
    }
}