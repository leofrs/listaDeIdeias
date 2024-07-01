package com.example.listadeideias.viewModel


import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.listadeideias.model.ListFake
import com.example.listadeideias.model.ListModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ListViewModel: ViewModel() {
    var title by mutableStateOf("")
    var description by mutableStateOf("")
    private val _notes = mutableStateOf(mutableListOf<ListModel>(ListModel(id = 0, "", "")))
    val notes: MutableState<MutableList<ListModel>> get() = _notes

    fun addTitle(newTitle: String) {
        title = newTitle
    }

    fun addDescription(newDescription: String) {
       description = newDescription
    }

    fun addNote() {
        if (title.isNotBlank() && description.isNotBlank()) {
            _notes.value += ListModel(id = 1, title, description)
            title = ""
            description = ""
        }
    }
}