package com.litepayapp.app.modules.walletsummary.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityWalletSummaryBinding
import com.litepayapp.app.modules.walletsummary.`data`.model.Listarright1RowModel
import com.litepayapp.app.modules.walletsummary.`data`.model.ListbiphoneRowModel
import com.litepayapp.app.modules.walletsummary.`data`.viewmodel.WalletSummaryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WalletSummaryActivity :
    BaseActivity<ActivityWalletSummaryBinding>(R.layout.activity_wallet_summary) {
  private val viewModel: WalletSummaryVM by viewModels<WalletSummaryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbiphoneAdapter =
    ListbiphoneAdapter(viewModel.listbiphoneList.value?:mutableListOf())
    binding.recyclerListbiphone.adapter = listbiphoneAdapter
    listbiphoneAdapter.setOnItemClickListener(
    object : ListbiphoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbiphoneRowModel) {
        onClickRecyclerListbiphone(view, position, item)
      }
    }
    )
    viewModel.listbiphoneList.observe(this) {
      listbiphoneAdapter.updateData(it)
    }
    val listarrowrightAdapter =
    ListarrowrightAdapter(viewModel.listarrowrightList.value?:mutableListOf())
    binding.recyclerListarrowright.adapter = listarrowrightAdapter
    listarrowrightAdapter.setOnItemClickListener(
    object : ListarrowrightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listarright1RowModel) {
        onClickRecyclerListarrowright(view, position, item)
      }
    }
    )
    viewModel.listarrowrightList.observe(this) {
      listarrowrightAdapter.updateData(it)
    }
    binding.walletSummaryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListbiphone(
    view: View,
    position: Int,
    item: ListbiphoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListarrowright(
    view: View,
    position: Int,
    item: Listarright1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "WALLET_SUMMARY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WalletSummaryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
