package com.litepayapp.app.modules.itemhomescreentwo.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemHomeScreenTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNwadikeChinaza: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nwadike_chinaza)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPricing: String? = MyApp.getInstance().resources.getString(R.string.lbl_pricing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLodgeaComplai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lodge_a_complai2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAffilliateWebs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_affilliate_webs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUpgradePackage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upgrade_package)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtimeFunding: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_airtime_funding)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)

)
