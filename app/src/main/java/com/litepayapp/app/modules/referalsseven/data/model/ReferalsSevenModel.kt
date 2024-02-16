package com.litepayapp.app.modules.referalsseven.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class ReferalsSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePINOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_change_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_old_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReenterNewPI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_re_enter_new_pi)

)
