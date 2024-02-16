package com.litepayapp.app.modules.successfulelectpay.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.successfulelectpay.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.successfulelectpay.`data`.model.SpinnerFrame627042OneModel
import com.litepayapp.app.modules.successfulelectpay.`data`.model.SuccessfulElectPayModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SuccessfulElectPayVM : ViewModel(), KoinComponent {
  val successfulElectPayModel: MutableLiveData<SuccessfulElectPayModel> =
      MutableLiveData(SuccessfulElectPayModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val spinnerFrame627042OneList: MutableLiveData<MutableList<SpinnerFrame627042OneModel>> =
      MutableLiveData()
}
