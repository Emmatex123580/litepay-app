package com.litepayapp.app.modules.contactuspage.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class ContactUsPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourmessageha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_message_ha)

)
