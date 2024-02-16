package com.litepayapp.app.modules.signintwo.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySignInTwoBinding
import com.litepayapp.app.modules.signintwo.`data`.viewmodel.SignInTwoVM
import kotlin.String
import kotlin.Unit

class SignInTwoActivity : BaseActivity<ActivitySignInTwoBinding>(R.layout.activity_sign_in_two) {
  private val viewModel: SignInTwoVM by viewModels<SignInTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SIGN_IN_TWO_ACTIVITY"

  }
}
