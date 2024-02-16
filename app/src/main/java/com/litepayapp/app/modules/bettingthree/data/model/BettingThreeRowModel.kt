package com.litepayapp.app.modules.bettingthree.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class BettingThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSportyBet: String? = MyApp.getInstance().resources.getString(R.string.lbl_sportybet)

)
