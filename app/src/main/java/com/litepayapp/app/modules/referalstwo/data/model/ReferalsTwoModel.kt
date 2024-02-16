package com.litepayapp.app.modules.referalstwo.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class ReferalsTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReferals: String? = MyApp.getInstance().resources.getString(R.string.lbl_referals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLitePayReferal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_litepay_referal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_refer_people_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHttpswwwLite: String? =
      MyApp.getInstance().resources.getString(R.string.msg_https_www_lite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_referals2)
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
