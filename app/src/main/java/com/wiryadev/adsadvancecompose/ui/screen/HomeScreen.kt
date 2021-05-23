package com.wiryadev.adsadvancecompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import com.wiryadev.adsadvancecompose.ui.components.ButtonPrimary
import com.wiryadev.adsadvancecompose.ui.components.DepartureCard
import com.wiryadev.adsadvancecompose.ui.components.TravelCard
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(color = Color(0xFFEFF2FD))
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
                .fillMaxHeight(0.20f)
                .fillMaxWidth()
                .align(alignment = Alignment.TopCenter)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Cari Bus",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .padding(top = 36.dp)
            )
            TravelCard(
                modifier = Modifier.padding(top = 36.dp)
            )
            DepartureCard(
                modifier = Modifier.padding(top = 24.dp)
            )
            ButtonPrimary(
                onClick = { },
                modifier = Modifier.padding(top = 36.dp),
                text = "CARI BUS"
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