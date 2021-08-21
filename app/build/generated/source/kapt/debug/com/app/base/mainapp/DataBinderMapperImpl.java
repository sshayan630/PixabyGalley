package com.app.base.mainapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.base.mainapp.databinding.ActivityBaseBindingImpl;
import com.app.base.mainapp.databinding.FragmentHomeGalleryBindingImpl;
import com.app.base.mainapp.databinding.FragmentImageDetailBindingImpl;
import com.app.base.mainapp.databinding.ItemPixabyBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_FRAGMENTHOMEGALLERY = 2;

  private static final int LAYOUT_FRAGMENTIMAGEDETAIL = 3;

  private static final int LAYOUT_ITEMPIXABY = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.fragment_home_gallery, LAYOUT_FRAGMENTHOMEGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.fragment_image_detail, LAYOUT_FRAGMENTIMAGEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.item_pixaby, LAYOUT_ITEMPIXABY);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBASE: {
          if ("layout/activity_base_0".equals(tag)) {
            return new ActivityBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_base is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOMEGALLERY: {
          if ("layout/fragment_home_gallery_0".equals(tag)) {
            return new FragmentHomeGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMAGEDETAIL: {
          if ("layout/fragment_image_detail_0".equals(tag)) {
            return new FragmentImageDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_image_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPIXABY: {
          if ("layout/item_pixaby_0".equals(tag)) {
            return new ItemPixabyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_pixaby is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "pixaby");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_base_0", com.app.base.mainapp.R.layout.activity_base);
      sKeys.put("layout/fragment_home_gallery_0", com.app.base.mainapp.R.layout.fragment_home_gallery);
      sKeys.put("layout/fragment_image_detail_0", com.app.base.mainapp.R.layout.fragment_image_detail);
      sKeys.put("layout/item_pixaby_0", com.app.base.mainapp.R.layout.item_pixaby);
    }
  }
}
