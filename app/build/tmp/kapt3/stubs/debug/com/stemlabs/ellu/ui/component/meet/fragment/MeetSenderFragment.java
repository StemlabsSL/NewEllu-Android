package com.stemlabs.ellu.ui.component.meet.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J*\u0010(\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0016J*\u0010/\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020,H\u0016J\u001a\u00104\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u00105\u001a\u00020\u001bH\u0002J\b\u00106\u001a\u00020\u001bH\u0002J\b\u00107\u001a\u00020\u001bH\u0002J\b\u00108\u001a\u00020\u001bH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00069"}, d2 = {"Lcom/stemlabs/ellu/ui/component/meet/fragment/MeetSenderFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/wdullaer/materialdatetimepicker/date/DatePickerDialog$OnDateSetListener;", "Lcom/wdullaer/materialdatetimepicker/time/TimePickerDialog$OnTimeSetListener;", "fromWhere", "", "(Ljava/lang/String;)V", "getFromWhere", "()Ljava/lang/String;", "setFromWhere", "meetPersonAdapter", "Lcom/stemlabs/ellu/ui/component/meet/adapter/MeetPersonAdapter;", "getMeetPersonAdapter", "()Lcom/stemlabs/ellu/ui/component/meet/adapter/MeetPersonAdapter;", "setMeetPersonAdapter", "(Lcom/stemlabs/ellu/ui/component/meet/adapter/MeetPersonAdapter;)V", "meetPersonList", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/data/model/MeetPersonModel;", "getMeetPersonList", "()Ljava/util/ArrayList;", "setMeetPersonList", "(Ljava/util/ArrayList;)V", "checkValidation", "", "initView", "", "initializeViewModel", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateSet", "view", "Lcom/wdullaer/materialdatetimepicker/date/DatePickerDialog;", "year", "", "monthOfYear", "dayOfMonth", "onTimeSet", "Lcom/wdullaer/materialdatetimepicker/time/TimePickerDialog;", "hourOfDay", "minute", "second", "onViewCreated", "openDatePicker", "openTimePicker", "setData", "setHeader", "app_debug"})
public final class MeetSenderFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener, com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener, com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener {
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.meet.adapter.MeetPersonAdapter meetPersonAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.MeetPersonModel> meetPersonList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromWhere;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.meet.adapter.MeetPersonAdapter getMeetPersonAdapter() {
        return null;
    }
    
    public final void setMeetPersonAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.meet.adapter.MeetPersonAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.MeetPersonModel> getMeetPersonList() {
        return null;
    }
    
    public final void setMeetPersonList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.MeetPersonModel> p0) {
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
    
    private final void openTimePicker() {
    }
    
    private final void openDatePicker() {
    }
    
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.Nullable()
    com.wdullaer.materialdatetimepicker.date.DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
    }
    
    @java.lang.Override()
    public void onTimeSet(@org.jetbrains.annotations.Nullable()
    com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
    }
    
    private final boolean checkValidation() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromWhere() {
        return null;
    }
    
    public final void setFromWhere(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public MeetSenderFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String fromWhere) {
        super();
    }
}