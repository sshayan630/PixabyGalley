package com.app.base.mainapp.presentations.home.fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseListAdapter
import com.app.base.mainapp.data.source.remote.model.response.PixabyItem
import com.app.base.mainapp.databinding.ItemPixabyBinding

class GalleryListingAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val clickDetailListener: (item: PixabyItem) -> Unit
) : BaseListAdapter<PixabyItem, ItemPixabyBinding>(
    diffCallback = diffCallback
) {


    override fun createBinding(parent: ViewGroup, viewType: Int): ItemPixabyBinding {
        val binding = DataBindingUtil.inflate<ItemPixabyBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_pixaby,
            parent,
            false,
            dataBindingComponent
        )

        return binding
    }

    override fun bind(binding: ItemPixabyBinding, item: PixabyItem, position: Int) {
        binding.pixaby = item
        binding.root.setOnClickListener {
            clickDetailListener(getItem(position))
        }

    }


}

private val diffCallback: DiffUtil.ItemCallback<PixabyItem> =
    object : DiffUtil.ItemCallback<PixabyItem>() {
        override fun areItemsTheSame(oldItem: PixabyItem, newItem: PixabyItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: PixabyItem, newItem: PixabyItem): Boolean {
            return oldItem.previewUrl == newItem.previewUrl
        }
    }
