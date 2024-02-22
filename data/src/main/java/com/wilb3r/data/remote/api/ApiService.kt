package com.wilb3r.data.remote.api

import com.wilb3r.domain.model.result.ListStorySectionDto
import com.wilb3r.domain.model.result.TopStoriesDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("svc/topstories/v2/{section}.json")
    suspend fun topStories(
        @Path("section") section: String? = "home"
    ): TopStoriesDto

    @GET("svc/news/v3/content/section-list.json")
    suspend fun storiesSections(): ListStorySectionDto

}