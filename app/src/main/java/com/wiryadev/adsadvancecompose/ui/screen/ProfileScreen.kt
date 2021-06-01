package com.wiryadev.adsadvancecompose.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiryadev.adsadvancecompose.R
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

@ExperimentalFoundationApi
@Composable
fun ProfileScreen() {
    val accountSettings = listOf(
        "Informasi Pribadi",
        "Daftar Refund",
        "Rewards",
        "Pusat Bantuan",
    )

    val paymentOptions = listOf(
        "PayLater",
        "Credit/Debit Card",
        "Mobile Wallet",
        "Others",
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF2F5FD))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF584BDD),
                            Color(0xFFB755FF),
                        )
                    )
                )
                .padding(
                    top = 32.dp,
                    bottom = 24.dp,
                )
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Text(
                text = "My Profile",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.fillMaxWidth(),
            )
            Divider(
                color = MaterialTheme.colors.background,
                thickness = 2.dp,
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.de_gea),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(2.dp)
                ) {
                    Text(
                        text = "Abrar Wiryawan",
                        color = MaterialTheme.colors.background,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontFamily = Montserrat,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                        ),
                    )
                    Text(
                        text = "636 BC Points",
                        color = MaterialTheme.colors.background,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontFamily = Montserrat,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                        ),
                    )
                }
            }
        }
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(2.dp),
        ) {
            stickyHeader {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            vertical = 16.dp,
                            horizontal = 24.dp,
                        )
                ) {
                    Text(
                        text = "Account Settings",
                        color = MaterialTheme.colors.primary,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontFamily = Montserrat,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        ),
                    )
                }
            }
            items(accountSettings) { accountSetting ->
                ItemProfile(text = accountSetting)
            }
        }
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(2.dp),
        ) {
            stickyHeader {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            vertical = 16.dp,
                            horizontal = 24.dp,
                        )
                ) {
                    Text(
                        text = "My Payment Options",
                        color = MaterialTheme.colors.primary,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontFamily = Montserrat,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        ),
                    )
                }
            }
            items(paymentOptions) { paymentOption ->
                ItemProfile(text = paymentOption)
            }
        }
    }
}

@Composable
fun ItemProfile(
    text: String,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .padding(vertical = 6.dp, horizontal = 24.dp)
    ) {
        Text(
            text = text,
            color = MaterialTheme.colors.onSurface,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontFamily = Montserrat,
                fontSize = 16.sp,
            ),
        )
    }
}

@ExperimentalFoundationApi
@Preview
@Composable
fun ProfileScreenPreview() {
    ADSAdvanceComposeTheme {
        ProfileScreen()
    }
}