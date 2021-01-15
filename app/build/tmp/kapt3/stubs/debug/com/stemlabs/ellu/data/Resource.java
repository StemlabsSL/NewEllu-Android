package com.stemlabs.ellu.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/stemlabs/ellu/data/Resource;", "T", "", "()V", "DataError", "DataErrorBody", "Loading", "Success", "Lcom/stemlabs/ellu/data/Resource$Success;", "Lcom/stemlabs/ellu/data/Resource$Loading;", "Lcom/stemlabs/ellu/data/Resource$DataError;", "Lcom/stemlabs/ellu/data/Resource$DataErrorBody;", "app_debug"})
public abstract class Resource<T extends java.lang.Object> {
    
    private Resource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0005R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/stemlabs/ellu/data/Resource$Success;", "T", "", "Lcom/stemlabs/ellu/data/Resource;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.stemlabs.ellu.data.Resource<T> {
        @org.jetbrains.annotations.Nullable()
        private final T data = null;
        
        @org.jetbrains.annotations.Nullable()
        public final T getData() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.Nullable()
        T data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/stemlabs/ellu/data/Resource$Loading;", "T", "", "Lcom/stemlabs/ellu/data/Resource;", "data", "(Ljava/lang/Object;)V", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.stemlabs.ellu.data.Resource<T> {
        
        public Loading(@org.jetbrains.annotations.Nullable()
        T data) {
            super();
        }
        
        public Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/stemlabs/ellu/data/Resource$DataError;", "T", "", "Lcom/stemlabs/ellu/data/Resource;", "errorCode", "", "(I)V", "getErrorCode", "()I", "app_debug"})
    public static final class DataError<T extends java.lang.Object> extends com.stemlabs.ellu.data.Resource<T> {
        private final int errorCode = 0;
        
        public final int getErrorCode() {
            return 0;
        }
        
        public DataError(int errorCode) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/stemlabs/ellu/data/Resource$DataErrorBody;", "T", "", "Lcom/stemlabs/ellu/data/Resource;", "errorBody", "Lcom/bluebird/partner/data/remote/dto/ErrorModel;", "(Lcom/bluebird/partner/data/remote/dto/ErrorModel;)V", "getErrorBody", "()Lcom/bluebird/partner/data/remote/dto/ErrorModel;", "app_debug"})
    public static final class DataErrorBody<T extends java.lang.Object> extends com.stemlabs.ellu.data.Resource<T> {
        @org.jetbrains.annotations.NotNull()
        private final com.bluebird.partner.data.remote.dto.ErrorModel errorBody = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.bluebird.partner.data.remote.dto.ErrorModel getErrorBody() {
            return null;
        }
        
        public DataErrorBody(@org.jetbrains.annotations.NotNull()
        com.bluebird.partner.data.remote.dto.ErrorModel errorBody) {
            super();
        }
    }
}