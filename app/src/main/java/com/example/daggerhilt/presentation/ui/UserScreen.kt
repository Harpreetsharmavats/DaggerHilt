package com.example.daggerhilt.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.daggerhilt.presentation.UserViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun UserScreen(modifier: Modifier = Modifier) {
    val viewModel: UserViewModel = hiltViewModel()
    val state by viewModel.uiState.collectAsState()

    Box(modifier = Modifier.fillMaxSize()){
        when {

            state.isLoading -> CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            state.error != null-> {
                Text( text = state.error.toString() ?: "Unknown error" )
            }
            else-> {
                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(state.result){ result->
                        Text(text = result.results.toString() )
                    }
                }
            }
        }
    }

}

