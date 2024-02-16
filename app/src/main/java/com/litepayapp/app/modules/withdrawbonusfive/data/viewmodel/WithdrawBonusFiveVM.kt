package com.litepayapp.app.modules.withdrawbonusfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.withdrawbonusfive.`data`.model.ListservicesRowModel
import com.litepayapp.app.modules.withdrawbonusfive.`data`.model.WithdrawBonusFiveModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WithdrawBonusFiveVM : ViewModel(), KoinComponent {
  val withdrawBonusFiveModel: MutableLiveData<WithdrawBonusFiveModel> =
      MutableLiveData(WithdrawBonusFiveModel())

  var navArguments: Bundle? = null

  val listservicesList: MutableLiveData<MutableList<ListservicesRowModel>> =
      MutableLiveData(mutableListOf())
}
