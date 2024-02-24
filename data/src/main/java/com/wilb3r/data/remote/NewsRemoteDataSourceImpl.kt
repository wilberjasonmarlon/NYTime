package com.wilb3r.data.remote

import com.wilb3r.common.result.logInfo
import com.wilb3r.data.remote.api.ApiService
import com.wilb3r.data.remote.mapper.map
import com.wilb3r.data.remote.mock.DataProvider
import com.wilb3r.domain.model.model_domain.TopStories
import javax.inject.Inject

class NewsRemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : NewsRemoteDataSource {

    override suspend fun fetchTopStories(section: String?): TopStories {
        //apiService.topStories(section).map()
        val data = DataProvider.topStories
        logInfo(">> $data")
        return data.map()
    }

}
