package com.wilb3r.nytimes.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.wilb3r.nytimes.R

@Composable
fun NetworkImage(url: String, modifier: Modifier) {
    var retryHash by remember { mutableIntStateOf(0) }
    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current)
            .data(url)
            .setParameter("retry_hash", retryHash)
            .size(Size.ORIGINAL) // Set the target size to load the image at
            .build()
    )
    when (painter.state) {
        is AsyncImagePainter.State.Error -> {
            IconButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = { retryHash++ }) {
                Image(
                    painterResource(id = R.drawable.ico_retry),
                    contentDescription = null,
                )
            }
        }

        is AsyncImagePainter.State.Loading -> {
            LoadingIndicator()
        }

        else -> {
            Image(
                painter = painter,
                contentDescription = null, // Provide a meaningful description if needed
                modifier = modifier,
                contentScale = ContentScale.Fit // Adjust the scaling as per your requirement
            )
        }
    }

    /*
    val showShimmer = remember { mutableStateOf(true) }
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(url).size(Size.ORIGINAL)
            .build(),
        contentDescription = "ImageRequest",
        modifier = modifier.background(
            shimmerBrush(
                targetValue = 1300f,
                showShimmer = showShimmer.value
            )
        ),
        onSuccess = { showShimmer.value = false },
        contentScale = ContentScale.Fit,
    )*/
}

