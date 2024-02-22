package com.wilb3r.domain.model.model_domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class StorySection(
    val displayName: String? = null,
    val section: String? = null
) : Parcelable
