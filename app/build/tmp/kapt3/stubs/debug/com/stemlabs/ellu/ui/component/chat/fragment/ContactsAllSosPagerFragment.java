package com.stemlabs.ellu.ui.component.chat.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010\'\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020\u0018H\u0002J\b\u0010*\u001a\u00020\u0018H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006+"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/fragment/ContactsAllSosPagerFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "contactHeaderAdapter", "Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter;", "getContactHeaderAdapter", "()Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter;", "setContactHeaderAdapter", "(Lcom/stemlabs/ellu/ui/component/chat/adapter/ContactHeaderAdapter;)V", "contactHeaderList", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/data/model/ContactHeaderModel;", "getContactHeaderList", "()Ljava/util/ArrayList;", "setContactHeaderList", "(Ljava/util/ArrayList;)V", "status", "", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "initView", "", "initializeViewModel", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setAllContactsData", "setHeader", "setPagerData", "setSOSData", "app_debug"})
public final class ContactsAllSosPagerFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.ContactHeaderModel> contactHeaderList;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter contactHeaderAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status = "All";
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    private final void setHeader() {
    }
    
    @java.lang.Override()
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void setSOSData() {
    }
    
    private final void setPagerData() {
    }
    
    private final void setAllContactsData() {
    }
    
    public ContactsAllSosPagerFragment() {
        super();
    }
}