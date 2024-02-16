package com.litepayapp.app.modules.homescreenthree.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class Listarright2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUpgrade: String? = MyApp.getInstance().resources.getString(R.string.lbl_upgrade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUpgradetoAffi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_upgrade_to_affi)

)
