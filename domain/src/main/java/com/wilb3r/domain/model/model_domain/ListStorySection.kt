package com.wilb3r.domain.model.model_domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class ListStorySection(
    val copyright: String? = null,
    val numResults: Int? = null,
    val results: List<StorySection>? = null,
    val status: String? = null
): Parcelable
