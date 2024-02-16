package com.litepayapp.app.modules.signintwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.signintwo.`data`.model.SignInTwoModel
import org.koin.core.KoinComponent

class SignInTwoVM : ViewModel(), KoinComponent {
  val signInTwoModel: MutableLiveData<SignInTwoModel> = MutableLiveData(SignInTwoModel())

  var navArguments: Bundle? = null
}
