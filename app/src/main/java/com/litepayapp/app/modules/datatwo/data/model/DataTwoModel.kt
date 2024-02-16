package com.litepayapp.app.modules.datatwo.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class DataTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBuyDataBundle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_buy_data_bundle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectNetworkOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBypassnumberv: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bypass_number_v)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_buy_data)
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
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_500_0mb_n140)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.msg_1_0gb_n270_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_2_0gb_n540_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_3_0gb_n810_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationFour: String? = MyApp.getInstance().resources.getString(R.string.msg_5_0gb_n1350_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationFive: String? = MyApp.getInstance().resources.getString(R.string.msg_10_0gb_n2700)

)
