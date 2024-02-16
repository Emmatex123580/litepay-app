package com.litepayapp.app.modules.referalsthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.referalsthree.`data`.model.ReferalsThreeModel
import org.koin.core.KoinComponent

class ReferalsThreeVM : ViewModel(), KoinComponent {
  val referalsThreeModel: MutableLiveData<ReferalsThreeModel> =
      MutableLiveData(ReferalsThreeModel())

  var navArguments: Bundle? = null
}
