package com.wilb3r.domain.model.model_remote


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class MultimediaDto(
    @field:Json(name = "caption")
    val caption: String? = null,
    @field:Json(name = "copyright")
    val copyright: String? = null,
    @field:Json(name = "format")
    val format: String? = null,
    @field:Json(name = "height")
    val height: Int? = null,
    @field:Json(name = "subtype")
    val subtype: String? = null,
    @field:Json(name = "type")
    val type: String? = null,
    @field:Json(name = "url")
    val url: String? = null,
    @field:Json(name = "width")
    val width: Int? = null
): Parcelable