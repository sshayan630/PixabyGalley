package com.app.base.mainapp.data.repository

import com.app.base.mainapp.data.source.remote.ApiInterface
import com.app.base.mainapp.data.source.remote.model.request.PixabyRequest
import com.app.base.mainapp.data.source.remote.model.response.PixabyResponse
import com.app.base.mainapp.domain.repository.PixabyRepository

class PixabyRepositoryImpl(private var apiInterface: ApiInterface) :
    PixabyRepository {
    override suspend fun getPixabyItem(pixabyRequest: PixabyRequest?): PixabyResponse {
        return apiInterface.pixabyImages(pixabyRequest!!.key,pixabyRequest!!.search,pixabyRequest!!.type,pixabyRequest!!.perPage)
    }
}