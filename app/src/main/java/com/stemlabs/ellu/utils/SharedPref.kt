package com.stemlabs.ellu.utils

import android.content.Context

import com.stemlabs.ellu.R

class SharedPref private constructor(context: Context) {
    private var sharedPreferences =
            context.getSharedPreferences(Constants.APP_NAME, Context.MODE_PRIVATE)

    companion object : SingletonHolder<SharedPref, Context>(::SharedPref)

    fun setString(name: String, value: String) {
        sharedPreferences.edit().putString(name, value).apply()
    }

    fun getString(name: String): String {
        return sharedPreferences.getString(name, "")!!
    }

    fun setBoolean(name: String, value: Boolean) {
        sharedPreferences.edit().putBoolean(name, value).apply()
    }

    fun getBoolean(name: String): Boolean {
        return sharedPreferences.getBoolean(name, false)
    }

    fun setInt(key: String, _value: Int) {
        sharedPreferences.edit().putInt(key, _value).apply()
    }

    fun getInt(key: String): Int {
        return sharedPreferences.getInt(key, 0)
    }

    fun setFloat(key: String, _value: Float) {
        sharedPreferences.edit().putFloat(key, _value).apply()
    }

    fun getFloat(key: String): Float {
        return sharedPreferences.getFloat(key, 0.0.toFloat())
    }

    fun setArrayList(key: String, _value: List<String>) {
        sharedPreferences.edit().putStringSet(key, _value.toSet()).apply()
    }

    fun getArrayList(key: String): MutableList<String> {
        return sharedPreferences.getStringSet(key, mutableSetOf())?.toMutableList()
                ?: mutableListOf()
    }

    fun clearAllPreferences() {
        sharedPreferences.edit().clear().apply()
    }
}