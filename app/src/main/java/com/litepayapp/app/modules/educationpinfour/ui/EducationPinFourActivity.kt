package com.litepayapp.app.modules.educationpinfour.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityEducationPinFourBinding
import com.litepayapp.app.modules.educationpinfour.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.educationpinfour.`data`.viewmodel.EducationPinFourVM
import kotlin.String
import kotlin.Unit

class EducationPinFourActivity :
    BaseActivity<ActivityEducationPinFourBinding>(R.layout.activity_education_pin_four) {
  private val viewModel: EducationPinFourVM by viewModels<EducationPinFourVM>()

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
    binding.educationPinFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDUCATION_PIN_FOUR_ACTIVITY"

  }
}
