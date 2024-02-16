package com.litepayapp.app.modules.withdrawbonussix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.withdrawbonussix.`data`.model.Listservices1RowModel
import com.litepayapp.app.modules.withdrawbonussix.`data`.model.WithdrawBonusSixModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WithdrawBonusSixVM : ViewModel(), KoinComponent {
  val withdrawBonusSixModel: MutableLiveData<WithdrawBonusSixModel> =
      MutableLiveData(WithdrawBonusSixModel())

  var navArguments: Bundle? = null

  val listservicesList: MutableLiveData<MutableList<Listservices1RowModel>> =
      MutableLiveData(mutableListOf())
}
