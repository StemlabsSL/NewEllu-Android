package com.stemlabs.ellu.data.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0013\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/stemlabs/ellu/data/error/Error;", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "code", "", "description", "", "(ILjava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "Companion", "app_debug"})
public final class Error {
    private final int code = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    public static final int NO_INTERNET_CONNECTION = -1;
    public static final int NETWORK_ERROR = -2;
    public static final int DEFAULT_ERROR = -3;
    public static final com.stemlabs.ellu.data.error.Error.Companion Companion = null;
    
    public final int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public Error(int code, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        super();
    }
    
    public Error(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stemlabs/ellu/data/error/Error$Companion;", "", "()V", "DEFAULT_ERROR", "", "NETWORK_ERROR", "NO_INTERNET_CONNECTION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}