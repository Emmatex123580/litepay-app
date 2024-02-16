package com.litepayapp.app.modules.signineight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.signineight.`data`.model.SignInEightModel
import org.koin.core.KoinComponent

class SignInEightVM : ViewModel(), KoinComponent {
  val signInEightModel: MutableLiveData<SignInEightModel> = MutableLiveData(SignInEightModel())

  var navArguments: Bundle? = null
}
