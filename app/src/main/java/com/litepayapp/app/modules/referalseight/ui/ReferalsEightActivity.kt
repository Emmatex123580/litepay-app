package com.litepayapp.app.modules.referalseight.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityReferalsEightBinding
import com.litepayapp.app.modules.referalseight.`data`.viewmodel.ReferalsEightVM
import kotlin.String
import kotlin.Unit

class ReferalsEightActivity :
    BaseActivity<ActivityReferalsEightBinding>(R.layout.activity_referals_eight) {
  private val viewModel: ReferalsEightVM by viewModels<ReferalsEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.referalsEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFERALS_EIGHT_ACTIVITY"

  }
}
