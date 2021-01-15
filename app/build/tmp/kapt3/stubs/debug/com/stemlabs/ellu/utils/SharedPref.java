package com.stemlabs.ellu.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fJ\u001c\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018J\u0016\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000fJ\u0016\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0012J\u0016\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0014J\u0016\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/stemlabs/ellu/utils/SharedPref;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "clearAllPreferences", "", "getArrayList", "", "", "key", "getBoolean", "", "name", "getFloat", "", "getInt", "", "getString", "setArrayList", "_value", "", "setBoolean", "value", "setFloat", "setInt", "setString", "Companion", "app_debug"})
public final class SharedPref {
    private android.content.SharedPreferences sharedPreferences;
    public static final com.stemlabs.ellu.utils.SharedPref.Companion Companion = null;
    
    public final void setString(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final void setBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean value) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public final void setInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int _value) {
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    public final void setFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float _value) {
    }
    
    public final float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0.0F;
    }
    
    public final void setArrayList(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> _value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getArrayList(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void clearAllPreferences() {
    }
    
    private SharedPref(android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stemlabs/ellu/utils/SharedPref$Companion;", "Lcom/stemlabs/ellu/utils/SingletonHolder;", "Lcom/stemlabs/ellu/utils/SharedPref;", "Landroid/content/Context;", "()V", "app_debug"})
    public static final class Companion extends com.stemlabs.ellu.utils.SingletonHolder<com.stemlabs.ellu.utils.SharedPref, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}