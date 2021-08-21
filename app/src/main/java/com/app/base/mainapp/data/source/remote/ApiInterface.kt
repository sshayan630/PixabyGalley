package com.app.base.mainapp.data.source.remote

import com.app.base.mainapp.data.source.remote.model.response.PixabyResponse
import com.app.base.mainapp.utils.Constants.PIXABY_IMAGES_ENDPOINT
import retrofit2.http.*


interface ApiInterface {
    @GET(PIXABY_IMAGES_ENDPOINT)
    suspend fun pixabyImages(
                      @Query("key") apiKey: String?,
                      @Query("q") searchTerm: String?,
                      @Query("image_type") image_type: String?,
                      @Query("per_page") perPage: String?): PixabyResponse
}