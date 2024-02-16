package com.litepayapp.app.modules.signinseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.signinseven.`data`.model.SignInSevenModel
import org.koin.core.KoinComponent

class SignInSevenVM : ViewModel(), KoinComponent {
  val signInSevenModel: MutableLiveData<SignInSevenModel> = MutableLiveData(SignInSevenModel())

  var navArguments: Bundle? = null
}
