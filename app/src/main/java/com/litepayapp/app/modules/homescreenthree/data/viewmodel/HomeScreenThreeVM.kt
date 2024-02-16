package com.litepayapp.app.modules.homescreenthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.homescreenthree.`data`.model.HomeScreenThreeModel
import com.litepayapp.app.modules.homescreenthree.`data`.model.Listarright2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeScreenThreeVM : ViewModel(), KoinComponent {
  val homeScreenThreeModel: MutableLiveData<HomeScreenThreeModel> =
      MutableLiveData(HomeScreenThreeModel())

  var navArguments: Bundle? = null

  val listarrowrightList: MutableLiveData<MutableList<Listarright2RowModel>> =
      MutableLiveData(mutableListOf())
}
