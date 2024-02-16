package com.litepayapp.app.modules.withdrawbonusfour.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class WithdrawBonusFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmTransac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_transac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouareaboutt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_are_about_t3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterPINtoco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_pin_to_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame627153: String? = MyApp.getInstance().resources.getString(R.string.lbl_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame627155: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUseFingerprint: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_use_fingerprint)

)
