package com.wilb3r.nytimes.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.wilb3r.nytimes.MainViewModel
import com.wilb3r.nytimes.ScreenTitle
import com.wilb3r.nytimes.composables.LoadingIndicator

@Composable
fun Home(
    navController: NavController,
    modifier: Modifier = Modifier,
    homeViewModel: MainViewModel = hiltViewModel()
) {
    Scaffold { padding ->
        SwipeRefresh(
            state = rememberSwipeRefreshState(false),
            onRefresh = { homeViewModel.getTopStories() },
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            Column(
                modifier
                    .verticalScroll(
                        rememberScrollState()
                    )
            ) {
                Spacer(Modifier.height(16.dp))
                ScreenTitle(title = "NEWS")
                homeViewModel.state.data?.results?.let { it2 ->
                    it2.sortedByDescending { it.publishedDate }
                        .forEach { item ->
                            ListItem(
                                headlineContent = {
                                    NewsItem(item = item)
                                },
                                modifier = Modifier.wrapContentHeight()
                            )
                        }
                }
            }
        }
    }

    LaunchedEffect(Unit) {
        homeViewModel.getTopStories()
    }
    if (homeViewModel.state.loading) {
        LoadingIndicator()
    }
}