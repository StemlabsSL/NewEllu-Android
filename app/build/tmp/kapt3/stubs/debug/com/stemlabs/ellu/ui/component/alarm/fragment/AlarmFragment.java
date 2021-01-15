package com.stemlabs.ellu.ui.component.alarm.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0014J\u0010\u0010-\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020+H\u0016J\u0012\u0010/\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101H\u0016J&\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020+H\u0016J\u001a\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u0002012\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010<\u001a\u00020+H\u0002J\b\u0010=\u001a\u00020+H\u0002J\b\u0010>\u001a\u00020+H\u0002J\b\u0010?\u001a\u00020+H\u0002J\u0006\u0010(\u001a\u00020+R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u0006@"}, d2 = {"Lcom/stemlabs/ellu/ui/component/alarm/fragment/AlarmFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "alarmAdapter", "Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter;", "getAlarmAdapter", "()Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter;", "setAlarmAdapter", "(Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter;)V", "alarmList", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/data/model/AlarmModel;", "getAlarmList", "()Ljava/util/ArrayList;", "setAlarmList", "(Ljava/util/ArrayList;)V", "dayList", "Lcom/stemlabs/ellu/data/model/DayModel;", "getDayList", "setDayList", "hourList", "", "getHourList", "setHourList", "isAlarmView", "", "()Z", "setAlarmView", "(Z)V", "minuteList", "getMinuteList", "setMinuteList", "secondList", "getSecondList", "setSecondList", "timer", "Landroid/os/CountDownTimer;", "getTimer", "()Landroid/os/CountDownTimer;", "setTimer", "(Landroid/os/CountDownTimer;)V", "initView", "", "initializeViewModel", "manageView", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setData", "setHeader", "setLoop", "setRecyclearView", "app_debug"})
public final class AlarmFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter alarmAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.AlarmModel> alarmList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.DayModel> dayList;
    private boolean isAlarmView = true;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> secondList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> hourList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> minuteList;
    @org.jetbrains.annotations.Nullable()
    private android.os.CountDownTimer timer;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter getAlarmAdapter() {
        return null;
    }
    
    public final void setAlarmAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.AlarmModel> getAlarmList() {
        return null;
    }
    
    public final void setAlarmList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.AlarmModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.DayModel> getDayList() {
        return null;
    }
    
    public final void setDayList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.DayModel> p0) {
    }
    
    public final boolean isAlarmView() {
        return false;
    }
    
    public final void setAlarmView(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getSecondList() {
        return null;
    }
    
    public final void setSecondList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getHourList() {
        return null;
    }
    
    public final void setHourList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getMinuteList() {
        return null;
    }
    
    public final void setMinuteList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
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
    
    private final void setLoop() {
    }
    
    private final void setRecyclearView() {
    }
    
    private final void setData() {
    }
    
    private final void manageView(boolean isAlarmView) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.CountDownTimer getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.Nullable()
    android.os.CountDownTimer p0) {
    }
    
    public final void setTimer() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public AlarmFragment() {
        super();
    }
}