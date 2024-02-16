package com.litepayapp.app.modules.educationpinthree.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityEducationPinThreeBinding
import com.litepayapp.app.modules.educationpinthree.`data`.model.ListenterpinRowModel
import com.litepayapp.app.modules.educationpinthree.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.educationpinthree.`data`.viewmodel.EducationPinThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EducationPinThreeActivity :
    BaseActivity<ActivityEducationPinThreeBinding>(R.layout.activity_education_pin_three) {
  private val viewModel: EducationPinThreeVM by viewModels<EducationPinThreeVM>()

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
    val listenterpinAdapter =
    ListenterpinAdapter(viewModel.listenterpinList.value?:mutableListOf())
    binding.recyclerListenterpin.adapter = listenterpinAdapter
    listenterpinAdapter.setOnItemClickListener(
    object : ListenterpinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListenterpinRowModel) {
        onClickRecyclerListenterpin(view, position, item)
      }
    }
    )
    viewModel.listenterpinList.observe(this) {
      listenterpinAdapter.updateData(it)
    }
    binding.educationPinThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListenterpin(
    view: View,
    position: Int,
    item: ListenterpinRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EDUCATION_PIN_THREE_ACTIVITY"

  }
}
