package com.litepayapp.app.modules.welcomescreenthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityWelcomeScreenThreeBinding
import com.litepayapp.app.modules.signup.ui.SignUpActivity
import com.litepayapp.app.modules.welcomescreenthree.`data`.viewmodel.WelcomeScreenThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WelcomeScreenThreeActivity :
    BaseActivity<ActivityWelcomeScreenThreeBinding>(R.layout.activity_welcome_screen_three) {
  private val viewModel: WelcomeScreenThreeVM by viewModels<WelcomeScreenThreeVM>()

  private val REQUEST_CODE_SIGN_UP_ACTIVITY: Int = 660

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeScreenThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "WELCOME_SCREEN_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WelcomeScreenThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
