package com.litepayapp.app.modules.airtime.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.airtime.`data`.model.AirtimeModel
import com.litepayapp.app.modules.airtime.`data`.model.SpinnerFrame627042FourModel
import com.litepayapp.app.modules.airtime.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.airtime.`data`.model.SpinnerFrame627042OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AirtimeVM : ViewModel(), KoinComponent {
  val airtimeModel: MutableLiveData<AirtimeModel> = MutableLiveData(AirtimeModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val spinnerFrame627042OneList: MutableLiveData<MutableList<SpinnerFrame627042OneModel>> =
      MutableLiveData()

  val spinnerFrame627042FourList: MutableLiveData<MutableList<SpinnerFrame627042FourModel>> =
      MutableLiveData()
}
