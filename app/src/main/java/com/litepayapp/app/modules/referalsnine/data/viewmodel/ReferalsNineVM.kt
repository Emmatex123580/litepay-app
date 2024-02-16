package com.litepayapp.app.modules.referalsnine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.referalsnine.`data`.model.ReferalsNineModel
import org.koin.core.KoinComponent

class ReferalsNineVM : ViewModel(), KoinComponent {
  val referalsNineModel: MutableLiveData<ReferalsNineModel> = MutableLiveData(ReferalsNineModel())

  var navArguments: Bundle? = null
}
