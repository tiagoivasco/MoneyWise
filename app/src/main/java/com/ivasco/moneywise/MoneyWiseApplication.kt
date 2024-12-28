package com.ivasco.moneywise

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import com.ivasco.moneywise.di.appModule

class MoneyWiseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MoneyWiseApplication)
            modules(appModule)
        }
    }
}