package com.litepayapp.app.modules.welcomescreen.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEfficiency: String? = MyApp.getInstance().resources.getString(R.string.lbl_efficiency)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recharge_in_a_b)

)
