package com.litepayapp.app.modules.addmoney.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.litepayapp.app.databinding.BottomsheetAddMoneyBinding
import com.litepayapp.app.modules.addmoney.`data`.viewmodel.AddMoneyVM
import kotlin.String
import kotlin.Unit

class AddMoneyBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetAddMoneyBinding>(R.layout.bottomsheet_add_money) {
  private val viewModel: AddMoneyVM by viewModels<AddMoneyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.addMoneyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "ADD_MONEY_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): AddMoneyBottomsheet {
      val fragment = AddMoneyBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
