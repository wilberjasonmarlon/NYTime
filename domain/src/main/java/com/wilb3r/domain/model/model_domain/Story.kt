package com.wilb3r.domain.model.model_domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
data class Story(
    val `abstract`: String? = null,
    val byline: String? = null,
    val createdDate: Date? = null,
    val desFacet: List<String>? = null,
    val geoFacet: List<String>? = null,
    val itemType: String? = null,
    val kicker: String? = null,
    val materialTypeFacet: String? = null,
    val multimedia: ArrayList<Multimedia>? = null,
    val orgFacet: List<String>? = null,
    val perFacet: List<String>? = null,
    val publishedDate: Date? = null,
    val section: String? = null,
    val shortUrl: String? = null,
    val subsection: String? = null,
    val title: String? = null,
    val updatedDate: Date? = null,
    val uri: String? = null,
    val url: String? = null
) : Parcelable