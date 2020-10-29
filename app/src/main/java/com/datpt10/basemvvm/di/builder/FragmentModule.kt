package com.datpt10.basemvvm.di.builder

import com.datpt10.basemvvm.ui.screen.fragment.home.HomeFragment
import com.datpt10.basemvvm.ui.screen.fragment.main.MainFragment
import com.datpt10.basemvvm.ui.screen.fragment.one.OneFragment
import com.datpt10.basemvvm.ui.screen.fragment.splash.SplashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment

    @ContributesAndroidInjector
    abstract fun contributeSplashFragment(): SplashFragment

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributeOneFragment(): OneFragment
}
