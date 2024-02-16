package com.litepayapp.app.modules.selectcable.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class SelectCableModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame627082: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gotv_smallie_mo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame627083One: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gotv_jinja_n2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame627084: String? = MyApp.getInstance().resources.getString(R.string.msg_gotv_jolli_n3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_gotv_max_n570)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame627086: String? = MyApp.getInstance().resources.getString(R.string.msg_gotv_supa_mon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame627087: String? = MyApp.getInstance().resources.getString(R.string.msg_gotv_smallie2)
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
  var etFrame627082OneValue: String? = null
)
