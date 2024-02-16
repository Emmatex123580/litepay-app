package com.litepayapp.app.modules.referalssix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.referalssix.`data`.model.ReferalsSixModel
import com.litepayapp.app.modules.referalssix.`data`.model.SpinnerFrame627042OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReferalsSixVM : ViewModel(), KoinComponent {
  val referalsSixModel: MutableLiveData<ReferalsSixModel> = MutableLiveData(ReferalsSixModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042OneList: MutableLiveData<MutableList<SpinnerFrame627042OneModel>> =
      MutableLiveData()
}
