package com.wiryadev.adsadvancecompose.ui.components

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.wiryadev.adsadvancecompose.MainActivity.Companion.BOTTOM_BAR_HEIGHT
import com.wiryadev.adsadvancecompose.ui.navigation.BottomNavigationItem
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme

@Composable
fun BottomNavigationView(
    navController: NavHostController,
    items: List<BottomNavigationItem>,
    modifier: Modifier = Modifier,
) {
    BottomNavigation(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(BOTTOM_BAR_HEIGHT),
        backgroundColor = MaterialTheme.colors.background
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        Log.d("Nav", "BottomNavigationView: $currentRoute")

        items.forEach { item ->
            val selected = currentRoute == item.route
            BottomNavigationItem(
                selected = selected,
                onClick = {
                    // This if check gives us a "singleTop" behavior where we do not create a
                    // second instance of the composable if we are already on that destination
                    if (currentRoute != item.route) {
                        Log.d("Nav", "BottomNavigationView: executed")
                        navController.navigate(item.route)
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = "",
                        tint = if (selected) {
                            MaterialTheme.colors.primary
                        } else {
                            LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
                        },
                    )
                },
                label = {
                    Text(
                        text = stringResource(
                            id = item.resourceId
                        )
                    )
                },
                alwaysShowLabel = true,
            )
        }
    }
}

@Preview
@Composable
fun NavigationPreview() {
    ADSAdvanceComposeTheme {
        val navController = rememberNavController()
        Scaffold {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                BottomNavigationView(
                    navController = navController,
                    items = listOf(
                        BottomNavigationItem.Home,
                        BottomNavigationItem.Booking,
                        BottomNavigationItem.Notification,
                        BottomNavigationItem.Profile,
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.Bottom)
                )
            }
        }
    }
}