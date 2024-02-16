package com.litepayapp.app.modules.educationpintwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.educationpintwo.`data`.model.EducationPinTwoModel
import com.litepayapp.app.modules.educationpintwo.`data`.model.SpinnerFrame627042Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EducationPinTwoVM : ViewModel(), KoinComponent {
  val educationPinTwoModel: MutableLiveData<EducationPinTwoModel> =
      MutableLiveData(EducationPinTwoModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()
}
