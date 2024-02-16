package com.litepayapp.app.modules.withdrawbonusseven.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class WithdrawBonusSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBetting: String? = MyApp.getInstance().resources.getString(R.string.lbl_betting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterbonusamo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_bonus_amo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPricing: String? = MyApp.getInstance().resources.getString(R.string.lbl_pricing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReferrals: String? = MyApp.getInstance().resources.getString(R.string.lbl_referrals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame627042Value: String? = null
)
