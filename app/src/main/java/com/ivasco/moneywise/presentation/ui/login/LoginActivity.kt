package com.ivasco.moneywise.presentation.ui.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.ivasco.moneywise.ui.theme.MoneyWiseTheme

class LoginActivity : ComponentActivity() {

    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MoneyWiseTheme {
                // Pass the ViewModel to the LoginScreen
                LoginScreen(viewModel = loginViewModel)
            }
        }
    }
}