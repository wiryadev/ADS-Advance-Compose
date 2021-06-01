package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

@Composable
fun ItemNotification() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            text = "Payment Success!",
            color = MaterialTheme.colors.primary,
            style = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
            )
        )
        Text(
            text = "Pembayaran dengan Nomor pesanan 123456790 sudah terverifikasi. Silahkan cek email anda untuk melihat detail e-ticket anda.",
            color = Color(0xFF707070),
            style = TextStyle(
                fontFamily = Montserrat,
                fontSize = 12.sp,
            )
        )
    }
}

@Preview
@Composable
fun ItemNotificationPreview() {
    ADSAdvanceComposeTheme {
        ItemNotification()
    }
}