package com.litepayapp.app.modules.contactuspageone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.contactuspageone.`data`.model.ContactUsPageOneModel
import org.koin.core.KoinComponent

class ContactUsPageOneVM : ViewModel(), KoinComponent {
  val contactUsPageOneModel: MutableLiveData<ContactUsPageOneModel> =
      MutableLiveData(ContactUsPageOneModel())

  var navArguments: Bundle? = null
}
