package com.litepayapp.app.modules.airtimeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.airtimeone.`data`.model.AirtimeOneModel
import org.koin.core.KoinComponent

class AirtimeOneVM : ViewModel(), KoinComponent {
  val airtimeOneModel: MutableLiveData<AirtimeOneModel> = MutableLiveData(AirtimeOneModel())

  var navArguments: Bundle? = null
}
