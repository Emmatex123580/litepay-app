package com.litepayapp.app.modules.upgradethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.upgradethree.`data`.model.UpgradeThreeModel
import com.litepayapp.app.modules.upgradethree.`data`.model.UpgradeThreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class UpgradeThreeVM : ViewModel(), KoinComponent {
  val upgradeThreeModel: MutableLiveData<UpgradeThreeModel> = MutableLiveData(UpgradeThreeModel())

  var navArguments: Bundle? = null

  val upgradeThreeList: MutableLiveData<MutableList<UpgradeThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
