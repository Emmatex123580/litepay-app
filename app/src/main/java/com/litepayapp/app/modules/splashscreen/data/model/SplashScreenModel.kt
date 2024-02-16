package com.litepayapp.app.modules.splashscreen.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLitePay: String? = MyApp.getInstance().resources.getString(R.string.lbl_lite_pay)

)
