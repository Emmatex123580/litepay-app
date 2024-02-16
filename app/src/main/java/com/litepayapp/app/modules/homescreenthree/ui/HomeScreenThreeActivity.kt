package com.litepayapp.app.modules.homescreenthree.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityHomeScreenThreeBinding
import com.litepayapp.app.modules.homescreenthree.`data`.model.Listarright2RowModel
import com.litepayapp.app.modules.homescreenthree.`data`.viewmodel.HomeScreenThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeScreenThreeActivity :
    BaseActivity<ActivityHomeScreenThreeBinding>(R.layout.activity_home_screen_three) {
  private val viewModel: HomeScreenThreeVM by viewModels<HomeScreenThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listarrowrightAdapter =
    ListarrowrightAdapter(viewModel.listarrowrightList.value?:mutableListOf())
    binding.recyclerListarrowright.adapter = listarrowrightAdapter
    listarrowrightAdapter.setOnItemClickListener(
    object : ListarrowrightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listarright2RowModel) {
        onClickRecyclerListarrowright(view, position, item)
      }
    }
    )
    viewModel.listarrowrightList.observe(this) {
      listarrowrightAdapter.updateData(it)
    }
    binding.homeScreenThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListarrowright(
    view: View,
    position: Int,
    item: Listarright2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_THREE_ACTIVITY"

  }
}
