package com.litepayapp.app.modules.referalsfive.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityReferalsFiveBinding
import com.litepayapp.app.modules.referalsfive.`data`.model.SpinnerFrame627042OneModel
import com.litepayapp.app.modules.referalsfive.`data`.viewmodel.ReferalsFiveVM
import kotlin.String
import kotlin.Unit

class ReferalsFiveActivity :
    BaseActivity<ActivityReferalsFiveBinding>(R.layout.activity_referals_five) {
  private val viewModel: ReferalsFiveVM by viewModels<ReferalsFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFrame627042OneList.value = mutableListOf(
    SpinnerFrame627042OneModel("Item1"),
    SpinnerFrame627042OneModel("Item2"),
    SpinnerFrame627042OneModel("Item3"),
    SpinnerFrame627042OneModel("Item4"),
    SpinnerFrame627042OneModel("Item5")
    )
    val spinnerFrame627042OneAdapter =
    SpinnerFrame627042OneAdapter(this,R.layout.spinner_item,viewModel.spinnerFrame627042OneList.value?:
    mutableListOf())
    binding.spinnerFrame627042One.adapter = spinnerFrame627042OneAdapter
    binding.referalsFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFERALS_FIVE_ACTIVITY"

  }
}
