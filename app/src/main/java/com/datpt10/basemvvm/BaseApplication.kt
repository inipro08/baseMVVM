package com.datpt10.basemvvm

import android.app.Activity
import android.app.Application
import android.content.Context
import com.datpt10.basemvvm.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class BaseApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>
    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        context = this
        DaggerAppComponent.builder().application(this).build().inject(this)
    }

    companion object {
        var context: Context? = null
        fun getAppContext(): Context? {
            return context
        }
    }
}