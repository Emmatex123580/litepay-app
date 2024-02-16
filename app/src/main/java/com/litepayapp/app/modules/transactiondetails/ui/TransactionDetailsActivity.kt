package com.litepayapp.app.modules.transactiondetails.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityTransactionDetailsBinding
import com.litepayapp.app.modules.transactiondetails.`data`.viewmodel.TransactionDetailsVM
import kotlin.String
import kotlin.Unit

class TransactionDetailsActivity :
    BaseActivity<ActivityTransactionDetailsBinding>(R.layout.activity_transaction_details) {
  private val viewModel: TransactionDetailsVM by viewModels<TransactionDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.transactionDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TRANSACTION_DETAILS_ACTIVITY"

  }
}
