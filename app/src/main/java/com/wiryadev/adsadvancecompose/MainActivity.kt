package com.wiryadev.adsadvancecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.wiryadev.adsadvancecompose.ui.components.SplashScreen
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ADSAdvanceComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    SplashScreen(
                        logo = R.drawable.ic_logo_with_text,
                        bgBottom = R.drawable.ic_background_bottom,
                        logoRef = SplashScreenActivity.LOGO,
                        bgBottomRef = SplashScreenActivity.BACKGROUND_BOTTOM,
                    )
                }
            }
        }
    }
}