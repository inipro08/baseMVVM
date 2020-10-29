package com.datpt10.basemvvm.di.builder

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.datpt10.basemvvm.shareviewmodel.MainShareViewModel
import com.datpt10.basemvvm.ui.screen.fragment.home.HomeViewModel
import com.datpt10.basemvvm.ui.screen.fragment.main.MainViewModel
import com.datpt10.basemvvm.ui.screen.fragment.one.OneViewModel
import com.datpt10.basemvvm.ui.screen.fragment.splash.SplashViewModel
import com.datpt10.basemvvm.utils.ViewModelProviderFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(
        providerFactory: ViewModelProviderFactory
    ): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainShareViewModel::class)
    abstract fun bindMainSharedViewModel(mainShareViewModel: MainShareViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewMode: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun bindSplashViewModel(splashViewModel: SplashViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeVM(homeViewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(OneViewModel::class)
    abstract fun bindOneVM(oneViewModel: OneViewModel): ViewModel
}
