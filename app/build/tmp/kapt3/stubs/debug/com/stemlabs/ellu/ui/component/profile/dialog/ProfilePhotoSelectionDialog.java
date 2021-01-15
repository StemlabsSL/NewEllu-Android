package com.stemlabs.ellu.ui.component.profile.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007J\b\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0007H\u0002J\b\u00100\u001a\u00020.H\u0002J\b\u00101\u001a\u00020.H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u0004J\u0018\u00104\u001a\u00020,2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u00020,H\u0002J\n\u0010:\u001a\u0004\u0018\u00010\u001bH\u0002J\u001a\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u001bH\u0002J\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u001a\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u001bJ\b\u0010B\u001a\u00020,H\u0002J\"\u0010C\u001a\u00020,2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\u0012\u0010G\u001a\u00020,2\b\u0010H\u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010I\u001a\u00020,2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J&\u0010L\u001a\u0004\u0018\u00010!2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010P2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J-\u0010Q\u001a\u00020,2\u0006\u0010/\u001a\u00020\u00072\u000e\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040S2\u0006\u0010T\u001a\u00020UH\u0016\u00a2\u0006\u0002\u0010VJ\u001a\u0010W\u001a\u0004\u0018\u00010A2\u0006\u0010X\u001a\u00020A2\u0006\u0010Y\u001a\u00020\u0004H\u0002J\u000e\u0010Z\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010[\u001a\u00020,2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0007H\u0016J\u001d\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010S2\u0006\u0010`\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006c"}, d2 = {"Lcom/stemlabs/ellu/ui/component/profile/dialog/ProfilePhotoSelectionDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/View$OnClickListener;", "fromWhere", "", "(Ljava/lang/String;)V", "CAMERA_PERMISSION_REQUEST", "", "CAMERA_REQUEST", "DEFAULT_BUFFER_SIZE", "EOF", "STORAGE_PERMISSION_REQUEST", "STORAGE_REQUEST", "TAG", "getFromWhere", "()Ljava/lang/String;", "setFromWhere", "imgPath", "getImgPath", "setImgPath", "listener", "Lcom/stemlabs/ellu/ui/component/profile/dialog/ProfilePhotoSelectionDialog$OnClickSetProfilePhoto;", "getListener", "()Lcom/stemlabs/ellu/ui/component/profile/dialog/ProfilePhotoSelectionDialog$OnClickSetProfilePhoto;", "setListener", "(Lcom/stemlabs/ellu/ui/component/profile/dialog/ProfilePhotoSelectionDialog$OnClickSetProfilePhoto;)V", "outputFileUri", "Landroid/net/Uri;", "getOutputFileUri", "()Landroid/net/Uri;", "setOutputFileUri", "(Landroid/net/Uri;)V", "viewProfilePhotoSelection", "Landroid/view/View;", "getViewProfilePhotoSelection", "()Landroid/view/View;", "setViewProfilePhotoSelection", "(Landroid/view/View;)V", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "callGallery", "", "chkAllPermission", "", "requestCode", "chkCameraPermission", "chkStoragePermission", "compressImage", "filePath", "copy", "input", "Ljava/io/InputStream;", "output", "Ljava/io/OutputStream;", "fromCamera", "getCaptureImageOutputUri", "getFileName", "context", "Landroid/content/Context;", "uri", "getFilename", "getRealPathFromUri", "Ljava/io/File;", "initView", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "rename", "file", "newName", "setPhotoSelectionListener", "setupDialog", "dialog", "Landroid/app/Dialog;", "style", "splitFileName", "fileName", "(Ljava/lang/String;)[Ljava/lang/String;", "OnClickSetProfilePhoto", "app_debug"})
public final class ProfilePhotoSelectionDialog extends androidx.fragment.app.DialogFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public android.view.View viewProfilePhotoSelection;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri outputFileUri;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imgPath;
    private final int CAMERA_REQUEST = 1;
    private final int STORAGE_REQUEST = 2;
    private final int CAMERA_PERMISSION_REQUEST = 101;
    private final int STORAGE_PERMISSION_REQUEST = 102;
    private final java.lang.String TAG = "ImagePicker";
    private final int EOF = -1;
    private final int DEFAULT_BUFFER_SIZE = 8192;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.profile.dialog.ProfilePhotoSelectionDialog.OnClickSetProfilePhoto listener;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromWhere;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getViewProfilePhotoSelection() {
        return null;
    }
    
    public final void setViewProfilePhotoSelection(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getOutputFileUri() {
        return null;
    }
    
    public final void setOutputFileUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImgPath() {
        return null;
    }
    
    public final void setImgPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setupDialog(@org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog, int style) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final boolean chkAllPermission(int requestCode) {
        return false;
    }
    
    private final boolean chkStoragePermission() {
        return false;
    }
    
    private final boolean chkCameraPermission() {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void fromCamera() {
    }
    
    private final android.net.Uri getCaptureImageOutputUri() {
        return null;
    }
    
    private final void callGallery() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getRealPathFromUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
        return null;
    }
    
    private final java.lang.String[] splitFileName(java.lang.String fileName) {
        return null;
    }
    
    private final void copy(java.io.InputStream input, java.io.OutputStream output) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final java.io.File rename(java.io.File file, java.lang.String newName) {
        return null;
    }
    
    private final java.lang.String getFileName(android.content.Context context, android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String compressImage(@org.jetbrains.annotations.Nullable()
    java.lang.String filePath) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.profile.dialog.ProfilePhotoSelectionDialog.OnClickSetProfilePhoto getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.profile.dialog.ProfilePhotoSelectionDialog.OnClickSetProfilePhoto p0) {
    }
    
    public final void setPhotoSelectionListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.profile.dialog.ProfilePhotoSelectionDialog.OnClickSetProfilePhoto listener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilename() {
        return null;
    }
    
    public final int calculateInSampleSize(@org.jetbrains.annotations.NotNull()
    android.graphics.BitmapFactory.Options options, int reqWidth, int reqHeight) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromWhere() {
        return null;
    }
    
    public final void setFromWhere(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ProfilePhotoSelectionDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String fromWhere) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/stemlabs/ellu/ui/component/profile/dialog/ProfilePhotoSelectionDialog$OnClickSetProfilePhoto;", "", "set", "", "filepath", "", "setRemovePhotoClick", "app_debug"})
    public static abstract interface OnClickSetProfilePhoto {
        
        public abstract void setRemovePhotoClick();
        
        public abstract void set(@org.jetbrains.annotations.Nullable()
        java.lang.String filepath);
    }
}