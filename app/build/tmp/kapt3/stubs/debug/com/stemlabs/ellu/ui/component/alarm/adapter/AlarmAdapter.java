package com.stemlabs.ellu.ui.component.alarm.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\'(B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010$\u001a\u00020\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050&R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter$AlarmViewHolder;", "arrayList", "", "Lcom/stemlabs/ellu/data/model/AlarmModel;", "(Ljava/util/List;)V", "getArrayList", "()Ljava/util/List;", "setArrayList", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "listener", "Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter$OnSelectAlarm;", "getListener", "()Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter$OnSelectAlarm;", "setListener", "(Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter$OnSelectAlarm;)V", "viewBinderHelper", "Lcom/chauthai/swipereveallayout/ViewBinderHelper;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeAlarmAt", "setAlarmClickListener", "updateList", "alarmList", "Ljava/util/ArrayList;", "AlarmViewHolder", "OnSelectAlarm", "app_debug"})
public final class AlarmAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter.AlarmViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter.OnSelectAlarm listener;
    private final com.chauthai.swipereveallayout.ViewBinderHelper viewBinderHelper = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.stemlabs.ellu.data.model.AlarmModel> arrayList;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter.OnSelectAlarm getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter.OnSelectAlarm p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter.AlarmViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter.AlarmViewHolder holder, int position) {
    }
    
    public final void setAlarmClickListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter.OnSelectAlarm listener) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.AlarmModel> alarmList) {
    }
    
    public final void removeAlarmAt(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stemlabs.ellu.data.model.AlarmModel> getArrayList() {
        return null;
    }
    
    public final void setArrayList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.AlarmModel> p0) {
    }
    
    public AlarmAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.AlarmModel> arrayList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.\u00a8\u00062"}, d2 = {"Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter$AlarmViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter;Landroid/view/View;)V", "cardMain", "Landroidx/cardview/widget/CardView;", "getCardMain", "()Landroidx/cardview/widget/CardView;", "setCardMain", "(Landroidx/cardview/widget/CardView;)V", "imgDelete", "Landroid/widget/ImageView;", "getImgDelete", "()Landroid/widget/ImageView;", "setImgDelete", "(Landroid/widget/ImageView;)V", "ll_delete", "Landroid/widget/LinearLayout;", "getLl_delete", "()Landroid/widget/LinearLayout;", "setLl_delete", "(Landroid/widget/LinearLayout;)V", "rvAlarmCalendar", "Landroidx/recyclerview/widget/RecyclerView;", "getRvAlarmCalendar", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvAlarmCalendar", "(Landroidx/recyclerview/widget/RecyclerView;)V", "swipe_main", "Lcom/chauthai/swipereveallayout/SwipeRevealLayout;", "getSwipe_main", "()Lcom/chauthai/swipereveallayout/SwipeRevealLayout;", "setSwipe_main", "(Lcom/chauthai/swipereveallayout/SwipeRevealLayout;)V", "switchAlarmOnOff", "Landroidx/appcompat/widget/SwitchCompat;", "getSwitchAlarmOnOff", "()Landroidx/appcompat/widget/SwitchCompat;", "setSwitchAlarmOnOff", "(Landroidx/appcompat/widget/SwitchCompat;)V", "tvAlarmTime", "Landroid/widget/TextView;", "getTvAlarmTime", "()Landroid/widget/TextView;", "setTvAlarmTime", "(Landroid/widget/TextView;)V", "tvAlarmTitle", "getTvAlarmTitle", "setTvAlarmTitle", "app_debug"})
    public final class AlarmViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView rvAlarmCalendar;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvAlarmTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvAlarmTitle;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.SwitchCompat switchAlarmOnOff;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout ll_delete;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgDelete;
        @org.jetbrains.annotations.NotNull()
        private com.chauthai.swipereveallayout.SwipeRevealLayout swipe_main;
        @org.jetbrains.annotations.NotNull()
        private androidx.cardview.widget.CardView cardMain;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRvAlarmCalendar() {
            return null;
        }
        
        public final void setRvAlarmCalendar(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAlarmTime() {
            return null;
        }
        
        public final void setTvAlarmTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAlarmTitle() {
            return null;
        }
        
        public final void setTvAlarmTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.SwitchCompat getSwitchAlarmOnOff() {
            return null;
        }
        
        public final void setSwitchAlarmOnOff(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.SwitchCompat p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLl_delete() {
            return null;
        }
        
        public final void setLl_delete(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgDelete() {
            return null;
        }
        
        public final void setImgDelete(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.chauthai.swipereveallayout.SwipeRevealLayout getSwipe_main() {
            return null;
        }
        
        public final void setSwipe_main(@org.jetbrains.annotations.NotNull()
        com.chauthai.swipereveallayout.SwipeRevealLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardMain() {
            return null;
        }
        
        public final void setCardMain(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView p0) {
        }
        
        public AlarmViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/stemlabs/ellu/ui/component/alarm/adapter/AlarmAdapter$OnSelectAlarm;", "", "onDeleteAt", "", "position", "", "onSelectAlarmAt", "onSelectDayAt", "outerPosition", "innerPosition", "onSelectSwitchAt", "app_debug"})
    public static abstract interface OnSelectAlarm {
        
        public abstract void onSelectAlarmAt(int position);
        
        public abstract void onSelectSwitchAt(int position);
        
        public abstract void onSelectDayAt(int outerPosition, int innerPosition);
        
        public abstract void onDeleteAt(int position);
    }
}