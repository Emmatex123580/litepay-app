package com.litepayapp.app.modules.bettingtwo.ui

import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.litepayapp.app.databinding.BottomsheetBettingTwoBinding
import com.litepayapp.app.modules.bettingtwo.`data`.model.BettingTwoRowModel
import com.litepayapp.app.modules.bettingtwo.`data`.viewmodel.BettingTwoVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BettingTwoBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetBettingTwoBinding>(R.layout.bottomsheet_betting_two) {
  private val viewModel: BettingTwoVM by viewModels<BettingTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val bettingTwoAdapter = BettingTwoAdapter(viewModel.bettingTwoList.value?:mutableListOf())
    binding.recyclerBettingTwo.adapter = bettingTwoAdapter
    bettingTwoAdapter.setOnItemClickListener(
    object : BettingTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BettingTwoRowModel) {
        onClickRecyclerBettingTwo(view, position, item)
      }
    }
    )
    viewModel.bettingTwoList.observe(requireActivity()) {
      bettingTwoAdapter.updateData(it)
    }
    binding.bettingTwoVM = viewModel
    setUpSearchViewFrame627083Listener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerBettingTwo(
    view: View,
    position: Int,
    item: BettingTwoRowModel
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
      const val TAG: String = "BETTING_TWO_BOTTOMSHEET"

    }
  }
