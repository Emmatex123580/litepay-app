package com.litepayapp.app.modules.referalsfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.referalsfour.`data`.model.ReferalsFourModel
import org.koin.core.KoinComponent

class ReferalsFourVM : ViewModel(), KoinComponent {
  val referalsFourModel: MutableLiveData<ReferalsFourModel> = MutableLiveData(ReferalsFourModel())

  var navArguments: Bundle? = null
}
