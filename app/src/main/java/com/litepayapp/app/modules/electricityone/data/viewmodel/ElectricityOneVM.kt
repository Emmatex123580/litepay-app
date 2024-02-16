package com.litepayapp.app.modules.electricityone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.electricityone.`data`.model.ElectricityOneModel
import com.litepayapp.app.modules.electricityone.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.electricityone.`data`.model.SpinnerFrame627042OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ElectricityOneVM : ViewModel(), KoinComponent {
  val electricityOneModel: MutableLiveData<ElectricityOneModel> =
      MutableLiveData(ElectricityOneModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val spinnerFrame627042OneList: MutableLiveData<MutableList<SpinnerFrame627042OneModel>> =
      MutableLiveData()
}
