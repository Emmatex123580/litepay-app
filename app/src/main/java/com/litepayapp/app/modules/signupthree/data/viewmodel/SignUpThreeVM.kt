package com.litepayapp.app.modules.signupthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.signupthree.`data`.model.SignUpThreeModel
import com.litepayapp.app.modules.signupthree.`data`.model.SignUpThreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SignUpThreeVM : ViewModel(), KoinComponent {
  val signUpThreeModel: MutableLiveData<SignUpThreeModel> = MutableLiveData(SignUpThreeModel())

  var navArguments: Bundle? = null

  val signUpThreeList: MutableLiveData<MutableList<SignUpThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
