package com.stemlabs.ellu.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/stemlabs/ellu/di/ErrorModule;", "", "()V", "provideErrorFactoryImpl", "Lcom/stemlabs/ellu/usecase/errors/ErrorFactory;", "errorManager", "Lcom/stemlabs/ellu/usecase/errors/ErrorManager;", "provideErrorMapper", "Lcom/stemlabs/ellu/data/error/mapper/ErrorMapperInterface;", "errorMapper", "Lcom/stemlabs/ellu/data/error/mapper/ErrorMapper;", "app_debug"})
@dagger.Module()
public abstract class ErrorModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.stemlabs.ellu.usecase.errors.ErrorFactory provideErrorFactoryImpl(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.usecase.errors.ErrorManager errorManager);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.stemlabs.ellu.data.error.mapper.ErrorMapperInterface provideErrorMapper(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.error.mapper.ErrorMapper errorMapper);
    
    public ErrorModule() {
        super();
    }
}