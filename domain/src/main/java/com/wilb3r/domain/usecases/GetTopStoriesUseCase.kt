package com.wilb3r.domain.usecases

import com.wilb3r.common.result.Result
import com.wilb3r.common.result.asResult
import com.wilb3r.domain.model.model_domain.TopStories
import com.wilb3r.domain.repository.TopStoriesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTopStoriesUseCase @Inject constructor(
    private val topStoriesRepository: TopStoriesRepository
) : BaseUseCase<Result<TopStories>, String>() {

    override suspend fun run(params: String?): Flow<Result<TopStories>> {
        return topStoriesRepository.fetchTopStories(params).asResult()
    }
}