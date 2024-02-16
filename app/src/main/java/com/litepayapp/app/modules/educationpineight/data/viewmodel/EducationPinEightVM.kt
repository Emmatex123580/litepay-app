package com.litepayapp.app.modules.educationpineight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.educationpineight.`data`.model.EducationPinEightModel
import com.litepayapp.app.modules.educationpineight.`data`.model.SpinnerFrame627042Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EducationPinEightVM : ViewModel(), KoinComponent {
  val educationPinEightModel: MutableLiveData<EducationPinEightModel> =
      MutableLiveData(EducationPinEightModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()
}
