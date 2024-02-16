package com.litepayapp.app.modules.signinfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.signinfour.`data`.model.SignInFourModel
import org.koin.core.KoinComponent

class SignInFourVM : ViewModel(), KoinComponent {
  val signInFourModel: MutableLiveData<SignInFourModel> = MutableLiveData(SignInFourModel())

  var navArguments: Bundle? = null
}
