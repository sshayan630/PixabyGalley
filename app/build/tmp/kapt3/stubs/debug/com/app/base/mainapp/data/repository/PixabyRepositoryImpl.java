package com.app.base.mainapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/app/base/mainapp/data/repository/PixabyRepositoryImpl;", "Lcom/app/base/mainapp/domain/repository/PixabyRepository;", "apiInterface", "Lcom/app/base/mainapp/data/source/remote/ApiInterface;", "(Lcom/app/base/mainapp/data/source/remote/ApiInterface;)V", "getPixabyItem", "Lcom/app/base/mainapp/data/source/remote/model/response/PixabyResponse;", "pixabyRequest", "Lcom/app/base/mainapp/data/source/remote/model/request/PixabyRequest;", "(Lcom/app/base/mainapp/data/source/remote/model/request/PixabyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PixabyRepositoryImpl implements com.app.base.mainapp.domain.repository.PixabyRepository {
    private com.app.base.mainapp.data.source.remote.ApiInterface apiInterface;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPixabyItem(@org.jetbrains.annotations.Nullable()
    com.app.base.mainapp.data.source.remote.model.request.PixabyRequest pixabyRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.app.base.mainapp.data.source.remote.model.response.PixabyResponse> p1) {
        return null;
    }
    
    public PixabyRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.data.source.remote.ApiInterface apiInterface) {
        super();
    }
}