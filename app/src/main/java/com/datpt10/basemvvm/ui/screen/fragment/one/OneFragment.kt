package com.datpt10.basemvvm.ui.screen.fragment.one

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.datpt10.basemvvm.R
import com.datpt10.basemvvm.databinding.FragmentOneBinding
import com.datpt10.basemvvm.ui.base.BaseFragment

class OneFragment : BaseFragment<FragmentOneBinding,OneViewModel>() {
    override val viewModel: OneViewModel
        get() = ViewModelProvider(this,viewModelFactory).get(OneViewModel::class.java)
    override val layoutId: Int
        get() = R.layout.fragment_one

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBindingView()
    }

    private fun viewBindingView() {
        viewBinding.apply {

        }
    }
}