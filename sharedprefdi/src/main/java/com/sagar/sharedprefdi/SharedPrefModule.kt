package com.sagar.sharedprefdi

import android.content.Context
import android.content.SharedPreferences

class SharedPrefModule(context: Context, sharedPrefDbName: String) {

    var pref: SharedPreferences = context.getSharedPreferences(
        sharedPrefDbName,
        Context.MODE_PRIVATE
    )

    fun save(keyword: String, data: String) {
        pref.edit().putString(keyword, data).apply()
    }

    fun save(keyword: String, data: Int) {
        pref.edit().putInt(keyword, data).apply()
    }

    fun save(keyword: String, data: Boolean) {
        pref.edit().putBoolean(keyword, data).apply()
    }

    fun save(keyword: String, data: Float) {
        pref.edit().putFloat(keyword, data).apply()
    }

    fun save(keyword: String, data: Long) {
        pref.edit().putLong(keyword, data).apply()
    }

    fun get(keyword: String, defaultValue: String? = null): String? {
        return pref.getString(keyword, defaultValue)
    }

    fun get(keyword: String, defaultValue: Int = 0): Int {
        return pref.getInt(keyword, defaultValue)
    }

    fun get(keyword: String, defaultValue: Boolean = false): Boolean {
        return pref.getBoolean(keyword, defaultValue)
    }

    fun get(keyword: String, defaultValue: Float = 0.0f): Float {
        return pref.getFloat(keyword, defaultValue)
    }

    fun get(keyword: String, defaultValue: Long = 0L): Long {
        return pref.getLong(keyword, defaultValue)
    }
}