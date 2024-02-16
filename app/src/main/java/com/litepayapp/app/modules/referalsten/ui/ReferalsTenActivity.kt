package com.litepayapp.app.modules.referalsten.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityReferalsTenBinding
import com.litepayapp.app.modules.referalsten.`data`.viewmodel.ReferalsTenVM
import kotlin.String
import kotlin.Unit

class ReferalsTenActivity : BaseActivity<ActivityReferalsTenBinding>(R.layout.activity_referals_ten)
    {
  private val viewModel: ReferalsTenVM by viewModels<ReferalsTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.referalsTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFERALS_TEN_ACTIVITY"

  }
}
