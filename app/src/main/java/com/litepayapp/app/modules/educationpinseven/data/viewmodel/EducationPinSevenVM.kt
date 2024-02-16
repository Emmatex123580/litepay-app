package com.litepayapp.app.modules.educationpinseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.educationpinseven.`data`.model.EducationPinSevenModel
import com.litepayapp.app.modules.educationpinseven.`data`.model.Listframe627147RowModel
import com.litepayapp.app.modules.educationpinseven.`data`.model.SpinnerFrame627042Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EducationPinSevenVM : ViewModel(), KoinComponent {
  val educationPinSevenModel: MutableLiveData<EducationPinSevenModel> =
      MutableLiveData(EducationPinSevenModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val listframe627146List: MutableLiveData<MutableList<Listframe627147RowModel>> =
      MutableLiveData(mutableListOf())
}
