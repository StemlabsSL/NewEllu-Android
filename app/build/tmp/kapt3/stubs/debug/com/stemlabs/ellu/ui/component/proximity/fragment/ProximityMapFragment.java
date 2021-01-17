package com.stemlabs.ellu.ui.component.proximity.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\b\u00107\u001a\u000205H\u0002J\b\u00108\u001a\u000205H\u0014J\b\u00109\u001a\u000205H\u0002J\b\u0010:\u001a\u000205H\u0016J\u0012\u0010;\u001a\u0002052\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J&\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0012\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u001a\u0010I\u001a\u0002052\u0006\u0010J\u001a\u00020=2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010K\u001a\u000205H\u0002J\b\u0010L\u001a\u000205H\u0002J\b\u0010M\u001a\u000205H\u0002J\b\u0010N\u001a\u000205H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\'\"\u0004\b,\u0010)R \u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u0006O"}, d2 = {"Lcom/stemlabs/ellu/ui/component/proximity/fragment/ProximityMapFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "gpsTracker1", "Lcom/stemlabs/ellu/utils/GPSTracker;", "getGpsTracker1", "()Lcom/stemlabs/ellu/utils/GPSTracker;", "setGpsTracker1", "(Lcom/stemlabs/ellu/utils/GPSTracker;)V", "l1", "Lcom/google/android/gms/maps/model/LatLng;", "getL1", "()Lcom/google/android/gms/maps/model/LatLng;", "setL1", "(Lcom/google/android/gms/maps/model/LatLng;)V", "l2", "getL2", "setL2", "l3", "getL3", "setL3", "l4", "getL4", "setL4", "pagerDialog", "Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog;", "getPagerDialog", "()Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog;", "setPagerDialog", "(Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog;)V", "proximityAdapter", "Lcom/stemlabs/ellu/ui/component/proximity/adapter/ProximityUserAdapter;", "getProximityAdapter", "()Lcom/stemlabs/ellu/ui/component/proximity/adapter/ProximityUserAdapter;", "setProximityAdapter", "(Lcom/stemlabs/ellu/ui/component/proximity/adapter/ProximityUserAdapter;)V", "proximityRingAdapter", "getProximityRingAdapter", "setProximityRingAdapter", "proximityUserList", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/data/model/ProximityUserModel;", "getProximityUserList", "()Ljava/util/ArrayList;", "setProximityUserList", "(Ljava/util/ArrayList;)V", "addMarker", "", "animateCamera", "initView", "initializeViewModel", "mapInitialization", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMarkerClick", "", "p0", "Lcom/google/android/gms/maps/model/Marker;", "onViewCreated", "view", "setData", "setHeader", "setPolyline", "setRecyclearView", "app_debug"})
public final class ProximityMapFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    private com.google.android.gms.maps.GoogleMap googleMap;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.utils.GPSTracker gpsTracker1;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng l1;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng l2;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng l3;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng l4;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter proximityAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter proximityRingAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.ProximityUserModel> proximityUserList;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog pagerDialog;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    private java.util.HashMap _$_findViewCache;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getL3() {
        return null;
    }
    
    public final void setL3(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getL4() {
        return null;
    }
    
    public final void setL4(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter getProximityAdapter() {
        return null;
    }
    
    public final void setProximityAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter getProximityRingAdapter() {
        return null;
    }
    
    public final void setProximityRingAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.ProximityUserModel> getProximityUserList() {
        return null;
    }
    
    public final void setProximityUserList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.ProximityUserModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog getPagerDialog() {
        return null;
    }
    
    public final void setPagerDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog p0) {
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
    
    private final void setData() {
    }
    
    private final void setHeader() {
    }
    
    private final void initView() {
    }
    
    private final void setRecyclearView() {
    }
    
    private final void setPolyline() {
    }
    
    private final void mapInitialization() {
    }
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    private final void animateCamera() {
    }
    
    private final void addMarker() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
    
    public ProximityMapFragment() {
        super();
    }
}