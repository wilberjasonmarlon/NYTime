package com.wilb3r.data.remote.mapper

import android.os.Build
import androidx.annotation.RequiresApi
import com.wilb3r.domain.model.model_domain.Story
import com.wilb3r.domain.model.model_domain.TopStories
import com.wilb3r.domain.model.result.TopStoriesDto
import java.util.Date

@RequiresApi(Build.VERSION_CODES.O)
fun TopStoriesDto.map() = TopStories(
    copyright = copyright,
    lastUpdated = Date.from(last_updated?.toInstant()),
    numResults = numResults,
    results = results?.map  { it.map() } as ArrayList<Story>,
    section = section,
    status = status
)