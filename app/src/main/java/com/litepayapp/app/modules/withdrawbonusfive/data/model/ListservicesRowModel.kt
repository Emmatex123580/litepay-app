package com.litepayapp.app.modules.withdrawbonusfive.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListservicesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtServices: String? = MyApp.getInstance().resources.getString(R.string.lbl_services)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmartEarner: String? = MyApp.getInstance().resources.getString(R.string.lbl_smart_earner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAffilliate: String? = MyApp.getInstance().resources.getString(R.string.lbl_affilliate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_topuser)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAPIUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_api_user)

)
