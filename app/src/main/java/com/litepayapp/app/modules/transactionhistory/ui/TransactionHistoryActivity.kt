package com.litepayapp.app.modules.transactionhistory.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityTransactionHistoryBinding
import com.litepayapp.app.modules.transactionhistory.`data`.model.ListairtimeRowModel
import com.litepayapp.app.modules.transactionhistory.`data`.viewmodel.TransactionHistoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TransactionHistoryActivity :
    BaseActivity<ActivityTransactionHistoryBinding>(R.layout.activity_transaction_history) {
  private val viewModel: TransactionHistoryVM by viewModels<TransactionHistoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listairtimeAdapter =
    ListairtimeAdapter(viewModel.listairtimeList.value?:mutableListOf())
    binding.recyclerListairtime.adapter = listairtimeAdapter
    listairtimeAdapter.setOnItemClickListener(
    object : ListairtimeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListairtimeRowModel) {
        onClickRecyclerListairtime(view, position, item)
      }
    }
    )
    viewModel.listairtimeList.observe(this) {
      listairtimeAdapter.updateData(it)
    }
    binding.transactionHistoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListairtime(
    view: View,
    position: Int,
    item: ListairtimeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TRANSACTION_HISTORY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TransactionHistoryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
