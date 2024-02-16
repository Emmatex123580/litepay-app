package com.litepayapp.app.modules.signinthree.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySignInThreeBinding
import com.litepayapp.app.modules.signinthree.`data`.viewmodel.SignInThreeVM
import kotlin.String
import kotlin.Unit

class SignInThreeActivity :
    BaseActivity<ActivitySignInThreeBinding>(R.layout.activity_sign_in_three) {
  private val viewModel: SignInThreeVM by viewModels<SignInThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SIGN_IN_THREE_ACTIVITY"

  }
}
