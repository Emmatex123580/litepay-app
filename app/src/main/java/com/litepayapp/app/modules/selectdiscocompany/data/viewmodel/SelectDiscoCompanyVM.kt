package com.litepayapp.app.modules.selectdiscocompany.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.selectdiscocompany.`data`.model.SelectDiscoCompanyModel
import org.koin.core.KoinComponent

class SelectDiscoCompanyVM : ViewModel(), KoinComponent {
  val selectDiscoCompanyModel: MutableLiveData<SelectDiscoCompanyModel> =
      MutableLiveData(SelectDiscoCompanyModel())

  var navArguments: Bundle? = null
}
