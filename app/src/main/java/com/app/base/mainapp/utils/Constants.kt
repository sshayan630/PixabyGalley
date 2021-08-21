package com.app.base.mainapp.utils

import java.util.*


object Constants {

    lateinit var current_locale: Locale

    const val LANGUAGE_ENGLISH = "en"
    const val LANGUAGE_AR = "ar"
    var SELECTED_LANGUAGE = "en"


    // Database fields
    const val ID_FIELD = "id"

    // Response Code
    const val SUCCESS_CODE = 0
    // API TYPE
    const val IMAGES_TYPE = "photo"

    const val VIA_NOTIFICATION = "via_notification"
    const val PIXABY_IMAGES_ENDPOINT = "api/"
    const val DEFAULT_SEARCH = "flower"
    const val PER_PAGE= "30"

}