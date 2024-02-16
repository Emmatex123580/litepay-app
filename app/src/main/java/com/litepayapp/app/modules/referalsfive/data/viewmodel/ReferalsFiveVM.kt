package com.litepayapp.app.modules.referalsfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.referalsfive.`data`.model.ReferalsFiveModel
import com.litepayapp.app.modules.referalsfive.`data`.model.SpinnerFrame627042OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReferalsFiveVM : ViewModel(), KoinComponent {
  val referalsFiveModel: MutableLiveData<ReferalsFiveModel> = MutableLiveData(ReferalsFiveModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042OneList: MutableLiveData<MutableList<SpinnerFrame627042OneModel>> =
      MutableLiveData()
}
