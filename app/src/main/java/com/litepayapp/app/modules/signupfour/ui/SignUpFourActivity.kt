package com.litepayapp.app.modules.signupfour.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySignUpFourBinding
import com.litepayapp.app.modules.signupfour.`data`.viewmodel.SignUpFourVM
import kotlin.String
import kotlin.Unit

class SignUpFourActivity : BaseActivity<ActivitySignUpFourBinding>(R.layout.activity_sign_up_four) {
  private val viewModel: SignUpFourVM by viewModels<SignUpFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_UP_FOUR_ACTIVITY"

  }
}
