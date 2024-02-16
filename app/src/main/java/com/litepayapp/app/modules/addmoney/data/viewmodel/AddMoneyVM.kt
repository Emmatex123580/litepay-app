package com.litepayapp.app.modules.addmoney.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.addmoney.`data`.model.AddMoneyModel
import org.koin.core.KoinComponent

class AddMoneyVM : ViewModel(), KoinComponent {
  val addMoneyModel: MutableLiveData<AddMoneyModel> = MutableLiveData(AddMoneyModel())

  var navArguments: Bundle? = null
}
