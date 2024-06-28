package com.example.listadeideias.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.listadeideias.model.ListModel

@Composable
fun CardListView(item: ListModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 12.dp).clickable {  }
    ){
        Column(
            modifier = Modifier
                .background(Color.DarkGray)
                .fillMaxWidth()
                .padding(all = 16.dp)
        ){
            Text(
                text = item.title,
                color = Color.White
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                modifier = Modifier.clickable {  },
                text = "Alterar"
            )
            Text(
                modifier = Modifier.clickable {  },
                text = "Excluir"
            )
        }
    }
}