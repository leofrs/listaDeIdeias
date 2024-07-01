package com.example.listadeideias

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.listadeideias.viewModel.ListViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.listadeideias.views.AddItemView
import com.example.listadeideias.views.EditItemView
import com.example.listadeideias.views.HomeView

@Composable
fun Navigation(
    navController: NavHostController = rememberNavController(),
    viewModel: ListViewModel = viewModel()
) {
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.HomeScreen.route
    ){
        composable(route = ScreenRoutes.HomeScreen.route){
            HomeView(navController)
        }
        composable(route = ScreenRoutes.AddScreen.route){
            AddItemView(navController, viewModel)
        }
        composable(route = ScreenRoutes.EditScreen.route){
            EditItemView(navController)
        }
    }
}