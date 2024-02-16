package com.litepayapp.app.modules.educationpinthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.educationpinthree.`data`.model.EducationPinThreeModel
import com.litepayapp.app.modules.educationpinthree.`data`.model.ListenterpinRowModel
import com.litepayapp.app.modules.educationpinthree.`data`.model.SpinnerFrame627042Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EducationPinThreeVM : ViewModel(), KoinComponent {
  val educationPinThreeModel: MutableLiveData<EducationPinThreeModel> =
      MutableLiveData(EducationPinThreeModel())

  var navArguments: Bundle? = null

  val spinnerFrame627042List: MutableLiveData<MutableList<SpinnerFrame627042Model>> =
      MutableLiveData()

  val listenterpinList: MutableLiveData<MutableList<ListenterpinRowModel>> =
      MutableLiveData(mutableListOf())
}
