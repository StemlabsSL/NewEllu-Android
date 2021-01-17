package com.stemlabs.ellu.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J5\u0010\u0005\u001a\u0004\u0018\u00010\u00062 \u0010\u0007\u001a\u001c\b\u0001\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/stemlabs/ellu/data/remote/RemoteData;", "Lcom/stemlabs/ellu/data/remote/RemoteDataSource;", "serviceGenerator", "Lcom/stemlabs/ellu/data/remote/ServiceGenerator;", "(Lcom/stemlabs/ellu/data/remote/ServiceGenerator;)V", "processCall", "", "responseCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestLanguage", "Lcom/stemlabs/ellu/data/Resource;", "Lcom/stemlabs/ellu/data/remote/dto/LanguageModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteData implements com.stemlabs.ellu.data.remote.RemoteDataSource {
    private final com.stemlabs.ellu.data.remote.ServiceGenerator serviceGenerator = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestLanguage(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stemlabs.ellu.data.Resource<com.stemlabs.ellu.data.remote.dto.LanguageModel>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public RemoteData(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.remote.ServiceGenerator serviceGenerator) {
        super();
    }
}