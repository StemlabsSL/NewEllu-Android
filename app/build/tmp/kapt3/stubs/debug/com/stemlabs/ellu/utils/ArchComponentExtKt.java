package com.stemlabs.ellu.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b\u00a2\u0006\u0002\u0010\u0006\u001aA\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u0011H\u0001\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\r\u001aM\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u0001*\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00120\u000b2\'\u0010\f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00010\u0012\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\r\u00a8\u0006\u0013"}, d2 = {"getViewModel", "T", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModel;", "observe", "", "Landroidx/lifecycle/LifecycleOwner;", "liveData", "Landroidx/lifecycle/LiveData;", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "t", "observeEvent", "Lcom/stemlabs/ellu/utils/Event;", "app_debug"})
public final class ArchComponentExtKt {
    
    public static final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$observe, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
    
    public static final <T extends java.lang.Object>void observeEvent(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$observeEvent, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.stemlabs.ellu.utils.Event<T>> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stemlabs.ellu.utils.Event<? extends T>, kotlin.Unit> action) {
    }
}