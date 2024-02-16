package com.litepayapp.app.modules.signinfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.signinfive.`data`.model.SignInFiveModel
import org.koin.core.KoinComponent

class SignInFiveVM : ViewModel(), KoinComponent {
  val signInFiveModel: MutableLiveData<SignInFiveModel> = MutableLiveData(SignInFiveModel())

  var navArguments: Bundle? = null
}
