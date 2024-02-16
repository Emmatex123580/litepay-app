package com.litepayapp.app.modules.educationpinfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.educationpinfive.`data`.model.EducationPinFiveModel
import com.litepayapp.app.modules.educationpinfive.`data`.model.SpinnerFrame627042Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EducationPinFiveVM : ViewModel(), KoinComponent {
  val educationPinFiveModel: MutableLiveData<EducationPinFiveModel> =
      MutableLiveData(EducationPinFiveModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()
}
