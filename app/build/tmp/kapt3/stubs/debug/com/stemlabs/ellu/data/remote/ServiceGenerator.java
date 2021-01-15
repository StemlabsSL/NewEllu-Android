package com.stemlabs.ellu.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/stemlabs/ellu/data/remote/ServiceGenerator;", "", "()V", "contentType", "", "contentTypeValue", "headerInterceptor", "Lokhttp3/Interceptor;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor;", "getLogger", "()Lokhttp3/logging/HttpLoggingInterceptor;", "okHttpBuilder", "Lokhttp3/OkHttpClient$Builder;", "retrofit", "Lretrofit2/Retrofit;", "timeoutConnect", "", "timeoutRead", "createService", "S", "serviceClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class ServiceGenerator {
    private final int timeoutConnect = 30;
    private final int timeoutRead = 30;
    private final java.lang.String contentType = "Content-Type";
    private final java.lang.String contentTypeValue = "application/json";
    private final okhttp3.OkHttpClient.Builder okHttpBuilder = null;
    private final retrofit2.Retrofit retrofit = null;
    private okhttp3.Interceptor headerInterceptor;
    
    private final okhttp3.logging.HttpLoggingInterceptor getLogger() {
        return null;
    }
    
    public final <S extends java.lang.Object>S createService(@org.jetbrains.annotations.NotNull()
    java.lang.Class<S> serviceClass) {
        return null;
    }
    
    @javax.inject.Inject()
    public ServiceGenerator() {
        super();
    }
}