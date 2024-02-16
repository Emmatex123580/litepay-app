package com.litepayapp.app.modules.signinfive.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class SignInFiveModel(
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
  var txtDidntreceive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_didn_t_receive)

)
