package com.wiryadev.adsadvancecompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiryadev.adsadvancecompose.R
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme
import com.wiryadev.adsadvancecompose.ui.theme.Montserrat

// Placeholder
@Composable
fun EditTextPrimary(
    text: MutableState<TextFieldValue>,
    label: String,
    leadingIcon: Int,
    contentDescription: String? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None
) {
    TextField(
        value = text.value,
        onValueChange = {
            text.value = it
        },
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 2.dp,
                color = Color(0xFF707070),
                shape = RoundedCornerShape(24.dp)
            )
            .padding(horizontal = 16.dp),
        label = {
            Text(
                text = label,
                style = TextStyle(
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp
                ),
            )
        },
        leadingIcon = {
            Icon(
                painter = painterResource(
                    id = leadingIcon
                ),
                contentDescription = contentDescription ?: label,
                tint = Color(0xFF707070)
            )
        },
        visualTransformation = visualTransformation,
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFF707070),
            backgroundColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
        ),
    )
}

@Preview
@Composable
fun EditTextPrimaryPreview() {
    ADSAdvanceComposeTheme {
        val text = remember { mutableStateOf(TextFieldValue()) }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
                .padding(16.dp)
        ) {
            EditTextPrimary(
                text,
                "Email Addres",
                R.drawable.ic_outline_email_24,
            )
        }
    }
}