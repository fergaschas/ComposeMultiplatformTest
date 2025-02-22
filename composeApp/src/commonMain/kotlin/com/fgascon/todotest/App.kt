package com.fgascon.todotest

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fgascon.todotest.core.navigation.BottomNavBar
import com.fgascon.todotest.core.navigation.BottomNavItem
import com.fgascon.todotest.core.ui.HomeScreen
import com.fgascon.todotest.core.ui.HomeViewModel
import kotlinx.serialization.Serializable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

sealed interface Screens {
    @Serializable
    data object Home : Screens
}

@Composable
fun App() {
    MaterialTheme {
        val navController = rememberNavController()

        Scaffold(
            bottomBar = { BottomNavBar(navController) }
        ) { paddingValues ->
            NavHost(
                navController = navController,
                startDestination = BottomNavItem.Home.route,
                modifier = Modifier.consumeWindowInsets(paddingValues)
            ) {
                composable(BottomNavItem.Home.route) {
                    val viewModel = koinViewModel<HomeViewModel>()
                    HomeScreen(viewModel)
                }
                composable(BottomNavItem.Tracking.route) {
//                    TrackingScreen()
                }
                composable(BottomNavItem.Health.route) {
//                    HealthScreen()
                }
                composable(BottomNavItem.Settings.route) {
//                    SettingsScreen()
                }
            }
        }
    }

}



