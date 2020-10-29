package com.datpt10.basemvvm.di

import android.app.Application
import com.datpt10.basemvvm.BaseApplication
import com.datpt10.basemvvm.di.builder.ActivityModule
import com.datpt10.basemvvm.di.builder.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityModule::class)])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(baseApplication: BaseApplication)

}