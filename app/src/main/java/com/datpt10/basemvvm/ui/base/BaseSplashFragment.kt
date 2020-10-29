package com.datpt10.basemvvm.ui.base

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.datpt10.basemvvm.shareviewmodel.MainShareViewModel

abstract class BaseSplashFragment<ViewBinding : ViewDataBinding, ViewModel : BaseSplashViewModel> :
    BaseFragment<ViewBinding, ViewModel>() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initData()
        observeLiveData()
    }

    private fun initData() {
    }

    private fun observeLiveData() {

    }

    abstract fun gotoMainFragment()
    abstract val sharedViewModel: MainShareViewModel
}