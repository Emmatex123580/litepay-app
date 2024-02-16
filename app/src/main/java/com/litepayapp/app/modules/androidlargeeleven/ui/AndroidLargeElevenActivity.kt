package com.litepayapp.app.modules.androidlargeeleven.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityAndroidLargeElevenBinding
import com.litepayapp.app.modules.androidlargeeleven.`data`.viewmodel.AndroidLargeElevenVM
import kotlin.String
import kotlin.Unit

class AndroidLargeElevenActivity :
    BaseActivity<ActivityAndroidLargeElevenBinding>(R.layout.activity_android_large_eleven) {
  private val viewModel: AndroidLargeElevenVM by viewModels<AndroidLargeElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_ELEVEN_ACTIVITY"

  }
}
