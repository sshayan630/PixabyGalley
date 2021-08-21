package com.app.base.mainapp.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/app/base/mainapp/data/source/remote/ApiInterface;", "", "pixabyImages", "Lcom/app/base/mainapp/data/source/remote/model/response/PixabyResponse;", "apiKey", "", "searchTerm", "image_type", "perPage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/")
    public abstract java.lang.Object pixabyImages(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "key")
    java.lang.String apiKey, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchTerm, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "image_type")
    java.lang.String image_type, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "per_page")
    java.lang.String perPage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.app.base.mainapp.data.source.remote.model.response.PixabyResponse> p4);
}