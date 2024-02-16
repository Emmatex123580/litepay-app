package com.litepayapp.app.modules.bettingfour.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class BettingFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFailed: String? = MyApp.getInstance().resources.getString(R.string.lbl_failed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_t_tc_i_04888_be)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirm: String? = MyApp.getInstance().resources.getString(R.string.lbl_confirm)

)
