package com.wilb3r.data.remote

import com.wilb3r.data.remote.api.ApiService
import com.wilb3r.data.remote.mapper.map
import com.wilb3r.data.remote.mock.DataProvider
import javax.inject.Inject

class NewsRemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : NewsRemoteDataSource {

    override suspend fun fetchTopStories(section: String?) =
        //apiService.topStories(section).map()
        DataProvider.topStories.map()
}
