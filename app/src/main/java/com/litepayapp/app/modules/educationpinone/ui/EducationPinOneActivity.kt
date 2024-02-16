package com.litepayapp.app.modules.educationpinone.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityEducationPinOneBinding
import com.litepayapp.app.modules.educationpinone.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.educationpinone.`data`.viewmodel.EducationPinOneVM
import kotlin.String
import kotlin.Unit

class EducationPinOneActivity :
    BaseActivity<ActivityEducationPinOneBinding>(R.layout.activity_education_pin_one) {
  private val viewModel: EducationPinOneVM by viewModels<EducationPinOneVM>()

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
    binding.educationPinOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDUCATION_PIN_ONE_ACTIVITY"

  }
}
