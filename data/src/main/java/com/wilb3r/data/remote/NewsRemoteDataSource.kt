package com.wilb3r.data.remote

import com.wilb3r.domain.model.model_domain.TopStories
import com.wilb3r.domain.model.result.TopStoriesDto

interface NewsRemoteDataSource {
    suspend fun fetchTopStories(section: String? = null): TopStories
}