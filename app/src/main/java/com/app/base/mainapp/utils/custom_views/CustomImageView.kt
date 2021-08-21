package com.app.base.mainapp.utils.custom_views

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
import com.app.base.mainapp.R

class CustomImageView : AppCompatImageView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initializeCustomImageView(attrs, context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        initializeCustomImageView(attrs, context)
    }

    private fun initializeCustomImageView(attrs: AttributeSet?, context: Context) {
        if (attrs != null) {

            val attributesArray = getContext().obtainStyledAttributes(attrs, R.styleable.CustomImageView)

            var drawable: Drawable?
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                drawable = attributesArray.getDrawable(R.styleable.CustomImageView_my_src_compat)
                setImageDrawable(drawable)
            } else {
                val drawableId = attributesArray.getResourceId(R.styleable.CustomImageView_my_src_compat, -1)
                if(drawableId != 0) {
                    setBackgroundDrawable(VectorDrawableCompat.create(context.resources, drawableId,null))

//                    drawable = VectorDrawableCompat.create(context.resources, drawableId, null)
//                    setImageResource(drawableId)
//                    setBackgroundDrawable(drawable)
//                    setImageDrawable(drawable)
                }

            }


            attributesArray.recycle()
        }
    }

    companion object {

        private val LOG_TAG = "CustomImageView"
    }

}