package com.litepayapp.app.modules.airtime.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityAirtimeBinding
import com.litepayapp.app.modules.airtime.`data`.model.SpinnerFrame627042FourModel
import com.litepayapp.app.modules.airtime.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.airtime.`data`.model.SpinnerFrame627042OneModel
import com.litepayapp.app.modules.airtime.`data`.viewmodel.AirtimeVM
import kotlin.String
import kotlin.Unit

class AirtimeActivity : BaseActivity<ActivityAirtimeBinding>(R.layout.activity_airtime) {
  private val viewModel: AirtimeVM by viewModels<AirtimeVM>()

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
    viewModel.spinnerFrame627042FourList.value = mutableListOf(
    SpinnerFrame627042FourModel("Item1"),
    SpinnerFrame627042FourModel("Item2"),
    SpinnerFrame627042FourModel("Item3"),
    SpinnerFrame627042FourModel("Item4"),
    SpinnerFrame627042FourModel("Item5")
    )
    val spinnerFrame627042FourAdapter =
    SpinnerFrame627042FourAdapter(this,R.layout.spinner_item,viewModel.spinnerFrame627042FourList.value?:
    mutableListOf())
    binding.spinnerFrame627042Four.adapter = spinnerFrame627042FourAdapter
    binding.airtimeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AIRTIME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AirtimeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
