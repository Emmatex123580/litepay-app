package com.litepayapp.app.modules.signinfour.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class SignInFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryouremai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_emai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouveentered: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_ve_entered)

)
