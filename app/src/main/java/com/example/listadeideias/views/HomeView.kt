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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.listadeideias.model.ListFake

@Composable
fun HomeView() {
    Scaffold(
        topBar = { TopBarView("List of Ideas") },
        bottomBar = { BottomBarView("© L.S Android Developer") },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
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
            items(ListFake.list){
                item -> CardListView(item = item)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeViewPreview() {
    HomeView()
}