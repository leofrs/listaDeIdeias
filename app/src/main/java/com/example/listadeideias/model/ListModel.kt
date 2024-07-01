package com.example.listadeideias.model

data class ListModel(
    val id: Int = 0,
    val title: String = "",
    val description: String = ""
)
object ListFake{
    val list = mutableListOf(
        ListModel(
            title = "Item 1", description = "Descrição 1"
        ),
        ListModel(
            title = "Item 2", description = "Descrição 2"
        ),
        ListModel(
            title = "Item 3", description = "Descrição 3"
        ),
    )
}