package com.wiryadev.adsadvancecompose.ui.navigation

import androidx.annotation.StringRes
import com.wiryadev.adsadvancecompose.R

sealed class BottomNavigationItem(
    val route: String,
    @StringRes val resourceId: Int,
    val icon: Int,
) {
    object Home : BottomNavigationItem(
        "Home", R.string.home, R.drawable.ic_home
    )
    object Booking : BottomNavigationItem(
        "Booking", R.string.booking, R.drawable.ic_booking
    )
    object Notification : BottomNavigationItem(
        "Notification", R.string.notification, R.drawable.ic_notification
    )
    object Profile : BottomNavigationItem(
        "Profile", R.string.profile, R.drawable.ic_baseline_person_outline_24
    )
}