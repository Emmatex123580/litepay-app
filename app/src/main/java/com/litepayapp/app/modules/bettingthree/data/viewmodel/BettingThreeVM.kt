package com.litepayapp.app.modules.bettingthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.bettingthree.`data`.model.BettingThreeModel
import com.litepayapp.app.modules.bettingthree.`data`.model.BettingThreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BettingThreeVM : ViewModel(), KoinComponent {
  val bettingThreeModel: MutableLiveData<BettingThreeModel> = MutableLiveData(BettingThreeModel())

  var navArguments: Bundle? = null

  val bettingThreeList: MutableLiveData<MutableList<BettingThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
