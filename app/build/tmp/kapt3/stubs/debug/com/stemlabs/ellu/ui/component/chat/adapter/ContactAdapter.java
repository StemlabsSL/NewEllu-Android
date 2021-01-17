package com.stemlabs.ellu.ui.component.chat.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0016J\u000e\u0010\'\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010(\u001a\u00020 2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050*R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006-"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactAdapter$ContactViewHolder;", "arrayList", "", "Lcom/stemlabs/ellu/data/model/ContactModel;", "fromWhere", "", "(Ljava/util/List;Ljava/lang/String;)V", "getArrayList", "()Ljava/util/List;", "setArrayList", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getFromWhere", "()Ljava/lang/String;", "setFromWhere", "(Ljava/lang/String;)V", "listener", "Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactAdapter$OnSelectContact;", "getListener", "()Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactAdapter$OnSelectContact;", "setListener", "(Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactAdapter$OnSelectContact;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickEventListener", "updateList", "contactList", "Ljava/util/ArrayList;", "ContactViewHolder", "OnSelectContact", "app_debug"})
public final class ContactAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stemlabs.ellu.ui.component.chat.adapter.ContactAdapter.ContactViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.chat.adapter.ContactAdapter.OnSelectContact listener;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.stemlabs.ellu.data.model.ContactModel> arrayList;
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
    public final com.stemlabs.ellu.ui.component.chat.adapter.ContactAdapter.OnSelectContact getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.ContactAdapter.OnSelectContact p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stemlabs.ellu.ui.component.chat.adapter.ContactAdapter.ContactViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.ContactAdapter.ContactViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setClickEventListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.ContactAdapter.OnSelectContact listener) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.ContactModel> contactList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stemlabs.ellu.data.model.ContactModel> getArrayList() {
        return null;
    }
    
    public final void setArrayList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.ContactModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromWhere() {
        return null;
    }
    
    public final void setFromWhere(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ContactAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.ContactModel> arrayList, @org.jetbrains.annotations.NotNull()
    java.lang.String fromWhere) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0004\u00a8\u0006!"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactAdapter$ContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imgContactPersonProfile", "Lde/hdodenhof/circleimageview/CircleImageView;", "getImgContactPersonProfile", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setImgContactPersonProfile", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "imgNotification", "Landroid/widget/ImageView;", "getImgNotification", "()Landroid/widget/ImageView;", "setImgNotification", "(Landroid/widget/ImageView;)V", "imgRadioButton", "getImgRadioButton", "setImgRadioButton", "tvContactPersonName", "Landroid/widget/TextView;", "getTvContactPersonName", "()Landroid/widget/TextView;", "setTvContactPersonName", "(Landroid/widget/TextView;)V", "tvSOSLBL", "getTvSOSLBL", "setTvSOSLBL", "viewDivider", "getViewDivider", "()Landroid/view/View;", "setViewDivider", "app_debug"})
    public static final class ContactViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private de.hdodenhof.circleimageview.CircleImageView imgContactPersonProfile;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvContactPersonName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgNotification;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgRadioButton;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvSOSLBL;
        @org.jetbrains.annotations.NotNull()
        private android.view.View viewDivider;
        
        @org.jetbrains.annotations.NotNull()
        public final de.hdodenhof.circleimageview.CircleImageView getImgContactPersonProfile() {
            return null;
        }
        
        public final void setImgContactPersonProfile(@org.jetbrains.annotations.NotNull()
        de.hdodenhof.circleimageview.CircleImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvContactPersonName() {
            return null;
        }
        
        public final void setTvContactPersonName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgNotification() {
            return null;
        }
        
        public final void setImgNotification(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgRadioButton() {
            return null;
        }
        
        public final void setImgRadioButton(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvSOSLBL() {
            return null;
        }
        
        public final void setTvSOSLBL(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getViewDivider() {
            return null;
        }
        
        public final void setViewDivider(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public ContactViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactAdapter$OnSelectContact;", "", "getNotificationClickedAt", "", "position", "", "getProfileClickedAt", "getRadioClickedAt", "getRowClickedAt", "getSOSClickedAt", "app_debug"})
    public static abstract interface OnSelectContact {
        
        public abstract void getProfileClickedAt(int position);
        
        public abstract void getRowClickedAt(int position);
        
        public abstract void getNotificationClickedAt(int position);
        
        public abstract void getSOSClickedAt(int position);
        
        public abstract void getRadioClickedAt(int position);
    }
}