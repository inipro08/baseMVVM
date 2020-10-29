package com.datpt10.basemvvm.ui.screen.fragment.home

import androidx.lifecycle.ViewModelProvider
import com.datpt10.basemvvm.R
import com.datpt10.basemvvm.databinding.FragmentHomeBinding
import com.datpt10.basemvvm.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val viewModel: HomeViewModel
        get() = ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)
    override val layoutId: Int
        get() = R.layout.fragment_home
}