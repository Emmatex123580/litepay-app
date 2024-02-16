package com.litepayapp.app.modules.withdrawbonus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.withdrawbonus.`data`.model.WithdrawBonusModel
import org.koin.core.KoinComponent

class WithdrawBonusVM : ViewModel(), KoinComponent {
  val withdrawBonusModel: MutableLiveData<WithdrawBonusModel> =
      MutableLiveData(WithdrawBonusModel())

  var navArguments: Bundle? = null
}
