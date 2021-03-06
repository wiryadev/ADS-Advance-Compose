package com.wiryadev.adsadvancecompose.ui.components

import android.util.Log
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.wiryadev.adsadvancecompose.ui.navigation.BottomNavigationItem
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat
import com.wiryadev.adsadvancecompose.R

@Composable
fun BottomNavigationView(
    navController: NavHostController,
    items: List<BottomNavigationItem>,
    modifier: Modifier = Modifier,
) {
    BottomNavigation(
        modifier = modifier
            .fillMaxWidth(),
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
                        navController.navigate(item.route)
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(
                            id = item.icon
                        ),
                        contentDescription = stringResource(
                            id = item.resourceId
                        ),
                        modifier = Modifier
                            .height(
                                if (item.icon != R.drawable.ic_baseline_person_outline_24) {
                                    24.dp
                                } else {
                                    Dp.Unspecified
                                }
                            ),
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
                        ),
                        style = TextStyle(
                            fontFamily = Montserrat,
                            fontSize = 11.sp,
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