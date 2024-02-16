package com.litepayapp.app.modules.contactuspage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.contactuspage.`data`.model.ContactUsPageModel
import org.koin.core.KoinComponent

class ContactUsPageVM : ViewModel(), KoinComponent {
  val contactUsPageModel: MutableLiveData<ContactUsPageModel> =
      MutableLiveData(ContactUsPageModel())

  var navArguments: Bundle? = null
}
