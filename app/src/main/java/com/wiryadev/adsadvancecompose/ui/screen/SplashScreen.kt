package com.wiryadev.adsadvancecompose.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet

@Composable
fun SplashScreen(
    logo: Int,
    bgBottom: Int,
    logoRef: String,
    bgBottomRef: String,
) {
    val constraints = decoupledConstraints(
        logoRef = logoRef,
        bgBottomRef = bgBottomRef,
    )

    BoxWithConstraints {
        ConstraintLayout(
            constraintSet = constraints,
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFB755FF),
                            Color(0xFF584BDD),
                        ),
                    )
                ),
        ) {
            Image(
                painter = painterResource(id = logo),
                contentDescription = logoRef,
                modifier = Modifier.layoutId(logoRef),
            )
            Image(
                painter = painterResource(id = bgBottom),
                contentDescription = bgBottomRef,
                contentScale = ContentScale.Crop,
                modifier = Modifier.layoutId(bgBottomRef)
            )
        }
    }
}

private fun decoupledConstraints(
    logoRef: String,
    bgBottomRef: String,
): ConstraintSet {
    return ConstraintSet {
        val logo = createRefFor(logoRef)
        val bgBottom = createRefFor(bgBottomRef)

        constrain(logo) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

        constrain(bgBottom) {
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }
    }
}