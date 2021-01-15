package com.stemlabs.ellu.ui.component.chat.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010\'\u001a\u00020\u0017H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005\u00a8\u0006("}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/fragment/EditSosPagerContactFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "fromWhere", "", "(Ljava/lang/String;)V", "contactHeaderAdapter", "Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter;", "getContactHeaderAdapter", "()Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter;", "setContactHeaderAdapter", "(Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter;)V", "contactHeaderList", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/data/model/ContactHeaderModel;", "getContactHeaderList", "()Ljava/util/ArrayList;", "setContactHeaderList", "(Ljava/util/ArrayList;)V", "getFromWhere", "()Ljava/lang/String;", "setFromWhere", "initView", "", "initializeViewModel", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setHeader", "updateRecyclearView", "app_debug"})
public final class EditSosPagerContactFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.ContactHeaderModel> contactHeaderList;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter contactHeaderAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromWhere;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.ContactHeaderModel> getContactHeaderList() {
        return null;
    }
    
    public final void setContactHeaderList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.ContactHeaderModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter getContactHeaderAdapter() {
        return null;
    }
    
    public final void setContactHeaderAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter p0) {
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
    
    private final void initView() {
    }
    
    private final void updateRecyclearView() {
    }
    
    private final void setHeader() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromWhere() {
        return null;
    }
    
    public final void setFromWhere(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public EditSosPagerContactFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String fromWhere) {
        super();
    }
}