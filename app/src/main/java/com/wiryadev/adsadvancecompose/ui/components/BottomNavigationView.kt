package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wiryadev.adsadvancecompose.R
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme

@Composable
fun BottomNavigationView(
    modifier: Modifier = Modifier
) {
    BottomNavigation(
        modifier = modifier
            .fillMaxWidth()
            .height(72.dp),
        backgroundColor = MaterialTheme.colors.background
    ) {
        BottomNavigationItem(
            selected = true,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = "",
                    tint = MaterialTheme.colors.primary
                )
            },
            label = {
                Text(text = "Home")
            },
            alwaysShowLabel = true,
            modifier = Modifier
                .padding(top = 12.dp)
        )
        BottomNavigationItem(
            selected = true,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = ""
                )
            },
            label = {
                Text(text = "Home")
            },
            alwaysShowLabel = true,
            modifier = Modifier
                .padding(top = 12.dp)
        )
        BottomNavigationItem(
            selected = true,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = ""
                )
            },
            label = {
                Text(text = "Home")
            },
            alwaysShowLabel = true,
            modifier = Modifier
                .padding(top = 12.dp)
        )
        BottomNavigationItem(
            selected = true,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = ""
                )
            },
            label = {
                Text(text = "Home")
            },
            alwaysShowLabel = true,
            modifier = Modifier
                .padding(top = 12.dp)
        )
    }
}

@Preview
@Composable
fun NavigationPreview() {
    ADSAdvanceComposeTheme {
        Scaffold {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                BottomNavigationView(
                    modifier = Modifier
                        .align(alignment = Alignment.Bottom)
                )
            }
        }
    }
}