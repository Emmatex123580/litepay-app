package com.litepayapp.app.modules.aboutlitepay.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityAboutLitepayBinding
import com.litepayapp.app.modules.aboutlitepay.`data`.viewmodel.AboutLitepayVM
import kotlin.String
import kotlin.Unit

class AboutLitepayActivity :
    BaseActivity<ActivityAboutLitepayBinding>(R.layout.activity_about_litepay) {
  private val viewModel: AboutLitepayVM by viewModels<AboutLitepayVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aboutLitepayVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ABOUT_LITEPAY_ACTIVITY"

  }
}
