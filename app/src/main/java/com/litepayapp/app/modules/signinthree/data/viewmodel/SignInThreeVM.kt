package com.litepayapp.app.modules.signinthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.signinthree.`data`.model.SignInThreeModel
import org.koin.core.KoinComponent

class SignInThreeVM : ViewModel(), KoinComponent {
  val signInThreeModel: MutableLiveData<SignInThreeModel> = MutableLiveData(SignInThreeModel())

  var navArguments: Bundle? = null
}
