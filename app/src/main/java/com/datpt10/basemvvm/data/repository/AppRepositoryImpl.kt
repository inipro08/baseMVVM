package com.datpt10.basemvvm.data.repository
import com.datpt10.basemvvm.data.remote.AppApi
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(val appApi: AppApi) : AppRepository {
}