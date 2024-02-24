package com.wilb3r.nytimes.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wilb3r.common.result.logInfo
import com.wilb3r.domain.model.model_domain.Story
import com.wilb3r.nytimes.R
import com.wilb3r.nytimes.ScreenTitle
import com.wilb3r.nytimes.composables.NetworkImage
import com.wilb3r.nytimes.ui.theme.SubSubTitleStyle
import com.wilb3r.nytimes.ui.theme.TitleStyle
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.time.temporal.ChronoUnit
import java.util.Date
import kotlin.time.DurationUnit
import kotlin.time.toDuration


@Composable
fun NewsItem(
    item: Story,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column {
            NetworkImage(
                url = item.multimedia?.firstOrNull()?.url ?: ""
            )
            NewsTitle(title = item.title.toString(), modifier = Modifier.padding(8.dp))
            NewsSubTitle(title = item.byline.toString(), modifier = Modifier.padding(8.dp))
            HorizontalDivider()
            item.publishedDate?.let {
                NewsSubTitle(
                    title = it.toDuration()
                        .toString(), modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
fun NewsTitle(
    title: String,
    modifier: Modifier = Modifier,
) {
    Text(title, style = MaterialTheme.typography.headlineSmall, modifier = modifier)
}

@Composable
fun NewsSubTitle(
    title: String,
    modifier: Modifier = Modifier,
) {
    Text(title, style = SubSubTitleStyle, modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun NewsItemPreview() {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column {
            Image(
                painterResource(id = R.drawable.russian),
                contentDescription = null
            )
            ScreenTitle()
            logInfo(">> Recomposing")
        }
    }
}

private fun Date.toDuration() =
    ChronoUnit
        .SECONDS
        .between(toInstant().atOffset(ZoneOffset.UTC), OffsetDateTime.now())
        .toDuration(DurationUnit.SECONDS)