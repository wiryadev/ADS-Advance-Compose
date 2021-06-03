package com.wiryadev.adsadvancecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.navigation.compose.rememberNavController
import com.wiryadev.adsadvancecompose.ui.components.BottomNavigationView
import com.wiryadev.adsadvancecompose.ui.navigation.BottomNavigationItem
import com.wiryadev.adsadvancecompose.ui.navigation.MainNavigation
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme

class MainActivity : ComponentActivity() {

    companion object {
        const val GRADIENT_BOX_HEIGHT = 0.25f
        const val FRAGMENT_HEIGHT = 0.88f
        const val BOTTOM_BAR_HEIGHT = 0.09F
    }

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ADSAdvanceComposeTheme {
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
                ) {
                    MainNavigation(navController = navController)
                }
            }

        }
    }
}