package com.litepayapp.app.modules.referalsten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.referalsten.`data`.model.ReferalsTenModel
import org.koin.core.KoinComponent

class ReferalsTenVM : ViewModel(), KoinComponent {
  val referalsTenModel: MutableLiveData<ReferalsTenModel> = MutableLiveData(ReferalsTenModel())

  var navArguments: Bundle? = null
}
