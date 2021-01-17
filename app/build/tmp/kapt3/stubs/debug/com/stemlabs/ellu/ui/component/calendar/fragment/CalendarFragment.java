package com.stemlabs.ellu.ui.component.calendar.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010&\u001a\u00020\'2\u0006\u0010#\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0016J\b\u0010)\u001a\u00020\'H\u0014J\b\u0010*\u001a\u00020\'H\u0016J\u0012\u0010+\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0017J&\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020\'H\u0016J\u001a\u00106\u001a\u00020\'2\u0006\u00107\u001a\u00020-2\b\u00103\u001a\u0004\u0018\u000104H\u0016J \u00108\u001a\u00020\'2\u0006\u00109\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010:\u001a\u00020\'2\u0006\u0010;\u001a\u00020\u0006H\u0002J\b\u0010<\u001a\u00020\'H\u0002J\b\u0010=\u001a\u00020\'H\u0002R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001c\u00a8\u0006>"}, d2 = {"Lcom/stemlabs/ellu/ui/component/calendar/fragment/CalendarFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Lcom/github/ik024/calendar_lib/listeners/YearViewClickListeners;", "Landroid/view/View$OnClickListener;", "()V", "c", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getC", "()Ljava/util/Calendar;", "setC", "(Ljava/util/Calendar;)V", "calenderAdapter", "Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter;", "getCalenderAdapter", "()Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter;", "setCalenderAdapter", "(Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter;)V", "isHorizontal", "", "()Z", "setHorizontal", "(Z)V", "month", "", "getMonth", "()I", "setMonth", "(I)V", "strShortsOfWeek", "", "getStrShortsOfWeek", "()Ljava/lang/String;", "setStrShortsOfWeek", "(Ljava/lang/String;)V", "year", "getYear", "setYear", "dateClicked", "", "day", "initializeViewModel", "observeViewModel", "onClick", "p0", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setCalenderData", "date", "setCurrentDate", "cal", "setMonthView", "setOnClickLes", "app_debug"})
public final class CalendarFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements com.github.ik024.calendar_lib.listeners.YearViewClickListeners, android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter calenderAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strShortsOfWeek = "";
    private int year = 0;
    private int month = 0;
    private boolean isHorizontal = true;
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
    
    public final boolean isHorizontal() {
        return false;
    }
    
    public final void setHorizontal(boolean p0) {
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
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    private final void setMonthView() {
    }
    
    private final void setOnClickLes() {
    }
    
    private final void setCurrentDate(java.util.Calendar cal) {
    }
    
    private final void setCalenderData(java.lang.String date, java.lang.String month, java.lang.String year) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void dateClicked(int year, int month, int day) {
    }
    
    public CalendarFragment() {
        super();
    }
}