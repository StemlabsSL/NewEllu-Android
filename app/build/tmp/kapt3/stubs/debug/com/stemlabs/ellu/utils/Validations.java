package com.stemlabs.ellu.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/stemlabs/ellu/utils/Validations;", "", "()V", "isDifferentPassword", "", "oldPass", "", "newPass", "isFieldEmpty", "field", "isInvalidCVV", "isInvalidEmail", "isInvalidNumber", "isShortPassword", "app_debug"})
public final class Validations {
    public static final com.stemlabs.ellu.utils.Validations INSTANCE = null;
    
    public final boolean isFieldEmpty(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return false;
    }
    
    public final boolean isInvalidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return false;
    }
    
    public final boolean isInvalidNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return false;
    }
    
    public final boolean isShortPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return false;
    }
    
    public final boolean isInvalidCVV(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return false;
    }
    
    public final boolean isDifferentPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String oldPass, @org.jetbrains.annotations.NotNull()
    java.lang.String newPass) {
        return false;
    }
    
    private Validations() {
        super();
    }
}