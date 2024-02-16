package com.litepayapp.app.modules.withdrawbonusseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.withdrawbonusseven.`data`.model.WithdrawBonusSevenModel
import org.koin.core.KoinComponent

class WithdrawBonusSevenVM : ViewModel(), KoinComponent {
  val withdrawBonusSevenModel: MutableLiveData<WithdrawBonusSevenModel> =
      MutableLiveData(WithdrawBonusSevenModel())

  var navArguments: Bundle? = null
}
