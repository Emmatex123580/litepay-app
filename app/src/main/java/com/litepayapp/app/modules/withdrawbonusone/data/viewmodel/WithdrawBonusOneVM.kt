package com.litepayapp.app.modules.withdrawbonusone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.withdrawbonusone.`data`.model.WithdrawBonusOneModel
import org.koin.core.KoinComponent

class WithdrawBonusOneVM : ViewModel(), KoinComponent {
  val withdrawBonusOneModel: MutableLiveData<WithdrawBonusOneModel> =
      MutableLiveData(WithdrawBonusOneModel())

  var navArguments: Bundle? = null
}
