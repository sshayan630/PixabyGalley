package com.app.base.mainapp.presentations.home.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.app.base.mainapp.data.source.remote.model.response.PixabyItem
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class PixabyDetailFragmentArgs(val pixabyItem: PixabyItem) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(PixabyItem::class.java)) {
            result.putParcelable("pixabyItem", this.pixabyItem as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(PixabyItem::class.java)) {
            result.putSerializable("pixabyItem", this.pixabyItem as Serializable)
        } else {
            throw UnsupportedOperationException(PixabyItem::class.java.name +
                    " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): PixabyDetailFragmentArgs {
            bundle.setClassLoader(PixabyDetailFragmentArgs::class.java.classLoader)
            val __pixabyItem : PixabyItem?
            if (bundle.containsKey("pixabyItem")) {
                if (Parcelable::class.java.isAssignableFrom(PixabyItem::class.java) ||
                        Serializable::class.java.isAssignableFrom(PixabyItem::class.java)) {
                    __pixabyItem = bundle.get("pixabyItem") as PixabyItem?
                } else {
                    throw UnsupportedOperationException(PixabyItem::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__pixabyItem == null) {
                    throw IllegalArgumentException("Argument \"pixabyItem\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"pixabyItem\" is missing and does not have an android:defaultValue")
            }
            return PixabyDetailFragmentArgs(__pixabyItem)
        }
    }
}
