package com.litepayapp.app.modules.referalsnine.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityReferalsNineBinding
import com.litepayapp.app.modules.referalsnine.`data`.viewmodel.ReferalsNineVM
import kotlin.String
import kotlin.Unit

class ReferalsNineActivity :
    BaseActivity<ActivityReferalsNineBinding>(R.layout.activity_referals_nine) {
  private val viewModel: ReferalsNineVM by viewModels<ReferalsNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.referalsNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFERALS_NINE_ACTIVITY"

  }
}
