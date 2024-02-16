package com.litepayapp.app.modules.bettingfour.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseDialogFragment
import com.litepayapp.app.databinding.DialogBettingFourBinding
import com.litepayapp.app.modules.bettingfour.`data`.viewmodel.BettingFourVM
import kotlin.String
import kotlin.Unit

class BettingFourDialog : BaseDialogFragment<DialogBettingFourBinding>(R.layout.dialog_betting_four)
    {
  private val viewModel: BettingFourVM by viewModels<BettingFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.bettingFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "BETTING_FOUR_DIALOG"

  }
}
