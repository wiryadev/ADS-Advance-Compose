package com.wiryadev.adsadvancecompose.ui.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
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
fun SearchBusResultSummaryBox(
    locationFrom: String,
    locationTo: String,
    date: String,
    searchResult: Int,
    shape: Shape = RoundedCornerShape(24.dp),
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(MaterialTheme.colors.background)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = locationFrom,
                color = Color.DarkGray,
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                ),
            )
            Icon(
                painter = painterResource(
                    id = R.drawable.ic_from_to
                ),
                contentDescription = "Bus icon",
                tint = Color.DarkGray,
            )
            Text(
                text = locationTo,
                color = Color.DarkGray,
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                ),
            )
        }
        Spacer(
            modifier = Modifier
                .height(6.dp)
        )
        Text(
            text = date,
            color = Color.DarkGray,
            style = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp
            ),
        )
        Divider(
            modifier = Modifier
                .padding(
                    top = 28.dp,
                    bottom = 16.dp
                ),
            color = Color(0xFFC7CBD6),
            thickness = 1.dp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "$searchResult hasil pencarian",
                color = MaterialTheme.colors.onSurface,
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp
                ),
            )
            Icon(
                painter = painterResource(
                    id = R.drawable.ic_filter_grey
                ),
                contentDescription = "Filter icon"
            )
        }
    }
}

@Preview
@Composable
fun SearchBusResultSummaryBoxPreview() {
    ADSAdvanceComposeTheme {
        SearchBusResultSummaryBox(
            locationFrom = "BKS",
            locationTo = "JKT",
            date = "Senin, 14 April 2020",
            searchResult = 50,
        )
    }
}