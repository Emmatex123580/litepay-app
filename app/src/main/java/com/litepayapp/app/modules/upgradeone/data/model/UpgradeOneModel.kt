package com.litepayapp.app.modules.upgradeone.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class UpgradeOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDearNkky: String? = MyApp.getInstance().resources.getString(R.string.lbl_dear_nkky)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_kindly_note_tha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame626987: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame626987One: String? = MyApp.getInstance().resources.getString(R.string.lbl_yes_submit)

)
