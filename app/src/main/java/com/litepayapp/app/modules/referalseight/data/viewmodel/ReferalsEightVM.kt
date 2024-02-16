package com.litepayapp.app.modules.referalseight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.referalseight.`data`.model.ReferalsEightModel
import org.koin.core.KoinComponent

class ReferalsEightVM : ViewModel(), KoinComponent {
  val referalsEightModel: MutableLiveData<ReferalsEightModel> =
      MutableLiveData(ReferalsEightModel())

  var navArguments: Bundle? = null
}
