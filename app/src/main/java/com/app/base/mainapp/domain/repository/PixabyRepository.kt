package com.app.base.mainapp.domain.repository

import com.app.base.mainapp.data.source.remote.model.request.PixabyRequest
import com.app.base.mainapp.data.source.remote.model.response.PixabyResponse

interface PixabyRepository {
    suspend fun getPixabyItem(
        pixabyRequest: PixabyRequest?): PixabyResponse
}