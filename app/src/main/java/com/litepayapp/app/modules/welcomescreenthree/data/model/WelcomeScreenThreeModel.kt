package com.litepayapp.app.modules.welcomescreenthree.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeScreenThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConvenience: String? = MyApp.getInstance().resources.getString(R.string.lbl_convenience)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_your_vtu_ne)

)
