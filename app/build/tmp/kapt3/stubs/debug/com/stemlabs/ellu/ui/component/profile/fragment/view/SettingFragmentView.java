package com.stemlabs.ellu.ui.component.profile.fragment.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stemlabs/ellu/ui/component/profile/fragment/view/SettingFragmentView;", "Lcom/stemlabs/ellu/ui/component/profile/fragment/view/BaseView;", "onSuccessfullyChangePassword", "", "response", "Lcom/stemlabs/ellu/data/model/CommonResponse;", "app_debug"})
public abstract interface SettingFragmentView extends com.stemlabs.ellu.ui.component.profile.fragment.view.BaseView {
    
    public abstract void onSuccessfullyChangePassword(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.CommonResponse response);
}