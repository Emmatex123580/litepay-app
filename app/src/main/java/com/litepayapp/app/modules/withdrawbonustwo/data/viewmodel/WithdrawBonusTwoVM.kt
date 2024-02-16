package com.litepayapp.app.modules.withdrawbonustwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.withdrawbonustwo.`data`.model.WithdrawBonusTwoModel
import org.koin.core.KoinComponent

class WithdrawBonusTwoVM : ViewModel(), KoinComponent {
  val withdrawBonusTwoModel: MutableLiveData<WithdrawBonusTwoModel> =
      MutableLiveData(WithdrawBonusTwoModel())

  var navArguments: Bundle? = null
}
