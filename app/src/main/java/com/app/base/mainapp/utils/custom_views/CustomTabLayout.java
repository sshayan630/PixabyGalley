package com.app.base.mainapp.utils.custom_views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.base.mainapp.R;
import com.google.android.material.tabs.TabLayout;



public class CustomTabLayout extends TabLayout {
    private Typeface mTypeface;

    public CustomTabLayout(Context context) {
        super(context);
        init();
    }

    public CustomTabLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setTypeface(R.string.Lato_Regular);
    }

    public void setTypeface(int resId) {
        mTypeface = Typeface.createFromAsset(getContext().getAssets(), getContext().getString(resId));
    }

//    @Override
    public void addTabs(Tab tab, boolean enable) {
        super.addTab(tab);

        ViewGroup mainView = (ViewGroup) getChildAt(0);
        if (mainView == null)
            return;
        ViewGroup tabView = (ViewGroup) mainView.getChildAt(tab.getPosition());
        if(!enable){
            tabView.setOnTouchListener(new OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    return true;
                }
            });
        }

        int tabChildCount = tabView.getChildCount();
        for (int i = 0; i < tabChildCount; i++) {
            View tabViewChild = tabView.getChildAt(i);
            if (tabViewChild instanceof TextView) {
                TypefaceTextView.customTypeface(((TextView) tabViewChild),getContext().getString(R.string.Lato_Bold));
            }
        }
    }
    public void addTabs(Tab tab) {
        super.addTab(tab);

        ViewGroup mainView = (ViewGroup) getChildAt(0);
        if (mainView == null)
            return;
        ViewGroup tabView = (ViewGroup) mainView.getChildAt(tab.getPosition());


        int tabChildCount = tabView.getChildCount();
        for (int i = 0; i < tabChildCount; i++) {
            View tabViewChild = tabView.getChildAt(i);
            if (tabViewChild instanceof TextView) {
                TypefaceTextView.customTypeface(((TextView) tabViewChild),getContext().getString(R.string.Lato_SemiBold));
            }
        }
    }

}