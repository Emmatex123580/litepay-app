package com.litepayapp.app.modules.bettingfive.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseDialogFragment
import com.litepayapp.app.databinding.DialogBettingFiveBinding
import com.litepayapp.app.modules.bettingfive.`data`.viewmodel.BettingFiveVM
import kotlin.String
import kotlin.Unit

class BettingFiveDialog : BaseDialogFragment<DialogBettingFiveBinding>(R.layout.dialog_betting_five)
    {
  private val viewModel: BettingFiveVM by viewModels<BettingFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.bettingFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BETTING_FIVE_DIALOG"

  }
}
