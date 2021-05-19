package com.wiryadev.adsadvancecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.wiryadev.adsadvancecompose.SplashScreenActivity.Companion.BACKGROUND_BOTTOM
import com.wiryadev.adsadvancecompose.SplashScreenActivity.Companion.LOGO
import com.wiryadev.adsadvancecompose.ui.components.SplashScreen
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme

class SplashScreenActivity : ComponentActivity() {

    companion object {
        const val LOGO = "logo"
        const val BACKGROUND_BOTTOM = "background_bottom"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ADSAdvanceComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    SplashScreen(
                        logo = R.drawable.ic_logo_with_text,
                        bgBottom = R.drawable.ic_background_bottom,
                        logoRef = LOGO,
                        bgBottomRef = BACKGROUND_BOTTOM,
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ADSAdvanceComposeTheme {
        SplashScreen(
            logo = R.drawable.ic_logo_with_text,
            bgBottom = R.drawable.ic_background_bottom,
            logoRef = LOGO,
            bgBottomRef = BACKGROUND_BOTTOM,
        )
    }
}