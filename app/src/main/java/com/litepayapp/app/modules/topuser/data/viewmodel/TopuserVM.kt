package com.litepayapp.app.modules.topuser.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.topuser.`data`.model.TopuserModel
import org.koin.core.KoinComponent

class TopuserVM : ViewModel(), KoinComponent {
  val topuserModel: MutableLiveData<TopuserModel> = MutableLiveData(TopuserModel())

  var navArguments: Bundle? = null
}
