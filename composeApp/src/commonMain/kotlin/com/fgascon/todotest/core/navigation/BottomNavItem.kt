package com.fgascon.todotest.core.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val title: String, val icon: ImageVector) {
    data object Home : BottomNavItem("home", "Inicio", Icons.Default.Home)
    data object Tracking : BottomNavItem("tracking", "Seguimiento", Icons.Default.LocationOn)
    data object Health : BottomNavItem("health", "Salud", Icons.Default.Favorite)
    data object Settings : BottomNavItem("settings", "Ajustes", Icons.Default.Settings)
}
