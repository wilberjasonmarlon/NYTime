package com.wilb3r.domain.model.result


import android.os.Parcelable
import com.squareup.moshi.Json
import com.wilb3r.domain.model.model_remote.StorySectionDto
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListStorySectionDto(
    @field:Json(name = "copyright") val copyright: String? = null,
    @field:Json(name = "num_results") val numResults: Int? = null,
    @field:Json(name = "results") val results: List<StorySectionDto>? = null,
    @field:Json(name = "status") val status: String? = null
): Parcelable