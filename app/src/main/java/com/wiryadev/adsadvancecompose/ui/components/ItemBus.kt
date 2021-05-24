package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiryadev.adsadvancecompose.R
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat
import kotlin.random.Random

@Composable
fun ItemBus(
    item: Int,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .background(
                color = MaterialTheme.colors.background
            )
            .padding(24.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Tipe List",
                    color = MaterialTheme.colors.onSurface,
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    ),
                )
                Text(
                    text = "Kode",
                    color = Color(0xFF9F55FF),
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontSize = 12.sp
                    ),
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Rp 500.000",
                    color = MaterialTheme.colors.onSurface,
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp
                    ),
                )
                Spacer(
                    modifier = Modifier.width(24.dp)
                )
                ArrowIcon(
                    drawable = R.drawable.ic_baseline_chevron_right_24_grey,
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column {
            for (i in 0..item) {
                ItemTime(time = "0$i.00")
            }
        }
    }
}

@Preview
@Composable
fun BusItemPreview() {
    ADSAdvanceComposeTheme {
        ItemBus(
            Random.nextInt(1, 3)
        )
    }
}