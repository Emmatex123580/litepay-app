package com.litepayapp.app.modules.dataone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.dataone.`data`.model.DataOneModel
import org.koin.core.KoinComponent

class DataOneVM : ViewModel(), KoinComponent {
  val dataOneModel: MutableLiveData<DataOneModel> = MutableLiveData(DataOneModel())

  var navArguments: Bundle? = null
}
