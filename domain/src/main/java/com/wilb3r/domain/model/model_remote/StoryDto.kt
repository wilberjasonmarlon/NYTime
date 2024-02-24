package com.wilb3r.domain.model.model_remote


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.wilb3r.domain.model.model_domain.Multimedia
import kotlinx.parcelize.Parcelize
import java.util.Date

//@JsonClass(generateAdapter = true)

data class StoryDto(
    @field:Json(name = "abstract") val `abstract`: String? = null,
    @field:Json(name = "byline") val byline: String? = null,
    @field:Json(name = "created_date") val created_date: Date? = null,
    @field:Json(name = "des_facet") val desFacet: List<String>? = null,
    @field:Json(name = "geo_facet") val geoFacet: List<String>? = null,
    @field:Json(name = "item_type") val itemType: String? = null,
    @field:Json(name = "kicker") val kicker: String? = null,
    @field:Json(name = "material_type_facet") val materialTypeFacet: String? = null,
    @field:Json(name = "multimedia") val multimedia: List<Multimedia>? = null,
    @field:Json(name = "org_facet") val orgFacet: List<String>? = null,
    @field:Json(name = "per_facet") val perFacet: List<String>? = null,
    @field:Json(name = "published_date") val published_date: Date? = null,
    @field:Json(name = "section") val section: String? = null,
    @field:Json(name = "short_url") val shortUrl: String? = null,
    @field:Json(name = "subsection") val subsection: String? = null,
    @field:Json(name = "title") val title: String? = null,
    @field:Json(name = "updated_date") val updated_date: Date? = null,
    @field:Json(name = "uri") val uri: String? = null,
    @field:Json(name = "url") val url: String? = null
)