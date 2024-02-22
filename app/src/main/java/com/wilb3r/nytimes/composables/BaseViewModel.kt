package com.wilb3r.nytimes.composables

import androidx.compose.runtime.Immutable
import com.wilb3r.common.result.Result


@Immutable
data class StateOf<out T>(
    val loading: Boolean = false,
    val data: T? = null,
    val error: Throwable? = null,
)

fun <T> manageResult(result: Result<T>, currentState: StateOf<T>): StateOf<T> {
    return when (result) {
        is Result.Running -> {
            currentState.copy(loading = true)
        }

        is Result.Success -> {
            currentState.copy(data = result.data, loading = false)
        }

        is Result.Error -> {
            currentState.copy(error = result.exception, loading = false)
        }
    }
}