package com.litepayapp.app.modules.signinseven.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class SignInSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseenterth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouveentered: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_ve_entered2)

)
