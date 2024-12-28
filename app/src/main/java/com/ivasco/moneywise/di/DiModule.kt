package com.ivasco.moneywise.di

import org.koin.dsl.module
import com.ivasco.moneywise.presentation.ui.login.LoginViewModel

val appModule = module {
    single { LoginViewModel() }
}