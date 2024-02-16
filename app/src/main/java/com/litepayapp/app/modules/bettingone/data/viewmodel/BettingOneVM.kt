package com.litepayapp.app.modules.bettingone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.bettingone.`data`.model.BettingOneModel
import com.litepayapp.app.modules.bettingone.`data`.model.BettingOneRowModel
import com.litepayapp.app.modules.bettingone.`data`.model.SpinnerFrame627042Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BettingOneVM : ViewModel(), KoinComponent {
  val bettingOneModel: MutableLiveData<BettingOneModel> = MutableLiveData(BettingOneModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val bettingOneList: MutableLiveData<MutableList<BettingOneRowModel>> =
      MutableLiveData(mutableListOf())
}
