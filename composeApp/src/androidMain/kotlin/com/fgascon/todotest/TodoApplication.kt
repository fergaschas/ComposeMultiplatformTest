package com.fgascon.todotest

import android.app.Application
import com.fgascon.todotest.di.initKoin
import org.koin.android.ext.koin.androidContext

class TodoApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@TodoApplication)
        }

    }
}