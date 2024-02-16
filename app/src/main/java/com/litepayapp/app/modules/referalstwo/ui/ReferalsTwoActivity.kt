package com.litepayapp.app.modules.referalstwo.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityReferalsTwoBinding
import com.litepayapp.app.modules.referalstwo.`data`.viewmodel.ReferalsTwoVM
import kotlin.String
import kotlin.Unit

class ReferalsTwoActivity : BaseActivity<ActivityReferalsTwoBinding>(R.layout.activity_referals_two)
    {
  private val viewModel: ReferalsTwoVM by viewModels<ReferalsTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.referalsTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFERALS_TWO_ACTIVITY"

  }
}
