package com.litepayapp.app.modules.bettingthree.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class BettingThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectProvider: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_select_provider)

)
