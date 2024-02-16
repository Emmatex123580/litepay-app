package com.litepayapp.app.modules.upgradethree.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityUpgradeThreeBinding
import com.litepayapp.app.modules.upgradethree.`data`.model.UpgradeThreeRowModel
import com.litepayapp.app.modules.upgradethree.`data`.viewmodel.UpgradeThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class UpgradeThreeActivity :
    BaseActivity<ActivityUpgradeThreeBinding>(R.layout.activity_upgrade_three) {
  private val viewModel: UpgradeThreeVM by viewModels<UpgradeThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val upgradeThreeAdapter =
    UpgradeThreeAdapter(viewModel.upgradeThreeList.value?:mutableListOf())
    binding.recyclerUpgradeThree.adapter = upgradeThreeAdapter
    upgradeThreeAdapter.setOnItemClickListener(
    object : UpgradeThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UpgradeThreeRowModel) {
        onClickRecyclerUpgradeThree(view, position, item)
      }
    }
    )
    viewModel.upgradeThreeList.observe(this) {
      upgradeThreeAdapter.updateData(it)
    }
    binding.upgradeThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerUpgradeThree(
    view: View,
    position: Int,
    item: UpgradeThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "UPGRADE_THREE_ACTIVITY"

  }
}
