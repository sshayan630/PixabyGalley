package com.app.base.mainapp.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/app/base/mainapp/domain/repository/PixabyRepository;", "", "getPixabyItem", "Lcom/app/base/mainapp/data/source/remote/model/response/PixabyResponse;", "pixabyRequest", "Lcom/app/base/mainapp/data/source/remote/model/request/PixabyRequest;", "(Lcom/app/base/mainapp/data/source/remote/model/request/PixabyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PixabyRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPixabyItem(@org.jetbrains.annotations.Nullable()
    com.app.base.mainapp.data.source.remote.model.request.PixabyRequest pixabyRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.app.base.mainapp.data.source.remote.model.response.PixabyResponse> p1);
}