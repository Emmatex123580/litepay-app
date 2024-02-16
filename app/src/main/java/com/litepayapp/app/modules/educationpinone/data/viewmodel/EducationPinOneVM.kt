package com.litepayapp.app.modules.educationpinone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.educationpinone.`data`.model.EducationPinOneModel
import com.litepayapp.app.modules.educationpinone.`data`.model.SpinnerFrame627042Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EducationPinOneVM : ViewModel(), KoinComponent {
  val educationPinOneModel: MutableLiveData<EducationPinOneModel> =
      MutableLiveData(EducationPinOneModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()
}
