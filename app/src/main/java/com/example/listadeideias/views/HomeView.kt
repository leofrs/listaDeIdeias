package com.example.listadeideias.views

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.listadeideias.ScreenRoutes
import com.example.listadeideias.model.ListFake
import com.example.listadeideias.viewModel.ListViewModel

@Composable
fun HomeView(navController: NavHostController, listViewModel: ListViewModel = viewModel()) {
    val notes by remember { listViewModel.notes }

    Scaffold(
        topBar = { TopBarView("List of Ideas", backButton = {}) },
        bottomBar = { BottomBarView("© L.S Android Developer") },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate(ScreenRoutes.AddScreen.route)
                          },
                containerColor = Color.Blue,
                contentColor = Color.White
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Botão de adicionar ideia"
                )
            }
        }
    ) {
        LazyColumn (
            modifier = Modifier.padding(it)
        ){
            items(notes){
                item -> CardListView(item = item, navController)
            }
        }
    }
}
