package com.litepayapp.app.modules.withdrawbonusthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.withdrawbonusthree.`data`.model.WithdrawBonusThreeModel
import org.koin.core.KoinComponent

class WithdrawBonusThreeVM : ViewModel(), KoinComponent {
  val withdrawBonusThreeModel: MutableLiveData<WithdrawBonusThreeModel> =
      MutableLiveData(WithdrawBonusThreeModel())

  var navArguments: Bundle? = null
}
