package com.example.listadeideias.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.listadeideias.ScreenRoutes
import com.example.listadeideias.viewModel.ListViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun AddItemView(navController: NavController, viewModel: ListViewModel = viewModel()) {
    Scaffold(
        topBar = {
            TopBarView(
                title = "Adicionar Ideia",
                backButton = { navController.navigateUp() }
            )},
        bottomBar = { BottomBarView(title = "© L.S Android Developer")}
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                OutlinedTextField(
                    value = viewModel.title,
                    onValueChange = {viewModel.addTitle(it)},
                    label = { Text(text = "Titulo")},
                )
            }
            Row {
                OutlinedTextField(
                    value = viewModel.description,
                    onValueChange = {viewModel.addDescription(it)},
                    label = { Text(text = "Descrição")},
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = {viewModel.addNote()},
                ) {
                    Text(text = "Adicionar")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Cancelar")
                }
            }
        }
    }
}