package com.litepayapp.app.modules.referalstwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.referalstwo.`data`.model.ReferalsTwoModel
import org.koin.core.KoinComponent

class ReferalsTwoVM : ViewModel(), KoinComponent {
  val referalsTwoModel: MutableLiveData<ReferalsTwoModel> = MutableLiveData(ReferalsTwoModel())

  var navArguments: Bundle? = null
}
