package com.litepayapp.app.modules.notification.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLitePay: String? = MyApp.getInstance().resources.getString(R.string.lbl_litepay2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLitePayOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_litepay2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLitePayTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_litepay2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLitePayThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_litepay2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLitePayFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_litepay2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulations)
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
