package com.litepayapp.app.modules.welcomescreenthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.welcomescreenthree.`data`.model.WelcomeScreenThreeModel
import org.koin.core.KoinComponent

class WelcomeScreenThreeVM : ViewModel(), KoinComponent {
  val welcomeScreenThreeModel: MutableLiveData<WelcomeScreenThreeModel> =
      MutableLiveData(WelcomeScreenThreeModel())

  var navArguments: Bundle? = null
}
