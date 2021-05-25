package com.wiryadev.adsadvancecompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wiryadev.adsadvancecompose.R
import com.wiryadev.adsadvancecompose.ui.components.ButtonPrimary
import com.wiryadev.adsadvancecompose.ui.components.EditTextPrimary
import com.wiryadev.adsadvancecompose.ui.theme.ADSAdvanceComposeTheme

@Composable
fun LoginScreen(
    email: MutableState<TextFieldValue>,
    password: MutableState<TextFieldValue>,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(vertical = 24.dp, horizontal = 16.dp)
    ) {
        EditTextPrimary(
            text = email,
            label = "Email Address",
            leadingIcon = R.drawable.ic_outline_email_24,
        )
        Spacer(
            modifier = Modifier.height(24.dp)
        )
        EditTextPrimary(
            text = password,
            label = "Password",
            leadingIcon = R.drawable.ic_baseline_lock_open_24,
            visualTransformation = PasswordVisualTransformation(),
        )
        Spacer(
            modifier = Modifier.height(36.dp)
        )
        ButtonPrimary(
            onClick = { /*TODO*/ },
            text = "Login"
        )
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    ADSAdvanceComposeTheme {
        val email = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }
        LoginScreen(
            email,
            password,
        )
    }
}