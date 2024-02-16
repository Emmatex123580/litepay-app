package com.litepayapp.app.modules.welcomescreentwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.welcomescreentwo.`data`.model.WelcomeScreenTwoModel
import org.koin.core.KoinComponent

class WelcomeScreenTwoVM : ViewModel(), KoinComponent {
  val welcomeScreenTwoModel: MutableLiveData<WelcomeScreenTwoModel> =
      MutableLiveData(WelcomeScreenTwoModel())

  var navArguments: Bundle? = null
}
