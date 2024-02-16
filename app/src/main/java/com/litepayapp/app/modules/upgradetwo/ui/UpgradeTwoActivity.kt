package com.litepayapp.app.modules.upgradetwo.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityUpgradeTwoBinding
import com.litepayapp.app.modules.upgradetwo.`data`.model.UpgradeTwoRowModel
import com.litepayapp.app.modules.upgradetwo.`data`.viewmodel.UpgradeTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class UpgradeTwoActivity : BaseActivity<ActivityUpgradeTwoBinding>(R.layout.activity_upgrade_two) {
  private val viewModel: UpgradeTwoVM by viewModels<UpgradeTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val upgradeTwoAdapter = UpgradeTwoAdapter(viewModel.upgradeTwoList.value?:mutableListOf())
    binding.recyclerUpgradeTwo.adapter = upgradeTwoAdapter
    upgradeTwoAdapter.setOnItemClickListener(
    object : UpgradeTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UpgradeTwoRowModel) {
        onClickRecyclerUpgradeTwo(view, position, item)
      }
    }
    )
    viewModel.upgradeTwoList.observe(this) {
      upgradeTwoAdapter.updateData(it)
    }
    binding.upgradeTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerUpgradeTwo(
    view: View,
    position: Int,
    item: UpgradeTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "UPGRADE_TWO_ACTIVITY"

  }
}
