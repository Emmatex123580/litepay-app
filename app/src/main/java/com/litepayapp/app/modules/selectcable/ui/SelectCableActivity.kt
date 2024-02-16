package com.litepayapp.app.modules.selectcable.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySelectCableBinding
import com.litepayapp.app.modules.selectcable.`data`.viewmodel.SelectCableVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SelectCableActivity : BaseActivity<ActivitySelectCableBinding>(R.layout.activity_select_cable)
    {
  private val viewModel: SelectCableVM by viewModels<SelectCableVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.selectCableVM = viewModel
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
      const val TAG: String = "SELECT_CABLE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SelectCableActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
