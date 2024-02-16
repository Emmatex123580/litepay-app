package com.litepayapp.app.modules.notificationone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.litepayapp.app.modules.notificationone.`data`.model.NotificationOneModel
import org.koin.core.KoinComponent

class NotificationOneVM : ViewModel(), KoinComponent {
  val notificationOneModel: MutableLiveData<NotificationOneModel> =
      MutableLiveData(NotificationOneModel())

  var navArguments: Bundle? = null
}
