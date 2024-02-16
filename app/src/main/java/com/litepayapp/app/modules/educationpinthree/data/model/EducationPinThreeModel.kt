package com.litepayapp.app.modules.educationpinthree.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class EducationPinThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_result_checker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectNetwork: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectNetworkOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_n7000_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMTN: String? = MyApp.getInstance().resources.getString(R.string.lbl_generate_pin)
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
  var txtConfirmTransac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_transac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhavenotse: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_not_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame626987: String? = MyApp.getInstance().resources.getString(R.string.lbl_set_pin)

)
