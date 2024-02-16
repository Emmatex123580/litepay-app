package com.litepayapp.app.modules.bettingthree.ui

import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.litepayapp.app.databinding.BottomsheetBettingThreeBinding
import com.litepayapp.app.modules.bettingthree.`data`.model.BettingThreeRowModel
import com.litepayapp.app.modules.bettingthree.`data`.viewmodel.BettingThreeVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BettingThreeBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetBettingThreeBinding>(R.layout.bottomsheet_betting_three)
    {
  private val viewModel: BettingThreeVM by viewModels<BettingThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val bettingThreeAdapter =
    BettingThreeAdapter(viewModel.bettingThreeList.value?:mutableListOf())
    binding.recyclerBettingThree.adapter = bettingThreeAdapter
    bettingThreeAdapter.setOnItemClickListener(
    object : BettingThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BettingThreeRowModel) {
        onClickRecyclerBettingThree(view, position, item)
      }
    }
    )
    viewModel.bettingThreeList.observe(requireActivity()) {
      bettingThreeAdapter.updateData(it)
    }
    binding.bettingThreeVM = viewModel
    setUpSearchViewFrame627083Listener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerBettingThree(
    view: View,
    position: Int,
    item: BettingThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewFrame627083Listener(): Unit {
    binding.searchViewFrame627083.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "BETTING_THREE_BOTTOMSHEET"

    }
  }
