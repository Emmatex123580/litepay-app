package com.litepayapp.app.modules.withdrawbonusfive.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityWithdrawBonusFiveBinding
import com.litepayapp.app.modules.withdrawbonusfive.`data`.model.ListservicesRowModel
import com.litepayapp.app.modules.withdrawbonusfive.`data`.viewmodel.WithdrawBonusFiveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WithdrawBonusFiveActivity :
    BaseActivity<ActivityWithdrawBonusFiveBinding>(R.layout.activity_withdraw_bonus_five) {
  private val viewModel: WithdrawBonusFiveVM by viewModels<WithdrawBonusFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listservicesAdapter =
    ListservicesAdapter(viewModel.listservicesList.value?:mutableListOf())
    binding.recyclerListservices.adapter = listservicesAdapter
    listservicesAdapter.setOnItemClickListener(
    object : ListservicesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListservicesRowModel) {
        onClickRecyclerListservices(view, position, item)
      }
    }
    )
    viewModel.listservicesList.observe(this) {
      listservicesAdapter.updateData(it)
    }
    binding.withdrawBonusFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListservices(
    view: View,
    position: Int,
    item: ListservicesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "WITHDRAW_BONUS_FIVE_ACTIVITY"

  }
}
