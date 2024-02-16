package com.litepayapp.app.modules.signupone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySignUpOneBinding
import com.litepayapp.app.modules.signupone.`data`.viewmodel.SignUpOneVM
import kotlin.String
import kotlin.Unit

class SignUpOneActivity : BaseActivity<ActivitySignUpOneBinding>(R.layout.activity_sign_up_one) {
  private val viewModel: SignUpOneVM by viewModels<SignUpOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_UP_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
