package com.litepayapp.app.modules.educationpinsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.educationpinsix.`data`.model.EducationPinSixModel
import com.litepayapp.app.modules.educationpinsix.`data`.model.Listframe627146RowModel
import com.litepayapp.app.modules.educationpinsix.`data`.model.SpinnerFrame627042Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EducationPinSixVM : ViewModel(), KoinComponent {
  val educationPinSixModel: MutableLiveData<EducationPinSixModel> =
      MutableLiveData(EducationPinSixModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val listframe627146List: MutableLiveData<MutableList<Listframe627146RowModel>> =
      MutableLiveData(mutableListOf())
}
