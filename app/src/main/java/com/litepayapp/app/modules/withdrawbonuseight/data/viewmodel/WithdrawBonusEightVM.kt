package com.litepayapp.app.modules.withdrawbonuseight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.withdrawbonuseight.`data`.model.WithdrawBonusEightModel
import org.koin.core.KoinComponent

class WithdrawBonusEightVM : ViewModel(), KoinComponent {
  val withdrawBonusEightModel: MutableLiveData<WithdrawBonusEightModel> =
      MutableLiveData(WithdrawBonusEightModel())

  var navArguments: Bundle? = null
}
