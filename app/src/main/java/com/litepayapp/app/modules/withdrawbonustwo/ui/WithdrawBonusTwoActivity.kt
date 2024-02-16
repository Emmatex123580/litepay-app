package com.litepayapp.app.modules.withdrawbonustwo.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityWithdrawBonusTwoBinding
import com.litepayapp.app.modules.withdrawbonustwo.`data`.viewmodel.WithdrawBonusTwoVM
import kotlin.String
import kotlin.Unit

class WithdrawBonusTwoActivity :
    BaseActivity<ActivityWithdrawBonusTwoBinding>(R.layout.activity_withdraw_bonus_two) {
  private val viewModel: WithdrawBonusTwoVM by viewModels<WithdrawBonusTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.withdrawBonusTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "WITHDRAW_BONUS_TWO_ACTIVITY"

  }
}
