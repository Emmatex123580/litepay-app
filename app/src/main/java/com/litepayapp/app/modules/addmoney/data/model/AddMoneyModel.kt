package com.litepayapp.app.modules.addmoney.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class AddMoneyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectPayment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_payment)

)
