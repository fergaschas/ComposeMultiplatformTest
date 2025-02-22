package com.fgascon.todotest

import androidx.compose.ui.window.ComposeUIViewController
import com.fgascon.todotest.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }