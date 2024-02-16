package com.litepayapp.app.modules.referalsten.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class ReferalsTenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_change_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReenterNew: String? = MyApp.getInstance().resources.getString(R.string.msg_re_enter_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_passwor)

)
