package com.wilb3r.common.result

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart

sealed interface Result<out T> {
    data class Success<T>(val data: T) : Result<T>
    data class Error(val exception: Throwable? = null) : Result<Nothing>
    data object Running : Result<Nothing>
}

fun <T> Flow<T>.asResult(): Flow<Result<T>> {
    return this
        .map<T, Result<T>> {
            Result.Success(it)
        }
        .onStart { emit(Result.Running) }
        .catch { emit(Result.Error(it)) }
}

inline fun <T : Any> asFlow2(crossinline block: suspend () -> T) =
    flow {
        try {
            emit(Result.Running)
            emit(Result.Success(block.invoke()))
        } catch (e: Exception) {
            emit(Result.Error(e))
        }
    }

inline fun <T : Any> asFlow(sleep: Long? = null, crossinline block: suspend () -> T) =
    flow {
        sleep?.let {
            kotlinx.coroutines.delay(sleep)
        }
        emit(block.invoke())
    }

