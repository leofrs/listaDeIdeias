package com.example.listadeideias.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun EditItemView() {
    Scaffold(
        topBar = { TopBarView(title = "Atualizar") }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Titulo")})
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Descrição")})
            }
            Row (
                modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Atualizar")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Cancelar")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EditItemPreview() {
    EditItemView()
}