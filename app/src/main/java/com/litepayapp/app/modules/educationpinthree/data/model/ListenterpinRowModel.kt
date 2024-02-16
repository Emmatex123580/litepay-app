package com.litepayapp.app.modules.educationpinthree.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListenterpinRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterPIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_pin)

)
