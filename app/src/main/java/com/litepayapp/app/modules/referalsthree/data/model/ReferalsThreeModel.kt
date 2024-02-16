package com.litepayapp.app.modules.referalsthree.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class ReferalsThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_old_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_password2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReenterNewPa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_re_enter_new_pa)

)
