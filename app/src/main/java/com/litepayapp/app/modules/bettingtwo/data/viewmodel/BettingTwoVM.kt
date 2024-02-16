package com.litepayapp.app.modules.bettingtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.bettingtwo.`data`.model.BettingTwoModel
import com.litepayapp.app.modules.bettingtwo.`data`.model.BettingTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BettingTwoVM : ViewModel(), KoinComponent {
  val bettingTwoModel: MutableLiveData<BettingTwoModel> = MutableLiveData(BettingTwoModel())

  var navArguments: Bundle? = null

  val bettingTwoList: MutableLiveData<MutableList<BettingTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
