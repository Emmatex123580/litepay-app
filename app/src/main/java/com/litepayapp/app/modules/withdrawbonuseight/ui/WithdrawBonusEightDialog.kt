package com.litepayapp.app.modules.withdrawbonuseight.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseDialogFragment
import com.litepayapp.app.databinding.DialogWithdrawBonusEightBinding
import com.litepayapp.app.modules.withdrawbonuseight.`data`.viewmodel.WithdrawBonusEightVM
import kotlin.String
import kotlin.Unit

class WithdrawBonusEightDialog :
    BaseDialogFragment<DialogWithdrawBonusEightBinding>(R.layout.dialog_withdraw_bonus_eight) {
  private val viewModel: WithdrawBonusEightVM by viewModels<WithdrawBonusEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.withdrawBonusEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WITHDRAW_BONUS_EIGHT_DIALOG"

  }
}
