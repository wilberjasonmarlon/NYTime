package com.wilb3r.data.remote.mapper

import com.wilb3r.domain.model.model_domain.ListStorySection
import com.wilb3r.domain.model.result.ListStorySectionDto

fun ListStorySectionDto.map() = ListStorySection(
    copyright = copyright,
    numResults = numResults,
    results = results?.map { it.map() },
    status = status
)

fun ListStorySection.map() = ListStorySectionDto(
    copyright = copyright,
    numResults = numResults,
    results = results?.map { it.map() },
    status = status
)