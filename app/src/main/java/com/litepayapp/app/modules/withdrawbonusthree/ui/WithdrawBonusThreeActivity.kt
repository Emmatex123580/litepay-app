package com.litepayapp.app.modules.withdrawbonusthree.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityWithdrawBonusThreeBinding
import com.litepayapp.app.modules.withdrawbonusthree.`data`.viewmodel.WithdrawBonusThreeVM
import kotlin.String
import kotlin.Unit

class WithdrawBonusThreeActivity :
    BaseActivity<ActivityWithdrawBonusThreeBinding>(R.layout.activity_withdraw_bonus_three) {
  private val viewModel: WithdrawBonusThreeVM by viewModels<WithdrawBonusThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.withdrawBonusThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "WITHDRAW_BONUS_THREE_ACTIVITY"

  }
}
