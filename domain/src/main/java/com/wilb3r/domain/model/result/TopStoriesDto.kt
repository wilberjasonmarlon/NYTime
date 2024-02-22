package com.wilb3r.domain.model.result


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.wilb3r.domain.model.model_remote.StoryDto
import kotlinx.parcelize.Parcelize
import java.util.Date

@JsonClass(generateAdapter = true)
@Parcelize
data class TopStoriesDto(
    @field:Json(name = "copyright") val copyright: String? = null,
    @field:Json(name = "last_updated") val lastUpdated: Date? = null,
    @field:Json(name = "num_results") val numResults: Int? = null,
    @field:Json(name = "results") val results: ArrayList<StoryDto>? = arrayListOf(),
    @field:Json(name = "section") val section: String? = null,
    @field:Json(name = "status") val status: String? = null
) : Parcelable