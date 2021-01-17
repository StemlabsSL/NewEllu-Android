package com.stemlabs.ellu.ui.component.calendar.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/stemlabs/ellu/ui/component/calendar/adapter/EventAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stemlabs/ellu/ui/component/calendar/adapter/EventAdapter$CalenderViewHolder;", "arrayList", "", "Lcom/stemlabs/ellu/data/model/EventModel;", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CalenderViewHolder", "app_debug"})
public final class EventAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stemlabs.ellu.ui.component.calendar.adapter.EventAdapter.CalenderViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public android.content.Context context;
    private java.util.List<com.stemlabs.ellu.data.model.EventModel> arrayList;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stemlabs.ellu.ui.component.calendar.adapter.EventAdapter.CalenderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.calendar.adapter.EventAdapter.CalenderViewHolder holder, int position) {
    }
    
    public EventAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.EventModel> arrayList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010#\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001c\u00a8\u0006&"}, d2 = {"Lcom/stemlabs/ellu/ui/component/calendar/adapter/EventAdapter$CalenderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroid/view/View;", "(Lcom/stemlabs/ellu/ui/component/calendar/adapter/EventAdapter;Landroid/view/View;)V", "itemLayout", "Landroid/widget/LinearLayout;", "getItemLayout", "()Landroid/widget/LinearLayout;", "setItemLayout", "(Landroid/widget/LinearLayout;)V", "ivAddress", "Landroid/widget/ImageView;", "getIvAddress", "()Landroid/widget/ImageView;", "setIvAddress", "(Landroid/widget/ImageView;)V", "ivDate", "getIvDate", "setIvDate", "ivPerson", "getIvPerson", "setIvPerson", "tvAddress", "Landroid/widget/TextView;", "getTvAddress", "()Landroid/widget/TextView;", "setTvAddress", "(Landroid/widget/TextView;)V", "tvDate", "getTvDate", "setTvDate", "tvTitle", "getTvTitle", "setTvTitle", "tvUserName", "getTvUserName", "setTvUserName", "app_debug"})
    public final class CalenderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout itemLayout;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvDate;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvAddress;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvUserName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView ivDate;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView ivAddress;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView ivPerson;
        private android.view.View binding;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getItemLayout() {
            return null;
        }
        
        public final void setItemLayout(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvTitle() {
            return null;
        }
        
        public final void setTvTitle(@org.jetbrains.annotations.NotNull()
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
        public final android.widget.TextView getTvAddress() {
            return null;
        }
        
        public final void setTvAddress(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvUserName() {
            return null;
        }
        
        public final void setTvUserName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvDate() {
            return null;
        }
        
        public final void setIvDate(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvAddress() {
            return null;
        }
        
        public final void setIvAddress(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvPerson() {
            return null;
        }
        
        public final void setIvPerson(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public CalenderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View binding) {
            super(null);
        }
    }
}