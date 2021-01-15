package com.stemlabs.ellu.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/stemlabs/ellu/data/DataRepository;", "Lcom/stemlabs/ellu/data/DataRepositorySource;", "remoteRepository", "Lcom/stemlabs/ellu/data/remote/RemoteData;", "localRepository", "Lcom/stemlabs/ellu/data/local/LocalData;", "(Lcom/stemlabs/ellu/data/remote/RemoteData;Lcom/stemlabs/ellu/data/local/LocalData;)V", "requestLanguages", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stemlabs/ellu/data/Resource;", "Lcom/stemlabs/ellu/data/remote/dto/LanguageModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DataRepository implements com.stemlabs.ellu.data.DataRepositorySource {
    private final com.stemlabs.ellu.data.remote.RemoteData remoteRepository = null;
    private final com.stemlabs.ellu.data.local.LocalData localRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestLanguages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.stemlabs.ellu.data.Resource<com.stemlabs.ellu.data.remote.dto.LanguageModel>>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public DataRepository(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.remote.RemoteData remoteRepository, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.local.LocalData localRepository) {
        super();
    }
}