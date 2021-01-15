package com.stemlabs.ellu.ui.component.sos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020FH\u0014J\b\u0010H\u001a\u00020FH\u0016J\u0012\u0010I\u001a\u00020F2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J&\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010P2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\b\u0010S\u001a\u00020FH\u0016J\u001a\u0010T\u001a\u00020F2\u0006\u0010U\u001a\u00020K2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\b\u0010V\u001a\u00020FH\u0002J\b\u0010W\u001a\u00020FH\u0002J\b\u0010X\u001a\u00020FH\u0002J\b\u0010Y\u001a\u00020FH\u0002J\u0010\u0010Z\u001a\u00020F2\u0006\u0010[\u001a\u00020KH\u0002J\b\u0010\\\u001a\u00020FH\u0002J\b\u0010]\u001a\u00020FH\u0002J\b\u0010^\u001a\u00020FH\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R\u001c\u00106\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u00a8\u0006_"}, d2 = {"Lcom/stemlabs/ellu/ui/component/sos/SosFragment;", "Lcom/stemlabs/ellu/ui/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "fromWhere", "", "(Ljava/lang/String;)V", "chatAdapter", "Lcom/stemlabs/ellu/ui/component/chat/adapter/IndividualChatHeaderSosAdapter;", "getChatAdapter", "()Lcom/stemlabs/ellu/ui/component/chat/adapter/IndividualChatHeaderSosAdapter;", "setChatAdapter", "(Lcom/stemlabs/ellu/ui/component/chat/adapter/IndividualChatHeaderSosAdapter;)V", "chatList", "Ljava/util/ArrayList;", "Lcom/stemlabs/ellu/data/model/IndividualChatHeaderModel;", "getChatList", "()Ljava/util/ArrayList;", "setChatList", "(Ljava/util/ArrayList;)V", "getFromWhere", "()Ljava/lang/String;", "setFromWhere", "isSearchEnable", "", "()Z", "setSearchEnable", "(Z)V", "muteNotificationDialog", "Lcom/stemlabs/ellu/ui/component/chat/dialog/MuteNotificationDialog;", "getMuteNotificationDialog", "()Lcom/stemlabs/ellu/ui/component/chat/dialog/MuteNotificationDialog;", "setMuteNotificationDialog", "(Lcom/stemlabs/ellu/ui/component/chat/dialog/MuteNotificationDialog;)V", "pagerDialog", "Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog;", "getPagerDialog", "()Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog;", "setPagerDialog", "(Lcom/stemlabs/ellu/ui/component/chat/dialog/PagerDialog;)V", "popUpBlockChatDialog", "Lcom/stemlabs/ellu/ui/component/chat/dialog/ReportChatDialog;", "getPopUpBlockChatDialog", "()Lcom/stemlabs/ellu/ui/component/chat/dialog/ReportChatDialog;", "setPopUpBlockChatDialog", "(Lcom/stemlabs/ellu/ui/component/chat/dialog/ReportChatDialog;)V", "popUpChatItemDialog", "Lcom/stemlabs/ellu/ui/component/chat/dialog/PopUpChatItemDialog;", "getPopUpChatItemDialog", "()Lcom/stemlabs/ellu/ui/component/chat/dialog/PopUpChatItemDialog;", "setPopUpChatItemDialog", "(Lcom/stemlabs/ellu/ui/component/chat/dialog/PopUpChatItemDialog;)V", "popUpClearChatDialog", "getPopUpClearChatDialog", "setPopUpClearChatDialog", "popUpReportChatDialog", "getPopUpReportChatDialog", "setPopUpReportChatDialog", "shareLocationDialog", "Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog;", "getShareLocationDialog", "()Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog;", "setShareLocationDialog", "(Lcom/stemlabs/ellu/ui/component/chat/dialog/ShareLocationDialog;)V", "sosEndDialog", "Lcom/stemlabs/ellu/ui/component/sos/dialog/SosEndOverlayDialog;", "getSosEndDialog", "()Lcom/stemlabs/ellu/ui/component/sos/dialog/SosEndOverlayDialog;", "setSosEndDialog", "(Lcom/stemlabs/ellu/ui/component/sos/dialog/SosEndOverlayDialog;)V", "initView", "", "initializeViewModel", "observeViewModel", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "openBlockUserDialog", "openChatAction", "openClearChatDialog", "openMuteNotificationDialog", "openPopUpMoreMenu", "actionMore", "openReportDialog", "openShareLocationDialog", "setData", "app_debug"})
public final class SosFragment extends com.stemlabs.ellu.ui.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.stemlabs.ellu.data.model.IndividualChatHeaderModel> chatList;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatHeaderSosAdapter chatAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.chat.dialog.PopUpChatItemDialog popUpChatItemDialog;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog pagerDialog;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.sos.dialog.SosEndOverlayDialog sosEndDialog;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.chat.dialog.ReportChatDialog popUpReportChatDialog;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog shareLocationDialog;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.chat.dialog.ReportChatDialog popUpClearChatDialog;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.chat.dialog.ReportChatDialog popUpBlockChatDialog;
    @org.jetbrains.annotations.Nullable()
    private com.stemlabs.ellu.ui.component.chat.dialog.MuteNotificationDialog muteNotificationDialog;
    private boolean isSearchEnable = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromWhere;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.stemlabs.ellu.data.model.IndividualChatHeaderModel> getChatList() {
        return null;
    }
    
    public final void setChatList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.IndividualChatHeaderModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatHeaderSosAdapter getChatAdapter() {
        return null;
    }
    
    public final void setChatAdapter(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatHeaderSosAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.chat.dialog.PopUpChatItemDialog getPopUpChatItemDialog() {
        return null;
    }
    
    public final void setPopUpChatItemDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.chat.dialog.PopUpChatItemDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog getPagerDialog() {
        return null;
    }
    
    public final void setPagerDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.sos.dialog.SosEndOverlayDialog getSosEndDialog() {
        return null;
    }
    
    public final void setSosEndDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.sos.dialog.SosEndOverlayDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.chat.dialog.ReportChatDialog getPopUpReportChatDialog() {
        return null;
    }
    
    public final void setPopUpReportChatDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.chat.dialog.ReportChatDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog getShareLocationDialog() {
        return null;
    }
    
    public final void setShareLocationDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.chat.dialog.ReportChatDialog getPopUpClearChatDialog() {
        return null;
    }
    
    public final void setPopUpClearChatDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.chat.dialog.ReportChatDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.chat.dialog.ReportChatDialog getPopUpBlockChatDialog() {
        return null;
    }
    
    public final void setPopUpBlockChatDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.chat.dialog.ReportChatDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stemlabs.ellu.ui.component.chat.dialog.MuteNotificationDialog getMuteNotificationDialog() {
        return null;
    }
    
    public final void setMuteNotificationDialog(@org.jetbrains.annotations.Nullable()
    com.stemlabs.ellu.ui.component.chat.dialog.MuteNotificationDialog p0) {
    }
    
    public final boolean isSearchEnable() {
        return false;
    }
    
    public final void setSearchEnable(boolean p0) {
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
    protected void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setData() {
    }
    
    private final void initView() {
    }
    
    private final void openChatAction() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void openPopUpMoreMenu(android.view.View actionMore) {
    }
    
    private final void openReportDialog() {
    }
    
    private final void openShareLocationDialog() {
    }
    
    private final void openBlockUserDialog() {
    }
    
    private final void openMuteNotificationDialog() {
    }
    
    private final void openClearChatDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromWhere() {
        return null;
    }
    
    public final void setFromWhere(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public SosFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String fromWhere) {
        super();
    }
}