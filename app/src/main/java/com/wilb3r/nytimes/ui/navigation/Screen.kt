package com.wilb3r.nytimes.ui.navigation

sealed class Screen(
    val route: String,
    val title: String
) {
    data object Home : Screen("home", "TOP STORIES")
    data object News : Screen("news", "News")
    data object Other : Screen("other", "Other")
}