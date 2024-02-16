package com.litepayapp.app.modules.selectdiscocompany.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySelectDiscoCompanyBinding
import com.litepayapp.app.modules.selectdiscocompany.`data`.viewmodel.SelectDiscoCompanyVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SelectDiscoCompanyActivity :
    BaseActivity<ActivitySelectDiscoCompanyBinding>(R.layout.activity_select_disco_company) {
  private val viewModel: SelectDiscoCompanyVM by viewModels<SelectDiscoCompanyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.selectDiscoCompanyVM = viewModel
    setUpSearchViewFrame627083Listener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
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
      const val TAG: String = "SELECT_DISCO_COMPANY_ACTIVITY"

    }
  }
