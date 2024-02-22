package com.wilb3r.nytimes.ui.navigation

sealed class Screen(val route: String) {
  data object Home : Screen("home")
  data object ActionMovies : Screen("action_movies_screen")
  data object AnimationMovies : Screen("animation_movies_screen")
}