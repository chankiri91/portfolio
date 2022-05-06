package com.example.portfolio

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun NewsScreen(
    navController: NavController
) {
  TopBar(
      name = "News",
      navController = navController
  )
}

