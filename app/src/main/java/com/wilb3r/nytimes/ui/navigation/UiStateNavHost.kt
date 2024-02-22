package com.wilb3r.nytimes.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.wilb3r.nytimes.home.Home

@Composable
fun UiStateNavHost(
    navController: NavHostController,
    modifier: Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) {
            Home(navController, modifier)
        }
        composable(Screen.ActionMovies.route) {

        }
        composable(Screen.AnimationMovies.route) {

        }
    }
}