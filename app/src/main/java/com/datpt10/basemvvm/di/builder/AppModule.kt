package com.datpt10.basemvvm.di.builder

import android.app.Application
import android.content.Context
import com.datpt10.basemvvm.rx.AppSchedulerProvider
import com.datpt10.basemvvm.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class, NetworkModule::class, RepositoryModule::class])
class AppModule {
    @Singleton
    @Provides
    fun providerContext(application: Application): Context {
        return application
    }

    @Singleton
    @Provides
    fun providerSchedulerProvider(): SchedulerProvider {
        return AppSchedulerProvider()
    }
}
