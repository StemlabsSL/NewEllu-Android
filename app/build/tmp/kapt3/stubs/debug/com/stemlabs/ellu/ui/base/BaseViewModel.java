package com.stemlabs.ellu.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stemlabs/ellu/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorManager", "Lcom/stemlabs/ellu/usecase/errors/ErrorManager;", "getErrorManager", "()Lcom/stemlabs/ellu/usecase/errors/ErrorManager;", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * Inject Singleton ErrorManager
     * Use this errorManager to get the Errors
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.stemlabs.ellu.usecase.errors.ErrorManager getErrorManager();
    
    public BaseViewModel() {
        super();
    }
}