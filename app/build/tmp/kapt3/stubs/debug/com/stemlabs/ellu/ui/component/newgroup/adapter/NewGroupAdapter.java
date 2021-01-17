package com.stemlabs.ellu.ui.component.newgroup.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001.B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020#H\u0016J\u001c\u0010&\u001a\u00020\'2\n\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010)\u001a\u00020#H\u0016J\u001c\u0010*\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006/"}, d2 = {"Lcom/stemlabs/ellu/ui/component/newgroup/adapter/NewGroupAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stemlabs/ellu/ui/component/newgroup/adapter/NewGroupAdapter$ViewHolder;", "Lcom/viethoa/RecyclerViewFastScroller$BubbleTextGetter;", "list", "", "Lcom/stemlabs/ellu/ui/component/newgroup/model/NewGroupModel;", "context", "Landroid/content/Context;", "callBack", "Lcom/stemlabs/ellu/utils/MyOnItemClickListener;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "status", "", "(Ljava/util/List;Landroid/content/Context;Lcom/stemlabs/ellu/utils/MyOnItemClickListener;Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V", "getCallBack", "()Lcom/stemlabs/ellu/utils/MyOnItemClickListener;", "setCallBack", "(Lcom/stemlabs/ellu/utils/MyOnItemClickListener;)V", "getContext", "()Landroid/content/Context;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getView", "()Landroidx/recyclerview/widget/RecyclerView;", "setView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getItemCount", "", "getTextToShowInBubble", "pos", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class NewGroupAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stemlabs.ellu.ui.component.newgroup.adapter.NewGroupAdapter.ViewHolder> implements com.viethoa.RecyclerViewFastScroller.BubbleTextGetter {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.stemlabs.ellu.ui.component.newgroup.model.NewGroupModel> list;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private com.stemlabs.ellu.utils.MyOnItemClickListener callBack;
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.RecyclerView view;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stemlabs.ellu.ui.component.newgroup.adapter.NewGroupAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.newgroup.adapter.NewGroupAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getTextToShowInBubble(int pos) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stemlabs.ellu.ui.component.newgroup.model.NewGroupModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.ui.component.newgroup.model.NewGroupModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.utils.MyOnItemClickListener getCallBack() {
        return null;
    }
    
    public final void setCallBack(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.utils.MyOnItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public NewGroupAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.ui.component.newgroup.model.NewGroupModel> list, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.utils.MyOnItemClickListener callBack, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/stemlabs/ellu/ui/component/newgroup/adapter/NewGroupAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/stemlabs/ellu/ui/component/newgroup/adapter/NewGroupAdapter;Landroid/view/View;)V", "bindItems", "", "s", "Lcom/stemlabs/ellu/ui/component/newgroup/model/NewGroupModel;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bindItems(@org.jetbrains.annotations.NotNull()
        com.stemlabs.ellu.ui.component.newgroup.model.NewGroupModel s) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}