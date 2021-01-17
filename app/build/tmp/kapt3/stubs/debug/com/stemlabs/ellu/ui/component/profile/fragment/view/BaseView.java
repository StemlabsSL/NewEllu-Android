package com.stemlabs.ellu.ui.component.profile.fragment.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/stemlabs/ellu/ui/component/profile/fragment/view/BaseView;", "", "hideProgressBar", "", "showMessage", "message", "", "showProgressBar", "app_debug"})
public abstract interface BaseView {
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void hideProgressBar();
    
    public abstract void showProgressBar(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
}