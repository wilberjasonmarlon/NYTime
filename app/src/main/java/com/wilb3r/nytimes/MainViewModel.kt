package com.wilb3r.nytimes

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wilb3r.common.result.logInfo
import com.wilb3r.domain.model.model_domain.TopStories
import com.wilb3r.domain.usecases.GetTopStoriesUseCase
import com.wilb3r.nytimes.composables.StateOf
import com.wilb3r.nytimes.composables.manageResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: GetTopStoriesUseCase
) : ViewModel() {

    var state by mutableStateOf(StateOf<TopStories>())
        private set

    fun getTopStories(section: String = "home") = viewModelScope.launch {
        useCase.run(section).collectLatest {
            state = manageResult(it, state)
            logInfo(">> $state")
        }
    }

}