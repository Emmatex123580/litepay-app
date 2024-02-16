package com.litepayapp.app.modules.upgradeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.upgradeone.`data`.model.UpgradeOneModel
import org.koin.core.KoinComponent

class UpgradeOneVM : ViewModel(), KoinComponent {
  val upgradeOneModel: MutableLiveData<UpgradeOneModel> = MutableLiveData(UpgradeOneModel())

  var navArguments: Bundle? = null
}
