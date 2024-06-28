package com.example.listadeideias.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBarView(title: String) {
    Row(
        modifier = Modifier.fillMaxWidth().
        border(1.dp, color = Color.Black).background(Color.Blue).height(50.dp)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth().padding(4.dp),
            text = title, textAlign = TextAlign.Center,
            color = Color.White
        )
    }

}