package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.wiryadev.adsadvancecompose.R
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

@Composable
fun TravelCard(
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
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            val (
                icon,
                column,
                arrow
            ) = createRefs()

            Image(
                painter = painterResource(
                    id = R.drawable.ic_location_from
                ),
                contentDescription = "Berangkat dari",
                modifier = Modifier
                    .constrainAs(icon) {
                        start.linkTo(parent.start)
                        top.linkTo(column.top)
                        bottom.linkTo(column.bottom)
                    }
            )
            Column(
                modifier = Modifier
                    .constrainAs(column) {
                        start.linkTo(icon.end, margin = 24.dp)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    }
            ) {
                Text(
                    text = "Berangkat dari",
                    color = Color(0xFFA7ADBF),
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontSize = 12.sp
                    )
                )
                Text(
                    text = "Terminal Bekasi",
                    color = Color.Black,
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp
                    ),
                )
            }
            Image(
                painter = painterResource(
                    id = R.drawable.ic_baseline_keyboard_arrow_down_24
                ),
                contentDescription = "Pilih",
                modifier = Modifier
                    .constrainAs(arrow) {
                        end.linkTo(parent.end)
                        bottom.linkTo(column.bottom)
                    }
            )
        }
        Spacer(
            modifier = Modifier
                .height(16.dp)
        )
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            val (
                icon,
                column,
                arrow
            ) = createRefs()

            Image(
                painter = painterResource(
                    id = R.drawable.ic_location_to
                ),
                contentDescription = "Berangkat dari",
                modifier = Modifier
                    .constrainAs(icon) {
                        start.linkTo(parent.start)
                        top.linkTo(column.top)
                        bottom.linkTo(column.bottom)
                    }
            )
            Column(
                modifier = Modifier
                    .constrainAs(column) {
                        start.linkTo(icon.end, margin = 24.dp)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    }
            ) {
                Text(
                    text = "Terminal Tujuan",
                    color = Color(0xFFA7ADBF),
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontSize = 12.sp
                    )
                )
                Text(
                    text = "Terminal Jakarta",
                    color = Color.Black,
                    style = TextStyle(
                        fontFamily = Montserrat,
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp
                    )
                )
            }
            Image(
                painter = painterResource(
                    id = R.drawable.ic_baseline_keyboard_arrow_down_24
                ),
                contentDescription = "Pilih",
                modifier = Modifier
                    .constrainAs(arrow) {
                        end.linkTo(parent.end)
                        bottom.linkTo(column.bottom)
                    }
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    TravelCard()
}