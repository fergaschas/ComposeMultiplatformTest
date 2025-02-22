package com.fgascon.todotest.core.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class HomeViewModel : ViewModel() {
    var state = MutableStateFlow(HomeState())
        private set

    fun onAction(action: HomeActions) {

    }

}

class HomeState {

}

sealed interface HomeActions{

}