package com.stemlabs.ellu.ui.component.settings.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,-B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0016J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0017J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001dH\u0016J\u000e\u0010\'\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010(\u001a\u00020\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050*R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006."}, d2 = {"Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$SettingListViewHolder;", "arrayList", "", "Lcom/stemlabs/ellu/data/model/SettingsModel;", "(Ljava/util/List;)V", "getArrayList", "()Ljava/util/List;", "setArrayList", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "listener", "Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$OnSelectSetting;", "getListener", "()Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$OnSelectSetting;", "setListener", "(Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$OnSelectSetting;)V", "switchClicks", "Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$switchClick;", "getSwitchClicks", "()Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$switchClick;", "setSwitchClicks", "(Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$switchClick;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClickSwitch", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSettingsClickListener", "updateList", "settingList", "Ljava/util/ArrayList;", "OnSelectSetting", "SettingListViewHolder", "switchClick", "app_debug"})
public final class SettingListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.SettingListViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.OnSelectSetting listener;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.switchClick switchClicks;
    @org.jetbrains.annotations.NotNull()
    public android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.stemlabs.ellu.data.model.SettingsModel> arrayList;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.OnSelectSetting getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.OnSelectSetting p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.switchClick getSwitchClicks() {
        return null;
    }
    
    public final void setSwitchClicks(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.switchClick p0) {
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
    public com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.SettingListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.SettingListViewHolder holder, int position) {
    }
    
    public final void setSettingsClickListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.OnSelectSetting listener) {
    }
    
    public final void onClickSwitch(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter.switchClick listener) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.stemlabs.ellu.data.model.SettingsModel> settingList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stemlabs.ellu.data.model.SettingsModel> getArrayList() {
        return null;
    }
    
    public final void setArrayList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.SettingsModel> p0) {
    }
    
    public SettingListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.SettingsModel> arrayList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\n \u0007*\u0004\u0018\u00010\u00100\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0004\u00a8\u0006\u001f"}, d2 = {"Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$SettingListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imgArrow", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImgArrow", "()Landroid/widget/ImageView;", "setImgArrow", "(Landroid/widget/ImageView;)V", "imgSettingsImage", "getImgSettingsImage", "setImgSettingsImage", "switchAlarmOnOff", "Landroidx/appcompat/widget/SwitchCompat;", "getSwitchAlarmOnOff", "()Landroidx/appcompat/widget/SwitchCompat;", "setSwitchAlarmOnOff", "(Landroidx/appcompat/widget/SwitchCompat;)V", "tvSettingsTitle", "Landroid/widget/TextView;", "getTvSettingsTitle", "()Landroid/widget/TextView;", "setTvSettingsTitle", "(Landroid/widget/TextView;)V", "viewDivider", "getViewDivider", "()Landroid/view/View;", "setViewDivider", "app_debug"})
    public static final class SettingListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgSettingsImage;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvSettingsTitle;
        @org.jetbrains.annotations.NotNull()
        private android.view.View viewDivider;
        private android.widget.ImageView imgArrow;
        private androidx.appcompat.widget.SwitchCompat switchAlarmOnOff;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgSettingsImage() {
            return null;
        }
        
        public final void setImgSettingsImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvSettingsTitle() {
            return null;
        }
        
        public final void setTvSettingsTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getViewDivider() {
            return null;
        }
        
        public final void setViewDivider(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public final android.widget.ImageView getImgArrow() {
            return null;
        }
        
        public final void setImgArrow(android.widget.ImageView p0) {
        }
        
        public final androidx.appcompat.widget.SwitchCompat getSwitchAlarmOnOff() {
            return null;
        }
        
        public final void setSwitchAlarmOnOff(androidx.appcompat.widget.SwitchCompat p0) {
        }
        
        public SettingListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$OnSelectSetting;", "", "selectedServiceAt", "", "position", "", "app_debug"})
    public static abstract interface OnSelectSetting {
        
        public abstract void selectedServiceAt(int position);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stemlabs/ellu/ui/component/settings/adapter/SettingListAdapter$switchClick;", "", "oncick", "", "value", "", "app_debug"})
    public static abstract interface switchClick {
        
        public abstract void oncick(boolean value);
    }
}