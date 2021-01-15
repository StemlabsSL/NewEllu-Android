package com.stemlabs.ellu.ui.component.aware.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020+H\u0014J\b\u0010/\u001a\u00020+H\u0002J\b\u00100\u001a\u00020+H\u0016J&\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0018\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\u0012\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u001a\u0010B\u001a\u00020+2\u0006\u0010<\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010C\u001a\u00020+H\u0002J\u000e\u0010D\u001a\u00020+2\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u0006F"}, d2 = {"Lcom/stemlabs/ellu/ui/component/aware/fragment/AwareSelectAPlaceFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Lcom/stemlabs/ellu/utils/MyOnItemClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "from", "", "(Ljava/lang/String;)V", "adapter", "Lcom/stemlabs/ellu/ui/component/aware/adapter/AwareSelectLocationAdapter;", "adapterSearch", "Lcom/stemlabs/ellu/ui/component/aware/adapter/AwareSearchLocationAdapter;", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "getFrom", "()Ljava/lang/String;", "setFrom", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "gpsTracker1", "Lcom/stemlabs/ellu/utils/GPSTracker;", "getGpsTracker1", "()Lcom/stemlabs/ellu/utils/GPSTracker;", "setGpsTracker1", "(Lcom/stemlabs/ellu/utils/GPSTracker;)V", "l1", "Lcom/google/android/gms/maps/model/LatLng;", "getL1", "()Lcom/google/android/gms/maps/model/LatLng;", "setL1", "(Lcom/google/android/gms/maps/model/LatLng;)V", "l2", "getL2", "setL2", "list", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/ui/component/aware/model/SelectLocation;", "listener", "Lcom/stemlabs/ellu/ui/component/aware/fragment/AwareSelectAPlaceFragment$OnClickChatPopUp;", "getListener", "()Lcom/stemlabs/ellu/ui/component/aware/fragment/AwareSelectAPlaceFragment$OnClickChatPopUp;", "setListener", "(Lcom/stemlabs/ellu/ui/component/aware/fragment/AwareSelectAPlaceFragment$OnClickChatPopUp;)V", "addMarker", "", "animateCamera", "initView", "initializeViewModel", "mapInitialization", "observeViewModel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "position", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "onMarkerClick", "", "p0", "Lcom/google/android/gms/maps/model/Marker;", "onViewCreated", "setAdapter", "setChatPopUpListener", "OnClickChatPopUp", "app_debug"})
public final class AwareSelectAPlaceFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements com.stemlabs.ellu.utils.MyOnItemClickListener, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    private com.stemlabs.ellu.ui.component.aware.adapter.AwareSelectLocationAdapter adapter;
    private com.stemlabs.ellu.ui.component.aware.adapter.AwareSearchLocationAdapter adapterSearch;
    private java.util.ArrayList<com.stemlabs.ellu.ui.component.aware.model.SelectLocation> list;
    private com.google.android.gms.maps.GoogleMap googleMap;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.utils.GPSTracker gpsTracker1;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng l1;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng l2;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.aware.fragment.AwareSelectAPlaceFragment.OnClickChatPopUp listener;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String from;
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
    
    private final void addMarker() {
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
    
    private final void mapInitialization() {
    }
    
    private final void animateCamera() {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    private final void setAdapter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.aware.fragment.AwareSelectAPlaceFragment.OnClickChatPopUp getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.aware.fragment.AwareSelectAPlaceFragment.OnClickChatPopUp p0) {
    }
    
    public final void setChatPopUpListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.aware.fragment.AwareSelectAPlaceFragment.OnClickChatPopUp listener) {
    }
    
    @java.lang.Override()
    public void onItemClicked(int position, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public AwareSelectAPlaceFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String from) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/stemlabs/ellu/ui/component/aware/fragment/AwareSelectAPlaceFragment$OnClickChatPopUp;", "", "setClickPopUp", "", "app_debug"})
    public static abstract interface OnClickChatPopUp {
        
        public abstract void setClickPopUp();
    }
}