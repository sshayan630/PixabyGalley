package com.app.base.mainapp.presentations.home.fragment

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseActivity
import com.app.base.mainapp.base.BaseFragment
import com.app.base.mainapp.base.BaseViewModel
import com.app.base.mainapp.data.source.remote.model.response.PixabyItem
import com.app.base.mainapp.databinding.FragmentImageDetailBinding
import com.app.base.mainapp.utils.AppUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.app_bar_main.*


/**
 * A simple [Fragment] subclass.
 */
class PixabyDetailFragment : BaseFragment() {

    private lateinit var binding: FragmentImageDetailBinding
     private val args by navArgs<PixabyDetailFragmentArgs>()
    lateinit var pixabyItem: PixabyItem
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        if (!this::binding.isInitialized) {
            binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_image_detail, null, false)
        }

        // Argument set
        pixabyItem = args.pixabyItem

        // Set User as title bar
        AppUtils.setTitleToolbar(
            requireActivity().tool_bar,
            pixabyItem.imageUser
        )

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Show Progressbar
        (requireActivity() as BaseActivity).showProgressWithTransparentBackground()
        Glide.with(this).load(pixabyItem.largeImageUrl)
            .skipMemoryCache(true)
            .listener(object : RequestListener<Drawable?> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable?>?,
                    isFirstResource: Boolean
                ): Boolean {
                    // Hide Progressbar
                    (requireActivity() as BaseActivity).hideProgress()
                    return false; // important to return false so the error placeholder can be placed

                }


                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: com.bumptech.glide.request.target.Target<Drawable?>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    // Hide Progressbar
                    (requireActivity() as BaseActivity).hideProgress()
                    return false; // important to return false so the error placeholder can be placed

                }
            })
            .into(binding.detailImage)

    }


    override fun getViewModel(): BaseViewModel? {
        return null
    }
}
