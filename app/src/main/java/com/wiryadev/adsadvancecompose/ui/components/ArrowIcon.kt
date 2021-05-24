package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.wiryadev.adsadvancecompose.R
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme

@Composable
fun ArrowIcon(
    drawable: Int,
    contentDescription: String? = null,
    modifier: Modifier = Modifier
) {
    Icon(
        painter = painterResource(
            id = drawable
        ),
        contentDescription = if (contentDescription.isNullOrEmpty()) {
            "Arrow"
        } else {
            contentDescription
        },
        modifier = modifier,
        tint = MaterialTheme.colors.onSurface,
    )
}

@Preview
@Composable
fun ArrowPreview() {
    ADSAdvanceComposeTheme {
        ArrowIcon(
            drawable = R.drawable.ic_baseline_chevron_right_24_grey
        )
    }
}