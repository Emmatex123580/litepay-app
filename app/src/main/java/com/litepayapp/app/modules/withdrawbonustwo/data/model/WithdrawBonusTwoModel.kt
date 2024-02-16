package com.litepayapp.app.modules.withdrawbonustwo.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class WithdrawBonusTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLodgeComplaint: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lodge_complaint)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouwillbedir: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_will_be_dir)
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
