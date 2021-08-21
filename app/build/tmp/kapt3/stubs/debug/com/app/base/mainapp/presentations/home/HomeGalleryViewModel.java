package com.app.base.mainapp.presentations.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/app/base/mainapp/presentations/home/HomeGalleryViewModel;", "Lcom/app/base/mainapp/base/BaseViewModel;", "pixabyUseCase", "Lcom/app/base/mainapp/domain/usecases/PixabyUseCase;", "(Lcom/app/base/mainapp/domain/usecases/PixabyUseCase;)V", "pixabyLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/app/base/mainapp/data/source/remote/model/response/PixabyResponse;", "getPixabySearch", "", "request", "Lcom/app/base/mainapp/data/source/remote/model/request/PixabyRequest;", "app_debug"})
public final class HomeGalleryViewModel extends com.app.base.mainapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.app.base.mainapp.data.source.remote.model.response.PixabyResponse> pixabyLiveData = null;
    private com.app.base.mainapp.domain.usecases.PixabyUseCase pixabyUseCase;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.app.base.mainapp.data.source.remote.model.response.PixabyResponse> pixabyLiveData() {
        return null;
    }
    
    public final void getPixabySearch(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.data.source.remote.model.request.PixabyRequest request) {
    }
    
    public HomeGalleryViewModel(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.domain.usecases.PixabyUseCase pixabyUseCase) {
        super();
    }
}