package com.litepayapp.app.modules.referalsthree.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityReferalsThreeBinding
import com.litepayapp.app.modules.referalsthree.`data`.viewmodel.ReferalsThreeVM
import kotlin.String
import kotlin.Unit

class ReferalsThreeActivity :
    BaseActivity<ActivityReferalsThreeBinding>(R.layout.activity_referals_three) {
  private val viewModel: ReferalsThreeVM by viewModels<ReferalsThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.referalsThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFERALS_THREE_ACTIVITY"

  }
}
