package com.example.portfolio

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

//@ExperimentalFoundationApi
@ExperimentalFoundationApi
@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Profile.route
    ) {
        composable(
            route = Screen.Profile.route
        ) {
            ProfileScreen(navController = navController)
        }
        composable(
            route = Screen.News.route
        ) {
            NewsScreen(navController = navController)
        }

    }
}