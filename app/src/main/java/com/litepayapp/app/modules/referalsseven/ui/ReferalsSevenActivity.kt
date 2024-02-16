package com.litepayapp.app.modules.referalsseven.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityReferalsSevenBinding
import com.litepayapp.app.modules.referalsseven.`data`.viewmodel.ReferalsSevenVM
import kotlin.String
import kotlin.Unit

class ReferalsSevenActivity :
    BaseActivity<ActivityReferalsSevenBinding>(R.layout.activity_referals_seven) {
  private val viewModel: ReferalsSevenVM by viewModels<ReferalsSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.referalsSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFERALS_SEVEN_ACTIVITY"

  }
}
