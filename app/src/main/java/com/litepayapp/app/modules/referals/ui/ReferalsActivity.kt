package com.litepayapp.app.modules.referals.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityReferalsBinding
import com.litepayapp.app.modules.referals.`data`.viewmodel.ReferalsVM
import kotlin.String
import kotlin.Unit

class ReferalsActivity : BaseActivity<ActivityReferalsBinding>(R.layout.activity_referals) {
  private val viewModel: ReferalsVM by viewModels<ReferalsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.referalsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFERALS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReferalsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
