package com.litepayapp.app.modules.selectdiscocompany.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class SelectDiscoCompanyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectric: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ikeja_electric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectricOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_eko_electric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectricTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_abuja_electric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectricThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enugu_electric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectricFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kano_electric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectricFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_portharcourt_el)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectricSix: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ibadan_electric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectricSeven: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_benin_electric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectricEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kaduna_electric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectricNine: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_yola_electric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkejaElectricTen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jos_electric)
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
