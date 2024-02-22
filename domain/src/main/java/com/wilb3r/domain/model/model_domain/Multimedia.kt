package com.wilb3r.domain.model.model_domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Multimedia(
    val caption: String? = null,
    val copyright: String? = null,
    val format: String? = null,
    val height: Int? = null,
    val subtype: String? = null,
    val type: String? = null,
    val url: String? = null,
    val width: Int? = null
) : Parcelable