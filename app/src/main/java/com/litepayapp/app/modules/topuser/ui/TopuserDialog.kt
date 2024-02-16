package com.litepayapp.app.modules.topuser.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseDialogFragment
import com.litepayapp.app.databinding.DialogTopuserBinding
import com.litepayapp.app.modules.topuser.`data`.viewmodel.TopuserVM
import kotlin.String
import kotlin.Unit

class TopuserDialog : BaseDialogFragment<DialogTopuserBinding>(R.layout.dialog_topuser) {
  private val viewModel: TopuserVM by viewModels<TopuserVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.topuserVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TOPUSER_DIALOG"

  }
}
