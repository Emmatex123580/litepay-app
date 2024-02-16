package com.litepayapp.app.modules.withdrawbonussix.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityWithdrawBonusSixBinding
import com.litepayapp.app.modules.withdrawbonussix.`data`.model.Listservices1RowModel
import com.litepayapp.app.modules.withdrawbonussix.`data`.viewmodel.WithdrawBonusSixVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WithdrawBonusSixActivity :
    BaseActivity<ActivityWithdrawBonusSixBinding>(R.layout.activity_withdraw_bonus_six) {
  private val viewModel: WithdrawBonusSixVM by viewModels<WithdrawBonusSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listservicesAdapter =
    ListservicesAdapter(viewModel.listservicesList.value?:mutableListOf())
    binding.recyclerListservices.adapter = listservicesAdapter
    listservicesAdapter.setOnItemClickListener(
    object : ListservicesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listservices1RowModel) {
        onClickRecyclerListservices(view, position, item)
      }
    }
    )
    viewModel.listservicesList.observe(this) {
      listservicesAdapter.updateData(it)
    }
    binding.withdrawBonusSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListservices(
    view: View,
    position: Int,
    item: Listservices1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "WITHDRAW_BONUS_SIX_ACTIVITY"

  }
}
