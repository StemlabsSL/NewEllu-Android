package com.stemlabs.ellu.ui.component.proximity.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001dH\u0016J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\'\u001a\u00020\u001f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050)R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006,"}, d2 = {"Lcom/stemlabs/ellu/ui/component/proximity/adapter/ProximityUserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stemlabs/ellu/ui/component/proximity/adapter/ProximityUserAdapter$ProximityUserViewHolder;", "arrayList", "", "Lcom/stemlabs/ellu/data/model/ProximityUserModel;", "isRoundBorder", "", "(Ljava/util/List;Z)V", "getArrayList", "()Ljava/util/List;", "setArrayList", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "()Z", "setRoundBorder", "(Z)V", "listener", "Lcom/stemlabs/ellu/ui/component/proximity/adapter/ProximityUserAdapter$OnClickEvent;", "getListener", "()Lcom/stemlabs/ellu/ui/component/proximity/adapter/ProximityUserAdapter$OnClickEvent;", "setListener", "(Lcom/stemlabs/ellu/ui/component/proximity/adapter/ProximityUserAdapter$OnClickEvent;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickEventListener", "updateList", "proximityUserList", "Ljava/util/ArrayList;", "OnClickEvent", "ProximityUserViewHolder", "app_debug"})
public final class ProximityUserAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter.ProximityUserViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter.OnClickEvent listener;
    @org.jetbrains.annotations.NotNull()
    public android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.stemlabs.ellu.data.model.ProximityUserModel> arrayList;
    private boolean isRoundBorder;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter.OnClickEvent getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter.OnClickEvent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter.ProximityUserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter.ProximityUserViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setClickEventListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter.OnClickEvent listener) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.ProximityUserModel> proximityUserList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stemlabs.ellu.data.model.ProximityUserModel> getArrayList() {
        return null;
    }
    
    public final void setArrayList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.ProximityUserModel> p0) {
    }
    
    public final boolean isRoundBorder() {
        return false;
    }
    
    public final void setRoundBorder(boolean p0) {
    }
    
    public ProximityUserAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.ProximityUserModel> arrayList, boolean isRoundBorder) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/stemlabs/ellu/ui/component/proximity/adapter/ProximityUserAdapter$ProximityUserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imgProximityUser", "Lde/hdodenhof/circleimageview/CircleImageView;", "kotlin.jvm.PlatformType", "getImgProximityUser", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setImgProximityUser", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "app_debug"})
    public static final class ProximityUserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private de.hdodenhof.circleimageview.CircleImageView imgProximityUser;
        
        public final de.hdodenhof.circleimageview.CircleImageView getImgProximityUser() {
            return null;
        }
        
        public final void setImgProximityUser(de.hdodenhof.circleimageview.CircleImageView p0) {
        }
        
        public ProximityUserViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stemlabs/ellu/ui/component/proximity/adapter/ProximityUserAdapter$OnClickEvent;", "", "getClickAt", "", "position", "", "app_debug"})
    public static abstract interface OnClickEvent {
        
        public abstract void getClickAt(int position);
    }
}