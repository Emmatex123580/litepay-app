package com.litepayapp.app.modules.referalsseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.referalsseven.`data`.model.ReferalsSevenModel
import org.koin.core.KoinComponent

class ReferalsSevenVM : ViewModel(), KoinComponent {
  val referalsSevenModel: MutableLiveData<ReferalsSevenModel> =
      MutableLiveData(ReferalsSevenModel())

  var navArguments: Bundle? = null
}
