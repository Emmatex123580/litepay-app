package com.litepayapp.app.modules.educationpinfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.educationpinfour.`data`.model.EducationPinFourModel
import com.litepayapp.app.modules.educationpinfour.`data`.model.SpinnerFrame627042Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EducationPinFourVM : ViewModel(), KoinComponent {
  val educationPinFourModel: MutableLiveData<EducationPinFourModel> =
      MutableLiveData(EducationPinFourModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()
}
