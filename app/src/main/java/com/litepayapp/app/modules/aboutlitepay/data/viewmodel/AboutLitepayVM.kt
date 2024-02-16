package com.litepayapp.app.modules.aboutlitepay.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.aboutlitepay.`data`.model.AboutLitepayModel
import org.koin.core.KoinComponent

class AboutLitepayVM : ViewModel(), KoinComponent {
  val aboutLitepayModel: MutableLiveData<AboutLitepayModel> = MutableLiveData(AboutLitepayModel())

  var navArguments: Bundle? = null
}
