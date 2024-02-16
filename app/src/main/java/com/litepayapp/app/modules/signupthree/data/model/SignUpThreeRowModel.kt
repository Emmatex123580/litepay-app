package com.litepayapp.app.modules.signupthree.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUsernameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)

)
