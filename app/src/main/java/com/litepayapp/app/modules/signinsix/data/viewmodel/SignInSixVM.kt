package com.litepayapp.app.modules.signinsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.signinsix.`data`.model.SignInSixModel
import org.koin.core.KoinComponent

class SignInSixVM : ViewModel(), KoinComponent {
  val signInSixModel: MutableLiveData<SignInSixModel> = MutableLiveData(SignInSixModel())

  var navArguments: Bundle? = null
}
