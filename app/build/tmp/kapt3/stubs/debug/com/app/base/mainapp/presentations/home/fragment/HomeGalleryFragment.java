package com.app.base.mainapp.presentations.home.fragment;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010%\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010\'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/app/base/mainapp/presentations/home/fragment/HomeGalleryFragment;", "Lcom/app/base/mainapp/base/BaseFragment;", "()V", "binding", "Lcom/app/base/mainapp/databinding/FragmentHomeGalleryBinding;", "dataBindingComponent", "Lcom/app/base/mainapp/base/MyDataBindingComponent;", "galleryListingAdapter", "Lcom/app/base/mainapp/presentations/home/fragment/adapter/GalleryListingAdapter;", "isTyping", "", "()Z", "setTyping", "(Z)V", "viewModel", "Lcom/app/base/mainapp/presentations/home/HomeGalleryViewModel;", "getViewModel", "()Lcom/app/base/mainapp/presentations/home/HomeGalleryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addObservers", "", "fetchImages", "searchStr", "", "Lcom/app/base/mainapp/base/BaseViewModel;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setPixabyData", "pixabyResponse", "Lcom/app/base/mainapp/data/source/remote/model/response/PixabyResponse;", "app_debug"})
public final class HomeGalleryFragment extends com.app.base.mainapp.base.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.app.base.mainapp.databinding.FragmentHomeGalleryBinding binding;
    private com.app.base.mainapp.presentations.home.fragment.adapter.GalleryListingAdapter galleryListingAdapter;
    private com.app.base.mainapp.base.MyDataBindingComponent dataBindingComponent;
    private boolean isTyping;
    private java.util.HashMap _$_findViewCache;
    
    private final com.app.base.mainapp.presentations.home.HomeGalleryViewModel getViewModel() {
        return null;
    }
    
    public final boolean isTyping() {
        return false;
    }
    
    public final void setTyping(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addObservers() {
    }
    
    public final void setPixabyData(@org.jetbrains.annotations.Nullable()
    com.app.base.mainapp.data.source.remote.model.response.PixabyResponse pixabyResponse) {
    }
    
    public final void fetchImages(@org.jetbrains.annotations.NotNull()
    java.lang.String searchStr) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.app.base.mainapp.base.BaseViewModel getViewModel() {
        return null;
    }
    
    public HomeGalleryFragment() {
        super();
    }
}