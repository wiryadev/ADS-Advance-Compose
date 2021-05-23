package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiryadev.adsadvancecompose.R
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

@Composable
fun DepartureCard(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(
                shape = RoundedCornerShape(16.dp)
            )
            .background(Color.White)
            .padding(24.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column {
                Text(
                    text = "Tanggal Keberangkatan",
                    color = Color(0xFFA7ADBF),
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontSize = 12.sp
                    )
                )
                Text(
                    text = "Sabtu, 22 Mei 2021",
                    color = Color.Black,
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    )
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_keyboard_arrow_down_24),
                contentDescription = "Pilih",
                alignment = Alignment.BottomEnd
            )
        }
        Spacer(
            modifier = Modifier
                .height(16.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column {
                Text(
                    text = "Penumpang",
                    color = Color(0xFFA7ADBF),
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontSize = 12.sp
                    )
                )
                Text(
                    text = "0 Penumpang",
                    color = Color.Black,
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    )
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_keyboard_arrow_down_24),
                contentDescription = "Pilih",
            )
        }
        Spacer(
            modifier = Modifier
                .height(16.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column {
                Text(
                    text = "Tipe Bus",
                    color = Color(0xFFA7ADBF),
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontSize = 12.sp
                    )
                )
                Text(
                    text = "Pilih Bus",
                    color = Color.Black,
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    )
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_keyboard_arrow_down_24),
                contentDescription = "Pilih",
            )
        }
    }
}

@Preview
@Composable
fun DeparturePreview() {
    DepartureCard()
}