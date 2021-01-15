package com.stemlabs.ellu.ui.component.chat.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002,-B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020 2\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0016J\u000e\u0010\'\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010(\u001a\u00020 2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00050*j\b\u0012\u0004\u0012\u00020\u0005`+R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006."}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter$ContactHeaderViewHolder;", "arrayList", "", "Lcom/stemlabs/ellu/data/model/ContactHeaderModel;", "fromWhere", "", "(Ljava/util/List;Ljava/lang/String;)V", "getArrayList", "()Ljava/util/List;", "setArrayList", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getFromWhere", "()Ljava/lang/String;", "setFromWhere", "(Ljava/lang/String;)V", "listener", "Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter$OnSelectContact;", "getListener", "()Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter$OnSelectContact;", "setListener", "(Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter$OnSelectContact;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setContactClickEventListener", "updateList", "contactList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ContactHeaderViewHolder", "OnSelectContact", "app_debug"})
public final class ContactHeaderAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter.ContactHeaderViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter.OnSelectContact listener;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.stemlabs.ellu.data.model.ContactHeaderModel> arrayList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromWhere;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter.OnSelectContact getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter.OnSelectContact p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter.ContactHeaderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter.ContactHeaderViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setContactClickEventListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter.OnSelectContact listener) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.ContactHeaderModel> contactList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stemlabs.ellu.data.model.ContactHeaderModel> getArrayList() {
        return null;
    }
    
    public final void setArrayList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.ContactHeaderModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromWhere() {
        return null;
    }
    
    public final void setFromWhere(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ContactHeaderAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.ContactHeaderModel> arrayList, @org.jetbrains.annotations.NotNull()
    java.lang.String fromWhere) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter$ContactHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter;Landroid/view/View;)V", "rvContacts", "Landroidx/recyclerview/widget/RecyclerView;", "getRvContacts", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvContacts", "(Landroidx/recyclerview/widget/RecyclerView;)V", "tvHeaderContact", "Landroid/widget/TextView;", "getTvHeaderContact", "()Landroid/widget/TextView;", "setTvHeaderContact", "(Landroid/widget/TextView;)V", "app_debug"})
    public final class ContactHeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvHeaderContact;
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView rvContacts;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvHeaderContact() {
            return null;
        }
        
        public final void setTvHeaderContact(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRvContacts() {
            return null;
        }
        
        public final void setRvContacts(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        public ContactHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter$OnSelectContact;", "", "getNotificationClickedAt", "", "outerPosition", "", "innerPosition", "getProfileClickedAt", "getRadioClickedAt", "getRowClickedAt", "getSOSClickedAt", "app_debug"})
    public static abstract interface OnSelectContact {
        
        public abstract void getProfileClickedAt(int outerPosition, int innerPosition);
        
        public abstract void getRowClickedAt(int outerPosition, int innerPosition);
        
        public abstract void getNotificationClickedAt(int outerPosition, int innerPosition);
        
        public abstract void getSOSClickedAt(int outerPosition, int innerPosition);
        
        public abstract void getRadioClickedAt(int outerPosition, int innerPosition);
    }
}