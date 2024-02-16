package com.litepayapp.app.modules.selectcable.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.selectcable.`data`.model.SelectCableModel
import org.koin.core.KoinComponent

class SelectCableVM : ViewModel(), KoinComponent {
  val selectCableModel: MutableLiveData<SelectCableModel> = MutableLiveData(SelectCableModel())

  var navArguments: Bundle? = null
}
