package com.litepayapp.app.modules.betting.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.betting.`data`.model.BettingModel
import com.litepayapp.app.modules.betting.`data`.model.BettingRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BettingVM : ViewModel(), KoinComponent {
  val bettingModel: MutableLiveData<BettingModel> = MutableLiveData(BettingModel())

  var navArguments: Bundle? = null

  val bettingList: MutableLiveData<MutableList<BettingRowModel>> = MutableLiveData(mutableListOf())
}
