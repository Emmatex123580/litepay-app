package com.litepayapp.app.modules.successfulelectpay.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySuccessfulElectPayBinding
import com.litepayapp.app.modules.successfulelectpay.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.successfulelectpay.`data`.model.SpinnerFrame627042OneModel
import com.litepayapp.app.modules.successfulelectpay.`data`.viewmodel.SuccessfulElectPayVM
import kotlin.String
import kotlin.Unit

class SuccessfulElectPayActivity :
    BaseActivity<ActivitySuccessfulElectPayBinding>(R.layout.activity_successful_elect_pay) {
  private val viewModel: SuccessfulElectPayVM by viewModels<SuccessfulElectPayVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFrame627042List.value = mutableListOf(
    SpinnerFrame627042Model("Item1"),
    SpinnerFrame627042Model("Item2"),
    SpinnerFrame627042Model("Item3"),
    SpinnerFrame627042Model("Item4"),
    SpinnerFrame627042Model("Item5")
    )
    val spinnerFrame627042Adapter =
    SpinnerFrame627042Adapter(this,R.layout.spinner_item,viewModel.spinnerFrame627042List.value?:
    mutableListOf())
    binding.spinnerFrame627042.adapter = spinnerFrame627042Adapter
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
    binding.successfulElectPayVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUCCESSFUL_ELECT_PAY_ACTIVITY"

  }
}
