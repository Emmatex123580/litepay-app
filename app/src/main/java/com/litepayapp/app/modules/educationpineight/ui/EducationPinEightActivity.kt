package com.litepayapp.app.modules.educationpineight.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityEducationPinEightBinding
import com.litepayapp.app.modules.educationpineight.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.educationpineight.`data`.viewmodel.EducationPinEightVM
import kotlin.String
import kotlin.Unit

class EducationPinEightActivity :
    BaseActivity<ActivityEducationPinEightBinding>(R.layout.activity_education_pin_eight) {
  private val viewModel: EducationPinEightVM by viewModels<EducationPinEightVM>()

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
    binding.educationPinEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDUCATION_PIN_EIGHT_ACTIVITY"

  }
}
