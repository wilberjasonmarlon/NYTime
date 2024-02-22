package com.wilb3r.data.remote.mapper

import com.wilb3r.domain.model.model_domain.Multimedia
import com.wilb3r.domain.model.model_remote.MultimediaDto


fun Multimedia.map() = MultimediaDto(
    caption = caption,
    copyright = copyright,
    format = format,
    height = height,
    subtype = subtype,
    type = type,
    url = url,
    width = width
)

fun MultimediaDto.map() = Multimedia(
    caption = caption,
    copyright = copyright,
    format = format,
    height = height,
    subtype = subtype,
    type = type,
    url = url,
    width = width
)