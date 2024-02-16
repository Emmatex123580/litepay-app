package com.litepayapp.app.modules.signupfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.signupfour.`data`.model.SignUpFourModel
import org.koin.core.KoinComponent

class SignUpFourVM : ViewModel(), KoinComponent {
  val signUpFourModel: MutableLiveData<SignUpFourModel> = MutableLiveData(SignUpFourModel())

  var navArguments: Bundle? = null
}
