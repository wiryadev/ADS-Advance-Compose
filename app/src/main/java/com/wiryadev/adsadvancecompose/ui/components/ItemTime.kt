package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

@Composable
fun ItemTime(
    modifier: Modifier = Modifier,
    time: String,
) {
    Card(
        modifier = modifier
            .padding(vertical = 8.dp, horizontal = 16.dp),
        shape = RoundedCornerShape(50),
        backgroundColor = MaterialTheme.colors.background,
        border = BorderStroke(
            width = 1.dp,
            color = Color(0xFF707070)
        ),
    ) {
        Text(
            text = time,
            color = Color(0xFFA7ADBF),
            style = TextStyle(
                fontFamily = Montserrat,
                fontSize = 12.sp
            ),
            modifier = Modifier
                .padding(
                    vertical = 2.dp,
                    horizontal = 16.dp
                )
        )
    }
}

@Preview
@Composable
fun ItemTimePreview() {
    ADSAdvanceComposeTheme {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            ItemTime(time = "07.00")
        }
    }
}