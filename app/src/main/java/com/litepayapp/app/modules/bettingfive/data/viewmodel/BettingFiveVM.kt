package com.litepayapp.app.modules.bettingfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.bettingfive.`data`.model.BettingFiveModel
import org.koin.core.KoinComponent

class BettingFiveVM : ViewModel(), KoinComponent {
  val bettingFiveModel: MutableLiveData<BettingFiveModel> = MutableLiveData(BettingFiveModel())

  var navArguments: Bundle? = null
}
