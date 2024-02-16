package com.litepayapp.app.modules.withdrawbonusfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.withdrawbonusfour.`data`.model.Listframe627148RowModel
import com.litepayapp.app.modules.withdrawbonusfour.`data`.model.WithdrawBonusFourModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WithdrawBonusFourVM : ViewModel(), KoinComponent {
  val withdrawBonusFourModel: MutableLiveData<WithdrawBonusFourModel> =
      MutableLiveData(WithdrawBonusFourModel())

  var navArguments: Bundle? = null

  val listframe627146List: MutableLiveData<MutableList<Listframe627148RowModel>> =
      MutableLiveData(mutableListOf())
}
