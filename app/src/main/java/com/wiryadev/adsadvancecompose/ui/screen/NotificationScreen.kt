package com.wiryadev.adsadvancecompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
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
import com.wiryadev.adsadvancecompose.ui.components.ItemNotification
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

@Composable
fun NotificationScreen() {
    val listState = rememberLazyListState()
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
                .fillMaxHeight(0.25f)
                .fillMaxWidth()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
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
                modifier = Modifier.height(32.dp)
            )
            LazyColumn(
                state = listState,
                modifier = Modifier
                    .fillMaxHeight(0.85f)
                    .clip(RoundedCornerShape(24.dp)),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                items(10) {
                    ItemNotification()
                }
            }
        }
    }
}

@Preview
@Composable
fun NotificationScreenPreview() {
    ADSAdvanceComposeTheme {
        NotificationScreen()
    }
}