package com.litepayapp.app.modules.datathree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.datathree.`data`.model.DataThreeModel
import com.litepayapp.app.modules.datathree.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.datathree.`data`.model.SpinnerFrame627042OneModel
import com.litepayapp.app.modules.datathree.`data`.model.SpinnerFrame627042TwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DataThreeVM : ViewModel(), KoinComponent {
  val dataThreeModel: MutableLiveData<DataThreeModel> = MutableLiveData(DataThreeModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val spinnerFrame627042OneList: MutableLiveData<MutableList<SpinnerFrame627042OneModel>> =
      MutableLiveData()

  val spinnerFrame627042TwoList: MutableLiveData<MutableList<SpinnerFrame627042TwoModel>> =
      MutableLiveData()
}
