package com.wilb3r.nytimes.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.wilb3r.common.result.logInfo
import com.wilb3r.data.remote.mapper.map
import com.wilb3r.data.remote.mock.DataProvider
import com.wilb3r.domain.model.model_domain.Story
import com.wilb3r.nytimes.R
import com.wilb3r.nytimes.ScreenTitle
import com.wilb3r.nytimes.composables.NetworkImage


@Composable
fun NewsItem(
    item: Story,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column {
            NetworkImage(
                url = item.multimedia?.getOrNull(2)?.url ?: "",
                modifier = Modifier.wrapContentWidth()
            )
            ScreenTitle()
            logInfo(">> Recomposing")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NewsItemPreview() {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column {
            Image(
                painterResource(id = R.drawable.russian) ,
                contentDescription = null
            )
            ScreenTitle()
            logInfo(">> Recomposing")
        }
    }
}