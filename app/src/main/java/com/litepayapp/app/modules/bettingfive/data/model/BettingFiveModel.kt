package com.litepayapp.app.modules.bettingfive.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class BettingFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBettingsuccess: String? =
      MyApp.getInstance().resources.getString(R.string.msg_betting_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirm: String? = MyApp.getInstance().resources.getString(R.string.lbl_confirm)

)
