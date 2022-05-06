package com.example.portfolio

sealed class Screen(val route: String) {
    object Profile: Screen(route = "profile_screen")
    object News: Screen(route = "news_screen")
}
