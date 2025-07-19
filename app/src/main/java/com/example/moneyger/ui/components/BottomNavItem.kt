package com.example.moneyger.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PieChart
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.filled.BarChart


sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val label: String
) {
    object Home : BottomNavItem("home", Icons.Filled.Home, "Home")
    object Stats : BottomNavItem("stats", Icons.Filled.BarChart, "Stats")
    object Settings : BottomNavItem("settings", Icons.Filled.Settings, "Settings")

    companion object {
        val items = listOf(Home, Stats, Settings)
    }
}
