package com.litepayapp.app.modules.withdrawbonusone.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class WithdrawBonusOneModel(
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
      MyApp.getInstance().resources.getString(R.string.msg_you_are_about_t2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUseFingerprint: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_use_fingerprint)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsePINInstead: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_use_pin_instead)

)
