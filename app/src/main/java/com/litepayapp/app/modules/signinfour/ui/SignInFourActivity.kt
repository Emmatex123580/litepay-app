package com.litepayapp.app.modules.signinfour.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySignInFourBinding
import com.litepayapp.app.modules.signinfour.`data`.viewmodel.SignInFourVM
import kotlin.String
import kotlin.Unit

class SignInFourActivity : BaseActivity<ActivitySignInFourBinding>(R.layout.activity_sign_in_four) {
  private val viewModel: SignInFourVM by viewModels<SignInFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SIGN_IN_FOUR_ACTIVITY"

  }
}
