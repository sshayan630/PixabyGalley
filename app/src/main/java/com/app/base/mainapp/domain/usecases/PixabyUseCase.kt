package com.app.base.mainapp.domain.usecases

import com.app.base.mainapp.data.source.remote.ApiErrorHandle
import com.app.base.mainapp.data.source.remote.model.request.PixabyRequest
import com.app.base.mainapp.data.source.remote.model.response.PixabyResponse
import com.app.base.mainapp.domain.repository.PixabyRepository
import com.app.base.mainapp.domain.usecases.base.BaseUseCase

class PixabyUseCase (
    private var pixabyRepository: PixabyRepository,
    private val apiErrorHandle: ApiErrorHandle
) : BaseUseCase<PixabyResponse, PixabyRequest>(apiErrorHandle){

    override suspend fun run(pixabyRequest: PixabyRequest?): PixabyResponse {
        return pixabyRepository.getPixabyItem(pixabyRequest)
    }
}