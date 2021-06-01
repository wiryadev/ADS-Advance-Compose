package com.wiryadev.adsadvancecompose.ui.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.wiryadev.adsadvancecompose.ui.navigation.BottomNavigationItem.*
import com.wiryadev.adsadvancecompose.ui.screen.BookingScreen
import com.wiryadev.adsadvancecompose.ui.screen.HomeScreen
import com.wiryadev.adsadvancecompose.ui.screen.NotificationScreen
import com.wiryadev.adsadvancecompose.ui.screen.ProfileScreen

@ExperimentalFoundationApi
@Composable
fun MainNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Home.route,
    ) {
        composable(Home.route) {
            HomeScreen()
        }
        composable(Booking.route) {
            BookingScreen()
        }
        composable(Notification.route) {
            NotificationScreen()
        }
        composable(Profile.route) {
            ProfileScreen()
        }
    }
}