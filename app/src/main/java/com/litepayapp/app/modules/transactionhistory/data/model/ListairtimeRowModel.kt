package com.litepayapp.app.modules.transactionhistory.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListairtimeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_airtime)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeb121220: String? = MyApp.getInstance().resources.getString(R.string.msg_feb_12_12_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtN50000: String? = MyApp.getInstance().resources.getString(R.string.lbl_n500_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccessful: String? = MyApp.getInstance().resources.getString(R.string.lbl_successful)

)
