package com.litepayapp.app.modules.selectcableone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.selectcableone.`data`.model.SelectCableOneModel
import org.koin.core.KoinComponent

class SelectCableOneVM : ViewModel(), KoinComponent {
  val selectCableOneModel: MutableLiveData<SelectCableOneModel> =
      MutableLiveData(SelectCableOneModel())

  var navArguments: Bundle? = null
}
