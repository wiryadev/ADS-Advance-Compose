package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
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
fun ItemTime(
    modifier: Modifier = Modifier,
    time: String,
    selected: Boolean,
) {
    Card(
        modifier = modifier
            .padding(vertical = 8.dp)
            .padding(end = 8.dp),
        shape = RoundedCornerShape(50),
        backgroundColor = if (selected) MaterialTheme.colors.primary else MaterialTheme.colors.background,
        border = BorderStroke(
            width = 1.dp,
            color = if (selected) MaterialTheme.colors.background else MaterialTheme.colors.onSurface
        ),
    ) {
        Text(
            text = time,
            color = if (selected) MaterialTheme.colors.background else Color(0xFFA7ADBF),
            style = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.Medium,
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
        ) {
            ItemTime(time = "07.00", selected = true)
            ItemTime(time = "08.00", selected = false)
            ItemTime(time = "09.00", selected = false)
        }
    }
}