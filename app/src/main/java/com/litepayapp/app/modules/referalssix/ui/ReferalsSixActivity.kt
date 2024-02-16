package com.litepayapp.app.modules.referalssix.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityReferalsSixBinding
import com.litepayapp.app.modules.referalssix.`data`.model.SpinnerFrame627042OneModel
import com.litepayapp.app.modules.referalssix.`data`.viewmodel.ReferalsSixVM
import kotlin.String
import kotlin.Unit

class ReferalsSixActivity : BaseActivity<ActivityReferalsSixBinding>(R.layout.activity_referals_six)
    {
  private val viewModel: ReferalsSixVM by viewModels<ReferalsSixVM>()

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
    binding.referalsSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFERALS_SIX_ACTIVITY"

  }
}
