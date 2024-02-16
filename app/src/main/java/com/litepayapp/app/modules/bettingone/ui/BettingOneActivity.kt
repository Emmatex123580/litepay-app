package com.litepayapp.app.modules.bettingone.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityBettingOneBinding
import com.litepayapp.app.modules.bettingone.`data`.model.BettingOneRowModel
import com.litepayapp.app.modules.bettingone.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.bettingone.`data`.viewmodel.BettingOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BettingOneActivity : BaseActivity<ActivityBettingOneBinding>(R.layout.activity_betting_one) {
  private val viewModel: BettingOneVM by viewModels<BettingOneVM>()

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
    val bettingOneAdapter = BettingOneAdapter(viewModel.bettingOneList.value?:mutableListOf())
    binding.recyclerBettingOne.adapter = bettingOneAdapter
    bettingOneAdapter.setOnItemClickListener(
    object : BettingOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BettingOneRowModel) {
        onClickRecyclerBettingOne(view, position, item)
      }
    }
    )
    viewModel.bettingOneList.observe(this) {
      bettingOneAdapter.updateData(it)
    }
    binding.bettingOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerBettingOne(
    view: View,
    position: Int,
    item: BettingOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BETTING_ONE_ACTIVITY"

  }
}
