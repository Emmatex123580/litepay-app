package com.litepayapp.app.modules.walletsummary.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListbiphoneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtime: String? = MyApp.getInstance().resources.getString(R.string.lbl_airtime)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtData: String? = MyApp.getInstance().resources.getString(R.string.lbl_data)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtElectricity: String? = MyApp.getInstance().resources.getString(R.string.lbl_electricity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCableSub: String? = MyApp.getInstance().resources.getString(R.string.lbl_cable_sub)

)
