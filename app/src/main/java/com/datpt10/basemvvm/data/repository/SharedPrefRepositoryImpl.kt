package com.datpt10.basemvvm.data.repository

import com.datpt10.basemvvm.data.local.sharedpref.SharedPreferenceHelper
import javax.inject.Inject

class SharedPrefRepositoryImpl @Inject constructor(private val helper: SharedPreferenceHelper) :
    SharedPrefRepository {
}
