package com.litepayapp.app.modules.referals.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.referals.`data`.model.ReferalsModel
import org.koin.core.KoinComponent

class ReferalsVM : ViewModel(), KoinComponent {
  val referalsModel: MutableLiveData<ReferalsModel> = MutableLiveData(ReferalsModel())

  var navArguments: Bundle? = null
}
