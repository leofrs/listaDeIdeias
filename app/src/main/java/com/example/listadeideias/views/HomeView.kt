package com.example.listadeideias.views

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeView() {
    Scaffold(
        topBar = { TopBarView("List of Ideas") },
        bottomBar = { BottomBarView("© L.S Android Developer") }
    ) {
        LazyColumn (
            modifier = Modifier.padding(it)
        ){

        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeViewPreview() {
    HomeView()
}