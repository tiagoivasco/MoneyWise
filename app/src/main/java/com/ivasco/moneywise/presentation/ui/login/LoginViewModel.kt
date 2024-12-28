package com.ivasco.moneywise.presentation.ui.login

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State

class LoginViewModel : ViewModel() {

    private val _isLoading = mutableStateOf(false)
    val isLoading: State<Boolean> get() = _isLoading

    // Apenas para demonstrar o comportamento
    fun login(username: String, password: String) {
        // Simular um processo de login
        _isLoading.value = true
        // Simula um delay e depois retorna
        android.os.Handler().postDelayed({
            _isLoading.value = false
            // tratar erro'
        }, 2000)
    }
}