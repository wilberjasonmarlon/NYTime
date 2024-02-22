package com.wilb3r.domain.repository

import com.wilb3r.common.result.Result
import com.wilb3r.domain.model.model_domain.TopStories
import kotlinx.coroutines.flow.Flow

interface TopStoriesRepository {
    suspend fun fetchTopStories(section: String?): Flow<TopStories>
}