package com.example.listadeideias

sealed class ScreenRoutes(val route: String) {
    data object HomeScreen: ScreenRoutes("home_screen")
    data object AddScreen: ScreenRoutes("add_screen")
    data object EditScreen: ScreenRoutes("edit_screen")
}