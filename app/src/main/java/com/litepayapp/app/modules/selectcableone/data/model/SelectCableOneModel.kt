package com.litepayapp.app.modules.selectcableone.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class SelectCableOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectcablepr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_cable_pr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMTN: String? = MyApp.getInstance().resources.getString(R.string.lbl_gotv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMTNOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_startimes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMTNTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_dstv)

)
