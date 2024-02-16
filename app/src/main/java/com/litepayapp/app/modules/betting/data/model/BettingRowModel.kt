package com.litepayapp.app.modules.betting.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class BettingRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame627101: String? = MyApp.getInstance().resources.getString(R.string.lbl_n100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame627102: String? = MyApp.getInstance().resources.getString(R.string.lbl_n400)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame627103: String? = MyApp.getInstance().resources.getString(R.string.lbl_n900)

)
