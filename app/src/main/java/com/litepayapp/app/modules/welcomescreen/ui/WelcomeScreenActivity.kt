package com.litepayapp.app.modules.welcomescreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityWelcomeScreenBinding
import com.litepayapp.app.modules.signin.ui.SignInActivity
import com.litepayapp.app.modules.welcomescreen.`data`.viewmodel.WelcomeScreenVM
import com.litepayapp.app.modules.welcomescreentwo.ui.WelcomeScreenTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WelcomeScreenActivity :
    BaseActivity<ActivityWelcomeScreenBinding>(R.layout.activity_welcome_screen) {
  private val viewModel: WelcomeScreenVM by viewModels<WelcomeScreenVM>()

  private val REQUEST_CODE_WELCOME_SCREEN_TWO_ACTIVITY: Int = 784


  private val REQUEST_CODE_SIGN_IN_ACTIVITY: Int = 180


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = WelcomeScreenTwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_WELCOME_SCREEN_TWO_ACTIVITY)
    }
    binding.btnSkip.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_IN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "WELCOME_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WelcomeScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
