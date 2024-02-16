package com.litepayapp.app.modules.bettingtwo.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class BettingTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSportyBet: String? = MyApp.getInstance().resources.getString(R.string.lbl_sportybet)

)
