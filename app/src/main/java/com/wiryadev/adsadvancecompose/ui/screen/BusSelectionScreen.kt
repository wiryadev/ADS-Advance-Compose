package com.wiryadev.adsadvancecompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiryadev.adsadvancecompose.ui.components.*
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat
import kotlin.random.Random

@Composable
fun BusSelectionScreen() {
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
                text = "Pilih Bus",
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
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            SearchBusResultSummaryBox(
                locationFrom = "BKS",
                locationTo = "JKT",
                date = "Senin, 24 Mei 2021",
                searchResult = 50
            )
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            LazyColumn(
                modifier = Modifier
                    .clip(RoundedCornerShape(24.dp))
            ) {
                items(4) {
                    Column {
                        ItemBus(
                            item = Random.nextInt(1, 3)
                        )
                        Spacer(
                            modifier = Modifier
                                .height(2.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun BusSelectionScreenPreview() {
    ADSAdvanceComposeTheme {
        BusSelectionScreen()
    }
}