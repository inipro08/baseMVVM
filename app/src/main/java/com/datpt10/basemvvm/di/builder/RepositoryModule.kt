package com.datpt10.basemvvm.di.builder

import com.datpt10.basemvvm.data.local.sharedpref.SharedPreferenceHelper
import com.datpt10.basemvvm.data.local.sharedpref.SharedPreferences
import com.datpt10.basemvvm.data.repository.AppRepository
import com.datpt10.basemvvm.data.repository.AppRepositoryImpl
import com.datpt10.basemvvm.data.repository.SharedPrefRepository
import com.datpt10.basemvvm.data.repository.SharedPrefRepositoryImpl
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun providerGSon(): Gson = Gson()

    @Provides
    @Singleton
    fun provideAppDataRepository(appRepositoryImpl: AppRepositoryImpl): AppRepository =
        appRepositoryImpl

    @Provides
    @Singleton
    fun providePrefHelper(appPrefs: SharedPreferences): SharedPreferenceHelper {
        return appPrefs
    }

    @Provides
    @Singleton
    fun provideSharedPreferenceRepository(sharedPrefRepositoryImpl: SharedPrefRepositoryImpl): SharedPrefRepository =
        sharedPrefRepositoryImpl
}
