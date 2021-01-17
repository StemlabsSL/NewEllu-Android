package com.stemlabs.ellu.ui.component.calendar.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0014J\b\u0010#\u001a\u00020!H\u0016J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010\'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020&2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J \u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020\u0005H\u0002J\b\u00104\u001a\u00020!H\u0002R\"\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016\u00a8\u00065"}, d2 = {"Lcom/stemlabs/ellu/ui/component/calendar/fragment/AddNewEventFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "c", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getC", "()Ljava/util/Calendar;", "setC", "(Ljava/util/Calendar;)V", "calenderAdapter", "Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter;", "getCalenderAdapter", "()Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter;", "setCalenderAdapter", "(Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter;)V", "month", "", "getMonth", "()I", "setMonth", "(I)V", "strShortsOfWeek", "", "getStrShortsOfWeek", "()Ljava/lang/String;", "setStrShortsOfWeek", "(Ljava/lang/String;)V", "year", "getYear", "setYear", "initView", "", "initializeViewModel", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setCalenderData", "date", "setCurrentDate", "cal", "setHeader", "app_debug"})
public final class AddNewEventFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter calenderAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strShortsOfWeek = "";
    private int year = 0;
    private int month = 0;
    private java.util.Calendar c;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter getCalenderAdapter() {
        return null;
    }
    
    public final void setCalenderAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrShortsOfWeek() {
        return null;
    }
    
    public final void setStrShortsOfWeek(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getYear() {
        return 0;
    }
    
    public final void setYear(int p0) {
    }
    
    public final int getMonth() {
        return 0;
    }
    
    public final void setMonth(int p0) {
    }
    
    public final java.util.Calendar getC() {
        return null;
    }
    
    public final void setC(java.util.Calendar p0) {
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
    
    private final void setCurrentDate(java.util.Calendar cal) {
    }
    
    private final void setCalenderData(java.lang.String date, java.lang.String month, java.lang.String year) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public AddNewEventFragment() {
        super();
    }
}