package com.litepayapp.app.modules.welcomescreentwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityWelcomeScreenTwoBinding
import com.litepayapp.app.modules.signin.ui.SignInActivity
import com.litepayapp.app.modules.welcomescreenthree.ui.WelcomeScreenThreeActivity
import com.litepayapp.app.modules.welcomescreentwo.`data`.viewmodel.WelcomeScreenTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WelcomeScreenTwoActivity :
    BaseActivity<ActivityWelcomeScreenTwoBinding>(R.layout.activity_welcome_screen_two) {
  private val viewModel: WelcomeScreenTwoVM by viewModels<WelcomeScreenTwoVM>()

  private val REQUEST_CODE_SIGN_IN_ACTIVITY: Int = 296

  private val REQUEST_CODE_WELCOME_SCREEN_THREE_ACTIVITY: Int = 903

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeScreenTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSkip.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_IN_ACTIVITY)
    }
    binding.btnNext.setOnClickListener {
      val destIntent = WelcomeScreenThreeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_WELCOME_SCREEN_THREE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "WELCOME_SCREEN_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WelcomeScreenTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
