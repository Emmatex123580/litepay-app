package com.litepayapp.app.modules.cablepay.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.cablepay.`data`.model.CablePayModel
import com.litepayapp.app.modules.cablepay.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.cablepay.`data`.model.SpinnerFrame627042OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CablePayVM : ViewModel(), KoinComponent {
  val cablePayModel: MutableLiveData<CablePayModel> = MutableLiveData(CablePayModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val spinnerFrame627042OneList: MutableLiveData<MutableList<SpinnerFrame627042OneModel>> =
      MutableLiveData()
}
