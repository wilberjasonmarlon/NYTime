package com.wilb3r.data.repository

import com.wilb3r.common.result.asFlow
import com.wilb3r.common.result.logInfo
import com.wilb3r.data.remote.NewsRemoteDataSource
import com.wilb3r.domain.model.model_domain.TopStories
import com.wilb3r.domain.repository.TopStoriesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TopStoriesRepositoryImpl @Inject constructor(
    private val newsRemoteDataSource: NewsRemoteDataSource
) : TopStoriesRepository {

    override suspend fun fetchTopStories(section: String?): Flow<TopStories> {
        return asFlow(sleep = 1000) { newsRemoteDataSource.fetchTopStories(section) }
    }


}