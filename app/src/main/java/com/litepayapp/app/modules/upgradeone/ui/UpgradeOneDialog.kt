package com.litepayapp.app.modules.upgradeone.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseDialogFragment
import com.litepayapp.app.databinding.DialogUpgradeOneBinding
import com.litepayapp.app.modules.upgradeone.`data`.viewmodel.UpgradeOneVM
import kotlin.String
import kotlin.Unit

class UpgradeOneDialog : BaseDialogFragment<DialogUpgradeOneBinding>(R.layout.dialog_upgrade_one) {
  private val viewModel: UpgradeOneVM by viewModels<UpgradeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.upgradeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "UPGRADE_ONE_DIALOG"


    fun getInstance(bundle: Bundle?): UpgradeOneDialog {
      val fragment = UpgradeOneDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
