package com.litepayapp.app.modules.referalsfive.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class ReferalsFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKYC: String? = MyApp.getInstance().resources.getString(R.string.lbl_kyc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectPassport: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_passport)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_max_size_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame627042Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame627196Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame627197Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame627198Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame627199Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame627200Value: String? = null
)
