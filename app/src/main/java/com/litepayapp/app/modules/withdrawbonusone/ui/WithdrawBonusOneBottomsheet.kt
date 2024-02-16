package com.litepayapp.app.modules.withdrawbonusone.ui

import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.litepayapp.app.databinding.BottomsheetWithdrawBonusOneBinding
import com.litepayapp.app.modules.withdrawbonusone.`data`.viewmodel.WithdrawBonusOneVM
import kotlin.String
import kotlin.Unit

class WithdrawBonusOneBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetWithdrawBonusOneBinding>(R.layout.bottomsheet_withdraw_bonus_one)
    {
  private val viewModel: WithdrawBonusOneVM by viewModels<WithdrawBonusOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.withdrawBonusOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "WITHDRAW_BONUS_ONE_BOTTOMSHEET"

  }
}
