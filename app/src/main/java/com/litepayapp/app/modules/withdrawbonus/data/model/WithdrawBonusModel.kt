package com.litepayapp.app.modules.withdrawbonus.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class WithdrawBonusModel(
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
  var txtSelectNetwork: String? = MyApp.getInstance().resources.getString(R.string.lbl_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_move_to_wallet)
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

)
