package com.litepayapp.app.modules.educationpin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.educationpin.`data`.model.EducationPinModel
import com.litepayapp.app.modules.educationpin.`data`.model.EducationPinRowModel
import com.litepayapp.app.modules.educationpin.`data`.model.SpinnerFrame627042Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EducationPinVM : ViewModel(), KoinComponent {
  val educationPinModel: MutableLiveData<EducationPinModel> = MutableLiveData(EducationPinModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val educationPinList: MutableLiveData<MutableList<EducationPinRowModel>> =
      MutableLiveData(mutableListOf())
}
