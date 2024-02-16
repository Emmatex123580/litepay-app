package com.litepayapp.app.modules.signineight.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySignInEightBinding
import com.litepayapp.app.modules.signineight.`data`.viewmodel.SignInEightVM
import kotlin.String
import kotlin.Unit

class SignInEightActivity :
    BaseActivity<ActivitySignInEightBinding>(R.layout.activity_sign_in_eight) {
  private val viewModel: SignInEightVM by viewModels<SignInEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SIGN_IN_EIGHT_ACTIVITY"

  }
}
