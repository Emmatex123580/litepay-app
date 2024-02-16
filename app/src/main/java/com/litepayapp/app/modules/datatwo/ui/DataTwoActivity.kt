package com.litepayapp.app.modules.datatwo.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityDataTwoBinding
import com.litepayapp.app.modules.datatwo.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.datatwo.`data`.model.SpinnerFrame627042OneModel
import com.litepayapp.app.modules.datatwo.`data`.model.SpinnerFrame627042TwoModel
import com.litepayapp.app.modules.datatwo.`data`.viewmodel.DataTwoVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class DataTwoActivity : BaseActivity<ActivityDataTwoBinding>(R.layout.activity_data_two) {
  private val viewModel: DataTwoVM by viewModels<DataTwoVM>()

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
    binding.dataTwoVM = viewModel
    setUpSearchViewFrame627083Listener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun setUpSearchViewFrame627083Listener(): Unit {
    binding.searchViewFrame627083.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "DATA_TWO_ACTIVITY"

    }
  }
