package com.example.daggerhilt.presentation.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.daggerhilt.presentation.ViewModel

@Composable
fun UserScreen(modifier: Modifier = Modifier) {
    val viewModel: ViewModel =
    val state by viewModel.uiState.collectAsState()

}