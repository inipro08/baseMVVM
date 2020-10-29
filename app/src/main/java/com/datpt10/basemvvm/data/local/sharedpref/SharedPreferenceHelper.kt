package com.datpt10.basemvvm.data.local.sharedpref

import io.reactivex.Completable
import io.reactivex.Single

interface SharedPreferenceHelper {
    fun putString(key: String, value: String): Completable

    fun putBoolean(key: String, value: Boolean): Completable

    fun getString(key: String, defaultValue: String = ""): Single<String>

    fun getInt(key: String, defaultValue: Int = 0): Int

    fun putInt(key: String,value: Int)

    fun getBoolean(key: String, defaultValue: Boolean = false): Single<Boolean>

    fun putLong(key: String, value: Long)

    fun getLong(key: String, defaultValue: Long): Long
}
