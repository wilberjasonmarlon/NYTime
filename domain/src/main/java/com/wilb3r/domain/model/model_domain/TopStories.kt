package com.wilb3r.domain.model.model_domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.Date


@Parcelize
class TopStories(
    val copyright: String? = null,
    val lastUpdated: Date? = null,
    val numResults: Int? = null,
    val results: ArrayList<Story>? = arrayListOf(),
    val section: String? = null,
    val status: String? = null
): Parcelable