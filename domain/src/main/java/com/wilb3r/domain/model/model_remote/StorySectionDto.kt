package com.wilb3r.domain.model.model_remote


import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class StorySectionDto(
    @field:Json(name = "display_name") val displayName: String? = null,
    @field:Json(name = "section")  val section: String? = null
): Parcelable