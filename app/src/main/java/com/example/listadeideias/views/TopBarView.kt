package com.example.listadeideias.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.listadeideias.ScreenRoutes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarView(title: String, backButton: () -> Unit) {
    TopAppBar(
        title = {
            Text(
            modifier = Modifier.width(380.dp),
            text = title, textAlign = TextAlign.Center
        ) },
        navigationIcon = {
            if (title == "Adicionar Ideia" || title == "Editar Lista"){
                Icon(
                    modifier = Modifier.clickable { backButton() },
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow back",
                    tint = Color.White
                )
            }
        },
        colors = TopAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.Unspecified,
            scrolledContainerColor = Color.Unspecified,
            actionIconContentColor = Color.Unspecified
        )
    )
}