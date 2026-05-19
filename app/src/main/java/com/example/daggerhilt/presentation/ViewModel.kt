package com.example.daggerhilt.presentation

import android.text.BoringLayout
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggerhilt.domain.UseCases.UserUseCase
import com.example.daggerhilt.domain.model.DomainUserResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

@HiltViewModel
class UserViewModel @Inject constructor(
    val useCase: UserUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(UIState())
    val uiState = _uiState.asStateFlow()

 init {
     getUser()
 }
    fun getUser() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isLoading = true
            )
            try {
                val result = useCase()
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    result = result
                )
            }catch (e: Exception){
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error= e.message
                )
            }
        }
    }
}

data class UIState(
    val isLoading: Boolean = false,
    val result: List<DomainUserResponse> = emptyList(),
    val error: String? = null
)