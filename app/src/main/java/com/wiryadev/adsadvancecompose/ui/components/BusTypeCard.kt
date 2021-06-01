package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

@Composable
fun BusTypeCard(
    selected: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(MaterialTheme.colors.background)
            .padding(24.dp)
    ) {
        Text(
            text = "Tipe Bus",
            color = Color(0xFFA7ADBF),
            style = TextStyle(
                fontFamily = Montserrat,
                fontSize = 12.sp
            )
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                RadioButton(
                    selected = selected == "Semua",
                    onClick = {

                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = MaterialTheme.colors.primary,
                        unselectedColor = MaterialTheme.colors.onSurface,
                    )
                )
                Text(
                    text = "Semua",
                    color = MaterialTheme.colors.onSurface,
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                    )
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                RadioButton(
                    selected = selected == "Ekonomi",
                    onClick = {

                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = MaterialTheme.colors.primary,
                        unselectedColor = MaterialTheme.colors.onSurface,
                    )
                )
                Text(
                    text = "Ekonomi",
                    color = MaterialTheme.colors.onSurface,
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                    )
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                RadioButton(
                    selected = selected == "Bisnis",
                    onClick = {

                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = MaterialTheme.colors.primary,
                        unselectedColor = MaterialTheme.colors.onSurface,
                    )
                )
                Text(
                    text = "Bisnis",
                    color = MaterialTheme.colors.onSurface,
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun BusTypeCardPreview() {
    ADSAdvanceComposeTheme {
        Box(
            Modifier
                .fillMaxSize()
                .padding(16.dp)) {
            BusTypeCard(
                "Semua"
            )
        }
    }
}