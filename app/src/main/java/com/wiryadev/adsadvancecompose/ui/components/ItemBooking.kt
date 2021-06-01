package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
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
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

@Composable
fun ItemBooking() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .padding(vertical = 24.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "Booking ID 123456789",
                color = Color(0xFF707070),
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontSize = 12.sp,
                )
            )
            Text(
                text = "IDR 176.000",
                color = Color.LightGray,
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                )
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .background(
                    color = Color(0xFFEFF2FD)
                )
                .padding(
                    vertical = 8.dp,
                    horizontal = 24.dp,
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "JKT",
                color = Color.DarkGray,
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 22.sp,
                )
            )
            Icon(
                painter = painterResource(
                    id = R.drawable.ic_from_to
                ),
                contentDescription = "Bus icon",
                tint = Color.DarkGray,
            )
            Text(
                text = "BDG",
                color = Color.DarkGray,
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 22.sp,
                )
            )
        }
        Text(
            text = "Senin, 11 Januari 2020",
            modifier = Modifier
                .padding(horizontal = 24.dp),
            color = Color.DarkGray,
            style = TextStyle(
                fontFamily = Montserrat,
                fontSize = 12.sp,
            )
        )
    }
}

@Preview
@Composable
fun ItemBookingPreview() {
    ADSAdvanceComposeTheme {
        ItemBooking()
    }
}
