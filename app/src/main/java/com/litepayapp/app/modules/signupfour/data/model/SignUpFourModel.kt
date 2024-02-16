package com.litepayapp.app.modules.signupfour.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomebackNw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_back_nw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFingerprintOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_fingerprint)

)
