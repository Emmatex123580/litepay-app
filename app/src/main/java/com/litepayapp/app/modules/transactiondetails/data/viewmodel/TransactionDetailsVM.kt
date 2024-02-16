package com.litepayapp.app.modules.transactiondetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.transactiondetails.`data`.model.TransactionDetailsModel
import org.koin.core.KoinComponent

class TransactionDetailsVM : ViewModel(), KoinComponent {
  val transactionDetailsModel: MutableLiveData<TransactionDetailsModel> =
      MutableLiveData(TransactionDetailsModel())

  var navArguments: Bundle? = null
}
