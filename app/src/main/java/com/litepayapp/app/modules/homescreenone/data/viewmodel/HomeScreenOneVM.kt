package com.litepayapp.app.modules.homescreenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.homescreenone.`data`.model.HomeScreenOneModel
import com.litepayapp.app.modules.homescreenone.`data`.model.ListarrightRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeScreenOneVM : ViewModel(), KoinComponent {
  val homeScreenOneModel: MutableLiveData<HomeScreenOneModel> =
      MutableLiveData(HomeScreenOneModel())

  var navArguments: Bundle? = null

  val listarrowrightList: MutableLiveData<MutableList<ListarrightRowModel>> =
      MutableLiveData(mutableListOf())
}
