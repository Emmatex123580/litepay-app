package com.litepayapp.app.modules.datathree.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityDataThreeBinding
import com.litepayapp.app.modules.datathree.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.datathree.`data`.model.SpinnerFrame627042OneModel
import com.litepayapp.app.modules.datathree.`data`.model.SpinnerFrame627042TwoModel
import com.litepayapp.app.modules.datathree.`data`.viewmodel.DataThreeVM
import kotlin.String
import kotlin.Unit

class DataThreeActivity : BaseActivity<ActivityDataThreeBinding>(R.layout.activity_data_three) {
  private val viewModel: DataThreeVM by viewModels<DataThreeVM>()

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
    viewModel.spinnerFrame627042TwoList.value = mutableListOf(
    SpinnerFrame627042TwoModel("Item1"),
    SpinnerFrame627042TwoModel("Item2"),
    SpinnerFrame627042TwoModel("Item3"),
    SpinnerFrame627042TwoModel("Item4"),
    SpinnerFrame627042TwoModel("Item5")
    )
    val spinnerFrame627042TwoAdapter =
    SpinnerFrame627042TwoAdapter(this,R.layout.spinner_item,viewModel.spinnerFrame627042TwoList.value?:
    mutableListOf())
    binding.spinnerFrame627042Two.adapter = spinnerFrame627042TwoAdapter
    binding.dataThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DATA_THREE_ACTIVITY"

  }
}
