package com.litepayapp.app.modules.`data`.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.`data`.`data`.model.DataModel
import com.litepayapp.app.modules.`data`.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.`data`.`data`.model.SpinnerFrame627042OneModel
import com.litepayapp.app.modules.`data`.`data`.model.SpinnerFrame627042TwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DataVM : ViewModel(), KoinComponent {
  val dataModel: MutableLiveData<DataModel> = MutableLiveData(DataModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val spinnerFrame627042OneList: MutableLiveData<MutableList<SpinnerFrame627042OneModel>> =
      MutableLiveData()

  val spinnerFrame627042TwoList: MutableLiveData<MutableList<SpinnerFrame627042TwoModel>> =
      MutableLiveData()
}
