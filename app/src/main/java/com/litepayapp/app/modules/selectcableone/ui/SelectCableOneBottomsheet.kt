package com.litepayapp.app.modules.selectcableone.ui

import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.litepayapp.app.databinding.BottomsheetSelectCableOneBinding
import com.litepayapp.app.modules.selectcableone.`data`.viewmodel.SelectCableOneVM
import kotlin.String
import kotlin.Unit

class SelectCableOneBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSelectCableOneBinding>(R.layout.bottomsheet_select_cable_one)
    {
  private val viewModel: SelectCableOneVM by viewModels<SelectCableOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.selectCableOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "SELECT_CABLE_ONE_BOTTOMSHEET"

  }
}
