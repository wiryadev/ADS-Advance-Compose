package com.wiryadev.adsadvancecompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.wiryadev.adsadvancecompose.ui.components.*
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat
import kotlin.random.Random

@Composable
fun BusSelectionScreen() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0xFFEFF2FD)
            )
    ) {
        val (
            bgTop,
            text,
            busResultCard,
            busList,
        ) = createRefs()

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
                .constrainAs(bgTop) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
        Text(
            text = "Pilih Bus",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontFamily = Montserrat,
                fontSize = 28.sp,
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier
                .constrainAs(text) {
                    top.linkTo(parent.top)
                    bottom.linkTo(busResultCard.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
        )
        SearchBusResultSummaryBox(
            locationFrom = "BKS",
            locationTo = "JKT",
            date = "Senin, 24 Mei 2021",
            searchResult = 50,
            modifier = Modifier
                .constrainAs(busResultCard) {
                    top.linkTo(bgTop.bottom)
                    bottom.linkTo(bgTop.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .padding(horizontal = 16.dp),
        )
        LazyColumn(
            modifier = Modifier
                .constrainAs(busList) {
                    top.linkTo(busResultCard.bottom, 24.dp)
                    bottom.linkTo(parent.bottom, 24.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    
                    height = Dimension.fillToConstraints
                }
                .padding(horizontal = 16.dp)
                .clip(RoundedCornerShape(24.dp)),
        ) {
            items(4) {
                Column {
                    ItemBus(
                        item = Random.nextInt(1, 3)
                    )
                    Spacer(
                        modifier = Modifier
                            .height(2.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun BusSelectionScreenPreview() {
    ADSAdvanceComposeTheme {
        BusSelectionScreen()
    }
}