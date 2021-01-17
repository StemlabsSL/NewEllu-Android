package com.stemlabs.ellu.ui.component.calendar.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002./B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u001c\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020\u000eH\u0016J\u001c\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000eH\u0016J\u000e\u0010*\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010+\u001a\u00020#2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u00060"}, d2 = {"Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter$CalenderViewHolder;", "arrayList", "", "Lcom/stemlabs/ellu/data/model/CalenderModel;", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "iRow", "", "getIRow", "()I", "setIRow", "(I)V", "isHorizontal", "", "()Z", "setHorizontal", "(Z)V", "onSelectCalender", "Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter$OnSelectCalender;", "getOnSelectCalender", "()Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter$OnSelectCalender;", "setOnSelectCalender", "(Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter$OnSelectCalender;)V", "getItemCount", "getProperDate", "", "day", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDateVisible", "updateList", "calenderList", "Ljava/util/ArrayList;", "CalenderViewHolder", "OnSelectCalender", "app_debug"})
public final class CalenderAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter.CalenderViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter.OnSelectCalender onSelectCalender;
    private int iRow = -1;
    private boolean isHorizontal = true;
    private java.util.List<com.stemlabs.ellu.data.model.CalenderModel> arrayList;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter.OnSelectCalender getOnSelectCalender() {
        return null;
    }
    
    public final void setOnSelectCalender(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter.OnSelectCalender p0) {
    }
    
    public final int getIRow() {
        return 0;
    }
    
    public final void setIRow(int p0) {
    }
    
    public final boolean isHorizontal() {
        return false;
    }
    
    public final void setHorizontal(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter.CalenderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter.CalenderViewHolder holder, int position) {
    }
    
    private final java.lang.String getProperDate(java.lang.String day) {
        return null;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.CalenderModel> calenderList) {
    }
    
    public final void setDateVisible(boolean isHorizontal) {
    }
    
    public CalenderAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.CalenderModel> arrayList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c\u00a8\u0006 "}, d2 = {"Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter$CalenderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroid/view/View;", "(Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter;Landroid/view/View;)V", "frameCalendarMain", "Landroid/widget/FrameLayout;", "getFrameCalendarMain", "()Landroid/widget/FrameLayout;", "setFrameCalendarMain", "(Landroid/widget/FrameLayout;)V", "imgCalendarDots", "Landroid/widget/ImageView;", "getImgCalendarDots", "()Landroid/widget/ImageView;", "setImgCalendarDots", "(Landroid/widget/ImageView;)V", "llMainCalnder", "Landroid/widget/LinearLayout;", "getLlMainCalnder", "()Landroid/widget/LinearLayout;", "setLlMainCalnder", "(Landroid/widget/LinearLayout;)V", "tvDate", "Landroid/widget/TextView;", "getTvDate", "()Landroid/widget/TextView;", "setTvDate", "(Landroid/widget/TextView;)V", "tvDay", "getTvDay", "setTvDay", "app_debug"})
    public final class CalenderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llMainCalnder;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvDay;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvDate;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgCalendarDots;
        @org.jetbrains.annotations.NotNull()
        private android.widget.FrameLayout frameCalendarMain;
        private android.view.View binding;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlMainCalnder() {
            return null;
        }
        
        public final void setLlMainCalnder(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDay() {
            return null;
        }
        
        public final void setTvDay(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDate() {
            return null;
        }
        
        public final void setTvDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgCalendarDots() {
            return null;
        }
        
        public final void setImgCalendarDots(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.FrameLayout getFrameCalendarMain() {
            return null;
        }
        
        public final void setFrameCalendarMain(@org.jetbrains.annotations.NotNull()
        android.widget.FrameLayout p0) {
        }
        
        public CalenderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/stemlabs/ellu/ui/component/calendar/adapter/CalenderAdapter$OnSelectCalender;", "", "onClickCalenderView", "", "calenderModel", "Lcom/stemlabs/ellu/data/model/CalenderModel;", "position", "", "app_debug"})
    public static abstract interface OnSelectCalender {
        
        public abstract void onClickCalenderView(@org.jetbrains.annotations.NotNull()
        com.stemlabs.ellu.data.model.CalenderModel calenderModel, int position);
    }
}