package com.app.base.mainapp.presentations.home.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.TextView.OnEditorActionListener
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.app.base.mainapp.BuildConfig
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseFragment
import com.app.base.mainapp.base.BaseViewModel
import com.app.base.mainapp.base.MyDataBindingComponent
import com.app.base.mainapp.data.source.remote.model.request.PixabyRequest
import com.app.base.mainapp.data.source.remote.model.response.PixabyItem
import com.app.base.mainapp.data.source.remote.model.response.PixabyResponse
import com.app.base.mainapp.databinding.FragmentHomeGalleryBinding
import com.app.base.mainapp.presentations.home.HomeGalleryViewModel
import com.app.base.mainapp.presentations.home.fragment.adapter.GalleryListingAdapter
import com.app.base.mainapp.utils.AppUtils
import com.app.base.mainapp.utils.Constants
import com.app.base.mainapp.utils.gone
import com.app.base.mainapp.utils.visible
import kotlinx.android.synthetic.main.app_bar_main.*
import org.koin.android.viewmodel.ext.android.viewModel


/**
 * A simple [Fragment] subclass.
 */
class HomeGalleryFragment : BaseFragment() {
    private val viewModel: HomeGalleryViewModel by viewModel()
    private lateinit var binding: FragmentHomeGalleryBinding
    private lateinit var galleryListingAdapter: GalleryListingAdapter
    private var dataBindingComponent = MyDataBindingComponent(this)
    var isTyping = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        AppUtils.setTitleToolbar(
            requireActivity().tool_bar,
            requireContext().resources.getString(R.string.heading_text)
        )
        addObservers()

        if (!this::binding.isInitialized) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_gallery, null, false)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        galleryListingAdapter  = GalleryListingAdapter(dataBindingComponent) {
            //Navigating to detail screen
            val action = HomeGalleryFragmentDirections.actionHomeFragmentToDetailFragment(it)
            findNavController().navigate(action)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initial Default search
        fetchImages(Constants.DEFAULT_SEARCH)

    }
    // Observer set for getting API response
    private fun addObservers() {

        viewModel.pixabyLiveData().observe(viewLifecycleOwner, Observer {

            setPixabyData(it)
        })
    }

    // Method to populate images from Pixaby API response
    fun setPixabyData(pixabyResponse: PixabyResponse?) {

        val  pixabyItemList = ArrayList<PixabyItem>()


        if(pixabyResponse!!.total>0) {
            binding.rvGallery.visible()
            binding.tvEmpty.gone()
            for (results in pixabyResponse!!.hits) {
                val pixabyItem = PixabyItem()
                pixabyItem.id = results.id
                pixabyItem.previewUrl = results.previewURL
                pixabyItem.largeImageUrl = results.largeImageURL
                pixabyItem.imageUser = results.user

                pixabyItemList.add(pixabyItem)
            }
            galleryListingAdapter.submitList(pixabyItemList)
            binding.rvGallery.adapter = galleryListingAdapter
        }
        else{
            binding.rvGallery.gone()
            binding.tvEmpty.visible()
        }

        binding.etSearch.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                var searchTerm= binding.etSearch.text.toString()
                if(!searchTerm.isNullOrEmpty())
                    fetchImages(searchTerm)
                else
                    fetchImages(Constants.DEFAULT_SEARCH)



                return@OnEditorActionListener true
            }
            false
        })
    }

    // Method to fetch images
    fun fetchImages(searchStr: String) {

        var request =PixabyRequest()
        request.key = BuildConfig.API_KEY
        request.search = searchStr
        request.type = Constants.IMAGES_TYPE
        request.perPage = Constants.PER_PAGE
        viewModel.getPixabySearch(request)
    }
    override fun getViewModel(): BaseViewModel? {
        return viewModel
    }




}