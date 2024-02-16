package com.litepayapp.app.modules.signupsuccess.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySignUpSuccessBinding
import com.litepayapp.app.modules.signupsuccess.`data`.viewmodel.SignUpSuccessVM
import kotlin.String
import kotlin.Unit

class SignUpSuccessActivity :
    BaseActivity<ActivitySignUpSuccessBinding>(R.layout.activity_sign_up_success) {
  private val viewModel: SignUpSuccessVM by viewModels<SignUpSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_UP_SUCCESS_ACTIVITY"

  }
}
