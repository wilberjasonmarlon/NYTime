package com.wilb3r.data.remote.mapper

import com.wilb3r.domain.model.model_domain.Story
import com.wilb3r.domain.model.model_domain.TopStories
import com.wilb3r.domain.model.result.TopStoriesDto

fun TopStoriesDto.map() = TopStories(
    copyright = copyright,
    lastUpdated = lastUpdated,
    numResults = numResults,
    results = results?.map  { it.map() } as ArrayList<Story>,
    section = section,
    status = status
)