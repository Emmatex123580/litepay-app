package com.litepayapp.app.modules.notificationone.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityNotificationOneBinding
import com.litepayapp.app.modules.notificationone.`data`.viewmodel.NotificationOneVM
import kotlin.String
import kotlin.Unit

class NotificationOneActivity :
    BaseActivity<ActivityNotificationOneBinding>(R.layout.activity_notification_one) {
  private val viewModel: NotificationOneVM by viewModels<NotificationOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_ONE_ACTIVITY"

  }
}
