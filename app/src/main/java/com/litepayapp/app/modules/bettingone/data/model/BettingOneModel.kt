package com.litepayapp.app.modules.bettingone.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class BettingOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBetting: String? = MyApp.getInstance().resources.getString(R.string.lbl_betting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectAmount: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame626987: String? = MyApp.getInstance().resources.getString(R.string.lbl_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAFCON2023GROU: String? =
      MyApp.getInstance().resources.getString(R.string.msg_afcon_2023_grou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCapeVerde: String? = MyApp.getInstance().resources.getString(R.string.lbl_cape_verde)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_15_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMozambique: String? = MyApp.getInstance().resources.getString(R.string.lbl_mozambique)
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
  var etFrame627042OneValue: String? = null
)
