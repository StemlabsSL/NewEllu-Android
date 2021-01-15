package com.stemlabs.ellu.usecase.errors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stemlabs/ellu/usecase/errors/ErrorManager;", "Lcom/stemlabs/ellu/usecase/errors/ErrorFactory;", "errorMapper", "Lcom/stemlabs/ellu/data/error/mapper/ErrorMapper;", "(Lcom/stemlabs/ellu/data/error/mapper/ErrorMapper;)V", "getError", "Lcom/stemlabs/ellu/data/error/Error;", "errorCode", "", "app_debug"})
public final class ErrorManager implements com.stemlabs.ellu.usecase.errors.ErrorFactory {
    private final com.stemlabs.ellu.data.error.mapper.ErrorMapper errorMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stemlabs.ellu.data.error.Error getError(int errorCode) {
        return null;
    }
    
    @javax.inject.Inject()
    public ErrorManager(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.error.mapper.ErrorMapper errorMapper) {
        super();
    }
}