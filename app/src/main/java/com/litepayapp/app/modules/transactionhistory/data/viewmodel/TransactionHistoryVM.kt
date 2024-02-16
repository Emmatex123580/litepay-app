package com.litepayapp.app.modules.transactionhistory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.transactionhistory.`data`.model.ListairtimeRowModel
import com.litepayapp.app.modules.transactionhistory.`data`.model.TransactionHistoryModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TransactionHistoryVM : ViewModel(), KoinComponent {
  val transactionHistoryModel: MutableLiveData<TransactionHistoryModel> =
      MutableLiveData(TransactionHistoryModel())

  var navArguments: Bundle? = null

  val listairtimeList: MutableLiveData<MutableList<ListairtimeRowModel>> =
      MutableLiveData(mutableListOf())
}
