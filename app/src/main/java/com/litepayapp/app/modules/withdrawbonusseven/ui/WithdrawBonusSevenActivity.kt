package com.litepayapp.app.modules.withdrawbonusseven.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityWithdrawBonusSevenBinding
import com.litepayapp.app.modules.withdrawbonusseven.`data`.viewmodel.WithdrawBonusSevenVM
import kotlin.String
import kotlin.Unit

class WithdrawBonusSevenActivity :
    BaseActivity<ActivityWithdrawBonusSevenBinding>(R.layout.activity_withdraw_bonus_seven) {
  private val viewModel: WithdrawBonusSevenVM by viewModels<WithdrawBonusSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.withdrawBonusSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "WITHDRAW_BONUS_SEVEN_ACTIVITY"

  }
}
