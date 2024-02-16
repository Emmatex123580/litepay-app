package com.litepayapp.app.modules.signuptwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.signuptwo.`data`.model.SignUpTwoModel
import com.litepayapp.app.modules.signuptwo.`data`.model.SignUpTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SignUpTwoVM : ViewModel(), KoinComponent {
  val signUpTwoModel: MutableLiveData<SignUpTwoModel> = MutableLiveData(SignUpTwoModel())

  var navArguments: Bundle? = null

  val signUpTwoList: MutableLiveData<MutableList<SignUpTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
