package com.litepayapp.app.modules.walletsummary.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.walletsummary.`data`.model.Listarright1RowModel
import com.litepayapp.app.modules.walletsummary.`data`.model.ListbiphoneRowModel
import com.litepayapp.app.modules.walletsummary.`data`.model.WalletSummaryModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WalletSummaryVM : ViewModel(), KoinComponent {
  val walletSummaryModel: MutableLiveData<WalletSummaryModel> =
      MutableLiveData(WalletSummaryModel())

  var navArguments: Bundle? = null

  val listbiphoneList: MutableLiveData<MutableList<ListbiphoneRowModel>> =
      MutableLiveData(mutableListOf())

  val listarrowrightList: MutableLiveData<MutableList<Listarright1RowModel>> =
      MutableLiveData(mutableListOf())
}
