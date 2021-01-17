package com.stemlabs.ellu.ui.component.alarm.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020;H\u0014J\b\u0010=\u001a\u00020;H\u0016J\u0012\u0010>\u001a\u00020;2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J&\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u001a\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020@2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010J\u001a\u00020;H\u0002J\b\u0010K\u001a\u00020;H\u0002J\b\u0010L\u001a\u00020;H\u0002J\b\u0010M\u001a\u00020;H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010&\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\r\"\u0004\b(\u0010\u000fR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR \u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010\u0015R\u001a\u00107\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\r\"\u0004\b9\u0010\u000f\u00a8\u0006N"}, d2 = {"Lcom/stemlabs/ellu/ui/component/alarm/fragment/AddAlarmFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "alarmNameDialog", "Lcom/stemlabs/ellu/ui/component/alarm/dialog/AlarmNameDialog;", "getAlarmNameDialog", "()Lcom/stemlabs/ellu/ui/component/alarm/dialog/AlarmNameDialog;", "setAlarmNameDialog", "(Lcom/stemlabs/ellu/ui/component/alarm/dialog/AlarmNameDialog;)V", "amPm", "", "getAmPm", "()Ljava/lang/String;", "setAmPm", "(Ljava/lang/String;)V", "amPmList", "Ljava/util/ArrayList;", "getAmPmList", "()Ljava/util/ArrayList;", "setAmPmList", "(Ljava/util/ArrayList;)V", "dayAdapter", "Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmDayAdapter;", "getDayAdapter", "()Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmDayAdapter;", "setDayAdapter", "(Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmDayAdapter;)V", "dayCircularAdapter", "Lcom/stemlabs/ellu/ui/component/alarm/adapter/DayCircularAdapter;", "getDayCircularAdapter", "()Lcom/stemlabs/ellu/ui/component/alarm/adapter/DayCircularAdapter;", "setDayCircularAdapter", "(Lcom/stemlabs/ellu/ui/component/alarm/adapter/DayCircularAdapter;)V", "dayList", "Lcom/stemlabs/ellu/data/model/DayModel;", "getDayList", "setDayList", "hour", "getHour", "setHour", "hourList", "getHourList", "setHourList", "isShowCalender", "", "()Z", "setShowCalender", "(Z)V", "minute", "getMinute", "setMinute", "minuteList", "getMinuteList", "setMinuteList", "title", "getTitle", "setTitle", "initView", "", "initializeViewModel", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setData", "setHeader", "setLoop", "setRecyclearView", "app_debug"})
public final class AddAlarmFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title = "Add Alarm";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> amPmList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> hourList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> minuteList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.DayModel> dayList;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.alarm.adapter.AlarmDayAdapter dayAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.alarm.adapter.DayCircularAdapter dayCircularAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog alarmNameDialog;
    private boolean isShowCalender = true;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String amPm = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String hour = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String minute = "";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getAmPmList() {
        return null;
    }
    
    public final void setAmPmList(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.DayModel> getDayList() {
        return null;
    }
    
    public final void setDayList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.DayModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.alarm.adapter.AlarmDayAdapter getDayAdapter() {
        return null;
    }
    
    public final void setDayAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.alarm.adapter.AlarmDayAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.alarm.adapter.DayCircularAdapter getDayCircularAdapter() {
        return null;
    }
    
    public final void setDayCircularAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.alarm.adapter.DayCircularAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog getAlarmNameDialog() {
        return null;
    }
    
    public final void setAlarmNameDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog p0) {
    }
    
    public final boolean isShowCalender() {
        return false;
    }
    
    public final void setShowCalender(boolean p0) {
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
    
    private final void initView() {
    }
    
    private final void setRecyclearView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmPm() {
        return null;
    }
    
    public final void setAmPm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHour() {
        return null;
    }
    
    public final void setHour(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinute() {
        return null;
    }
    
    public final void setMinute(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void setLoop() {
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
    
    public AddAlarmFragment() {
        super();
    }
}