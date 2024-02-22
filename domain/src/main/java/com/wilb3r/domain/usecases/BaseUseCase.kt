package com.wilb3r.domain.usecases

import kotlinx.coroutines.flow.Flow

abstract class BaseUseCase<out T, in P> where T : Any? {
    abstract suspend fun run(params: P? = null): Flow<T>

    @JvmOverloads
    suspend operator fun invoke(
        params: P? = null
    ): Flow<T> = run(params)
}
