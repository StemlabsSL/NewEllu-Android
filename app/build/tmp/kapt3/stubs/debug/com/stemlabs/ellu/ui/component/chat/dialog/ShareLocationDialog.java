package com.stemlabs.ellu.ui.component.chat.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001>B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020$H\u0002J\u0012\u0010,\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J&\u0010/\u001a\u0004\u0018\u00010\u001e2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u000e\u00108\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006?"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "gpsTracker1", "Lcom/stemlabs/ellu/utils/GPSTracker;", "getGpsTracker1", "()Lcom/stemlabs/ellu/utils/GPSTracker;", "setGpsTracker1", "(Lcom/stemlabs/ellu/utils/GPSTracker;)V", "l1", "Lcom/google/android/gms/maps/model/LatLng;", "getL1", "()Lcom/google/android/gms/maps/model/LatLng;", "setL1", "(Lcom/google/android/gms/maps/model/LatLng;)V", "l2", "getL2", "setL2", "listener", "Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog$OnClickShareLocation;", "getListener", "()Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog$OnClickShareLocation;", "setListener", "(Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog$OnClickShareLocation;)V", "viewShareLocation", "Landroid/view/View;", "getViewShareLocation", "()Landroid/view/View;", "setViewShareLocation", "(Landroid/view/View;)V", "addMarker", "", "animateCamera", "createDrawableFromView", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "view", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMarkerClick", "", "p0", "Lcom/google/android/gms/maps/model/Marker;", "setShareLocationListener", "setupDialog", "dialog", "Landroid/app/Dialog;", "style", "", "OnClickShareLocation", "app_debug"})
public final class ShareLocationDialog extends androidx.fragment.app.DialogFragment implements com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    @org.jetbrains.annotations.NotNull()
    public android.view.View viewShareLocation;
    private com.google.android.gms.maps.GoogleMap googleMap;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.utils.GPSTracker gpsTracker1;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng l1;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng l2;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog.OnClickShareLocation listener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getViewShareLocation() {
        return null;
    }
    
    public final void setViewShareLocation(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
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
    public boolean onMarkerClick(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.utils.GPSTracker getGpsTracker1() {
        return null;
    }
    
    public final void setGpsTracker1(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.utils.GPSTracker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getL1() {
        return null;
    }
    
    public final void setL1(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getL2() {
        return null;
    }
    
    public final void setL2(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    private final void addMarker() {
    }
    
    private final void animateCamera() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog.OnClickShareLocation getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog.OnClickShareLocation p0) {
    }
    
    public final void setShareLocationListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog.OnClickShareLocation listener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.graphics.Bitmap createDrawableFromView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public ShareLocationDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog$OnClickShareLocation;", "", "setOKOnClickOnClickShareLocation", "", "app_debug"})
    public static abstract interface OnClickShareLocation {
        
        public abstract void setOKOnClickOnClickShareLocation();
    }
}