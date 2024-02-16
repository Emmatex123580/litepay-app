package com.litepayapp.app.modules.withdrawbonus.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityWithdrawBonusBinding
import com.litepayapp.app.modules.withdrawbonus.`data`.viewmodel.WithdrawBonusVM
import kotlin.String
import kotlin.Unit

class WithdrawBonusActivity :
    BaseActivity<ActivityWithdrawBonusBinding>(R.layout.activity_withdraw_bonus) {
  private val viewModel: WithdrawBonusVM by viewModels<WithdrawBonusVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.withdrawBonusVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "WITHDRAW_BONUS_ACTIVITY"

  }
}
