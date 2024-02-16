package com.litepayapp.app.modules.bettingfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.bettingfour.`data`.model.BettingFourModel
import org.koin.core.KoinComponent

class BettingFourVM : ViewModel(), KoinComponent {
  val bettingFourModel: MutableLiveData<BettingFourModel> = MutableLiveData(BettingFourModel())

  var navArguments: Bundle? = null
}
