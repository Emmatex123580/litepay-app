package com.litepayapp.app.modules.welcomescreentwo.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeScreenTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUserFriendly: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_friendly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_navigate_effort)

)
