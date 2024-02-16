package com.litepayapp.app.modules.dataone.ui

import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.litepayapp.app.databinding.BottomsheetDataOneBinding
import com.litepayapp.app.modules.dataone.`data`.viewmodel.DataOneVM
import kotlin.String
import kotlin.Unit

class DataOneBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetDataOneBinding>(R.layout.bottomsheet_data_one) {
  private val viewModel: DataOneVM by viewModels<DataOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.dataOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DATA_ONE_BOTTOMSHEET"

  }
}
