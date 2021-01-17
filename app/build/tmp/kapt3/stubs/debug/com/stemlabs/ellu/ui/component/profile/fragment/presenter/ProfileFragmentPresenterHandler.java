package com.stemlabs.ellu.ui.component.profile.fragment.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\n"}, d2 = {"Lcom/stemlabs/ellu/ui/component/profile/fragment/presenter/ProfileFragmentPresenterHandler;", "", "getProfile", "", "request", "Lcom/stemlabs/ellu/data/model/request/ApiRequest;", "updateProfile", "img", "Ljava/io/File;", "updateProfileImage", "app_debug"})
public abstract interface ProfileFragmentPresenterHandler {
    
    public abstract void getProfile(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request);
    
    public abstract void updateProfile(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request, @org.jetbrains.annotations.Nullable()
    java.io.File img);
    
    public abstract void updateProfileImage(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request, @org.jetbrains.annotations.Nullable()
    java.io.File img);
}