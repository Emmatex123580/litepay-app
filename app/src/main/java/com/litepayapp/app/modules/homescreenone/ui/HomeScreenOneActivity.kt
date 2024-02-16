package com.litepayapp.app.modules.homescreenone.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityHomeScreenOneBinding
import com.litepayapp.app.modules.homescreenone.`data`.model.ListarrightRowModel
import com.litepayapp.app.modules.homescreenone.`data`.viewmodel.HomeScreenOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeScreenOneActivity :
    BaseActivity<ActivityHomeScreenOneBinding>(R.layout.activity_home_screen_one) {
  private val viewModel: HomeScreenOneVM by viewModels<HomeScreenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listarrowrightAdapter =
    ListarrowrightAdapter(viewModel.listarrowrightList.value?:mutableListOf())
    binding.recyclerListarrowright.adapter = listarrowrightAdapter
    listarrowrightAdapter.setOnItemClickListener(
    object : ListarrowrightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListarrightRowModel) {
        onClickRecyclerListarrowright(view, position, item)
      }
    }
    )
    viewModel.listarrowrightList.observe(this) {
      listarrowrightAdapter.updateData(it)
    }
    binding.homeScreenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListarrowright(
    view: View,
    position: Int,
    item: ListarrightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_ONE_ACTIVITY"

  }
}
