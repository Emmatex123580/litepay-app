package com.litepayapp.app.modules.airtimeone.ui

import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.litepayapp.app.databinding.BottomsheetAirtimeOneBinding
import com.litepayapp.app.modules.airtimeone.`data`.viewmodel.AirtimeOneVM
import kotlin.String
import kotlin.Unit

class AirtimeOneBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetAirtimeOneBinding>(R.layout.bottomsheet_airtime_one) {
  private val viewModel: AirtimeOneVM by viewModels<AirtimeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.airtimeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AIRTIME_ONE_BOTTOMSHEET"

  }
}
