package com.litepayapp.app.modules.datathree.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class DataThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBuyDataBundle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_buy_data_bundle)
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
  var etFrame627042ThreeValue: String? = null
)
