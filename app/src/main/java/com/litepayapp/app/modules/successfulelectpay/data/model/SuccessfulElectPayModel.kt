package com.litepayapp.app.modules.successfulelectpay.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class SuccessfulElectPayModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPayElectricity: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pay_electricity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmpowerYourPa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_empower_your_pa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectNetwork: String? = MyApp.getInstance().resources.getString(R.string.lbl_08919687)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectNetworkOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectNetworkTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_08059715176)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_validate_meter)
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
