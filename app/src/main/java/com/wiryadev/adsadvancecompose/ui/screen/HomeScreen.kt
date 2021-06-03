package com.wiryadev.adsadvancecompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiryadev.adsadvancecompose.MainActivity.Companion.GRADIENT_BOX_HEIGHT
import com.wiryadev.adsadvancecompose.ui.components.BusTypeCard
import com.wiryadev.adsadvancecompose.ui.components.ButtonPrimary
import com.wiryadev.adsadvancecompose.ui.components.DepartureCard
import com.wiryadev.adsadvancecompose.ui.components.TravelCard
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

@Composable
fun HomeScreen() {
//    val offset = remember { mutableStateOf(0f) }
//
//    ConstraintLayout(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                color = Color(0xFFEFF2FD)
//            )
//            .scrollable(
//                orientation = Orientation.Vertical,
//                state = rememberScrollableState { delta ->
//                    offset.value += delta
//                    delta
//                }
//            )
//    ) {
//        val (
//            bgTop,
//            text,
//            travelCard,
//            departureCard,
//            busTypeCard,
//            button,
//        ) = createRefs()
//
//        Box(
//            modifier = Modifier
//                .background(
//                    brush = Brush.linearGradient(
//                        colors = listOf(
//                            Color(0xFF584BDD),
//                            Color(0xFFB755FF),
//                        )
//                    )
//                )
//                .fillMaxHeight(0.25f)
//                .fillMaxWidth()
//                .constrainAs(bgTop) {
//                    top.linkTo(parent.top)
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                }
//        )
//        Text(
//            text = "Cari Bus",
//            color = Color.White,
//            textAlign = TextAlign.Center,
//            style = TextStyle(
//                fontFamily = Montserrat,
//                fontSize = 28.sp,
//                fontWeight = FontWeight.SemiBold
//            ),
//            modifier = Modifier
//                .constrainAs(text) {
//                    top.linkTo(parent.top)
//                    bottom.linkTo(travelCard.top)
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                },
//        )
//        TravelCard(
//            modifier = Modifier
//                .constrainAs(travelCard) {
//                    top.linkTo(bgTop.bottom, margin = (-64).dp)
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                }
//                .padding(horizontal = 16.dp),
//        )
//        DepartureCard(
//            modifier = Modifier
//                .constrainAs(departureCard) {
//                    top.linkTo(travelCard.bottom, 24.dp)
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                }
//                .padding(horizontal = 16.dp),
//        )
//        BusTypeCard(
//            selected = "Ekonomi",
//            modifier = Modifier
//                .constrainAs(busTypeCard) {
//                    top.linkTo(departureCard.bottom, margin = 24.dp)
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                }
//                .padding(horizontal = 16.dp),
//        )
//        ButtonPrimary(
//            onClick = { },
//            modifier = Modifier
//                .constrainAs(button) {
//                    top.linkTo(busTypeCard.bottom, margin = 36.dp)
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                }
//                .padding(horizontal = 16.dp),
//            text = "Cari Bus"
//        )
//    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0xFFEFF2FD)
            )
    ) {
        Box(
            modifier = Modifier
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF584BDD),
                            Color(0xFFB755FF),
                        )
                    )
                )
                .fillMaxHeight(GRADIENT_BOX_HEIGHT)
                .fillMaxWidth()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(
                modifier = Modifier.height(32.dp)
            )
            Text(
                text = "Cari Bus",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold
                ),
            )
            Spacer(
                modifier = Modifier.height(16.dp)
            )
            TravelCard()
            Spacer(
                modifier = Modifier.height(16.dp)
            )
            DepartureCard()
            Spacer(
                modifier = Modifier.height(16.dp)
            )
            BusTypeCard(
                selected = "Ekonomi",
            )
            Spacer(
                modifier = Modifier.height(32.dp)
            )
            ButtonPrimary(
                onClick = { },
                text = "Cari Bus",
            )
            Spacer(
                modifier = Modifier.height(36.dp)
            )
        }
    }
}

@Preview
@Composable
fun HomePreview() {
    ADSAdvanceComposeTheme {
        HomeScreen()
    }
}