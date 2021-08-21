package com.app.base.mainapp.presentations.home.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.app.base.mainapp.R
import com.app.base.mainapp.data.source.remote.model.response.PixabyItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class HomeGalleryFragmentDirections private constructor() {
    private data class ActionHomeFragmentToDetailFragment(val pixabyItem: PixabyItem) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_homeFragment_to_detailFragment

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
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
    }

    companion object {
        fun actionHomeFragmentToDetailFragment(pixabyItem: PixabyItem): NavDirections =
                ActionHomeFragmentToDetailFragment(pixabyItem)
    }
}
