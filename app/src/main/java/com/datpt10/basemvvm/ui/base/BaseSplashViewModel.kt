package com.datpt10.basemvvm.ui.base

import com.datpt10.basemvvm.data.repository.SharedPrefRepository
import javax.inject.Inject

abstract class BaseSplashViewModel : BaseViewModel() {

    @Inject
    lateinit var sharedPrefRepository: SharedPrefRepository
}