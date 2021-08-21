package com.app.base.mainapp.presentations.home

import androidx.lifecycle.MutableLiveData
import com.app.base.mainapp.base.BaseViewModel
import com.app.base.mainapp.data.source.remote.model.ErrorModel
import com.app.base.mainapp.data.source.remote.model.request.PixabyRequest
import com.app.base.mainapp.data.source.remote.model.response.PixabyResponse
import com.app.base.mainapp.domain.usecases.*
import com.app.base.mainapp.domain.usecases.base.Outcome
import com.app.base.mainapp.domain.usecases.base.UseCaseResponse

class HomeGalleryViewModel (
    private var pixabyUseCase: PixabyUseCase
): BaseViewModel(){

    private val pixabyLiveData = MutableLiveData<PixabyResponse>()

    fun pixabyLiveData() = pixabyLiveData

    fun getPixabySearch(request: PixabyRequest) {
        outcomeLiveData.value = Outcome.Start<Any>()
        pixabyUseCase.invoke(
            scope,
            request,
            object : UseCaseResponse<PixabyResponse> {
                override fun onSuccess(result: PixabyResponse) {
                    outcomeLiveData.value = Outcome.End<Any>()
                    result.let {
                        pixabyLiveData.value = result
                    }
                }

                override fun onError(errorModel: ErrorModel?) {
                    outcomeLiveData.value = Outcome.Failure<Any>(errorModel)
                }
            })
    }
}