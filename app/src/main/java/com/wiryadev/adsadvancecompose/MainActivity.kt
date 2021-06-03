package com.wiryadev.adsadvancecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.wiryadev.adsadvancecompose.ui.screen.MainScreen
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme

class MainActivity : ComponentActivity() {

    companion object {
        const val GRADIENT_BOX_HEIGHT = 0.25f
        const val FRAGMENT_HEIGHT = 0.88f
    }

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ADSAdvanceComposeTheme {
                MainScreen()
            }
        }
    }
}