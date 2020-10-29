package com.datpt10.basemvvm.ui.screen.fragment.splash

import android.net.Uri
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.datpt10.basemvvm.R
import com.datpt10.basemvvm.databinding.FragmentSplashBinding
import com.datpt10.basemvvm.shareviewmodel.MainShareViewModel
import com.datpt10.basemvvm.ui.base.BaseSplashFragment
import com.datpt10.basemvvm.ui.screen.fragment.main.MainFragment

class SplashFragment : BaseSplashFragment<FragmentSplashBinding, SplashViewModel>() {

    companion object {
        const val TAG = "SplashFragment"
    }

    override val viewModel: SplashViewModel
        get() = ViewModelProvider(this, viewModelFactory)[SplashViewModel::class.java]
    override val layoutId: Int
        get() = R.layout.fragment_splash
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initViews()
    }

    fun initViews() {
        viewBinding.videoViewSplash.apply {
            setVideoURI(Uri.parse("android.resource://" + context?.packageName + "/" + R.raw.splash))
            start()
            setOnErrorListener { _, _, _ ->
                true
            }
            setOnCompletionListener {
                gotoMainFragment()
            }
        }
    }

    override fun gotoMainFragment() {
        replaceFragment(
            fragment = MainFragment.newInstance(),
            addToBackStack = false,
            TAG = MainFragment.TAG
        )
    }


    override val sharedViewModel: MainShareViewModel
        get() = ViewModelProvider(
            requireActivity(),
            viewModelFactory
        ).get(MainShareViewModel::class.java)

}
