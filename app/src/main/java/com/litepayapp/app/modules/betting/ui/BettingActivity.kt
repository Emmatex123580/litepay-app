package com.litepayapp.app.modules.betting.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityBettingBinding
import com.litepayapp.app.modules.betting.`data`.model.BettingRowModel
import com.litepayapp.app.modules.betting.`data`.viewmodel.BettingVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BettingActivity : BaseActivity<ActivityBettingBinding>(R.layout.activity_betting) {
  private val viewModel: BettingVM by viewModels<BettingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val bettingAdapter = BettingAdapter(viewModel.bettingList.value?:mutableListOf())
    binding.recyclerBetting.adapter = bettingAdapter
    bettingAdapter.setOnItemClickListener(
    object : BettingAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BettingRowModel) {
        onClickRecyclerBetting(view, position, item)
      }
    }
    )
    viewModel.bettingList.observe(this) {
      bettingAdapter.updateData(it)
    }
    binding.bettingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerBetting(
    view: View,
    position: Int,
    item: BettingRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BETTING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BettingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
