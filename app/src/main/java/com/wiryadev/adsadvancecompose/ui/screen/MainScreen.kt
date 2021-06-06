package com.wiryadev.adsadvancecompose.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.wiryadev.adsadvancecompose.ui.components.BottomNavigationView
import com.wiryadev.adsadvancecompose.ui.navigation.BottomNavigationItem
import com.wiryadev.adsadvancecompose.ui.navigation.MainNavigation

@ExperimentalFoundationApi
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    val items = listOf(
        BottomNavigationItem.Home,
        BottomNavigationItem.Booking,
        BottomNavigationItem.Notification,
        BottomNavigationItem.Profile,
    )

    Scaffold(
        bottomBar = {
            BottomNavigationView(
                navController = navController,
                items = items,
            )
        },
    ) { innerPadding ->
        MainNavigation(navController = navController, contentPadding = innerPadding)
    }
}