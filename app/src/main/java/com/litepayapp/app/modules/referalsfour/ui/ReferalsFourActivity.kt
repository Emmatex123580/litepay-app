package com.litepayapp.app.modules.referalsfour.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityReferalsFourBinding
import com.litepayapp.app.modules.referalsfour.`data`.viewmodel.ReferalsFourVM
import kotlin.String
import kotlin.Unit

class ReferalsFourActivity :
    BaseActivity<ActivityReferalsFourBinding>(R.layout.activity_referals_four) {
  private val viewModel: ReferalsFourVM by viewModels<ReferalsFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.referalsFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFERALS_FOUR_ACTIVITY"

  }
}
