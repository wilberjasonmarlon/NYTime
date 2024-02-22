package com.wilb3r.data.remote.mapper

import com.wilb3r.domain.model.model_domain.StorySection
import com.wilb3r.domain.model.model_remote.StorySectionDto


fun StorySection.map() = StorySectionDto(
    displayName = displayName,
    section = section
)

fun StorySectionDto.map() = StorySection(
    displayName = displayName,
    section = section
)
