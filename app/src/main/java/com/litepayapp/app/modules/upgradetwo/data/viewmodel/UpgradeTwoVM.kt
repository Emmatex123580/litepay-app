package com.litepayapp.app.modules.upgradetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.upgradetwo.`data`.model.UpgradeTwoModel
import com.litepayapp.app.modules.upgradetwo.`data`.model.UpgradeTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class UpgradeTwoVM : ViewModel(), KoinComponent {
  val upgradeTwoModel: MutableLiveData<UpgradeTwoModel> = MutableLiveData(UpgradeTwoModel())

  var navArguments: Bundle? = null

  val upgradeTwoList: MutableLiveData<MutableList<UpgradeTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
