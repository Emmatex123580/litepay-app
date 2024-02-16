package com.litepayapp.app.modules.signupthree.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySignUpThreeBinding
import com.litepayapp.app.modules.signupthree.`data`.model.SignUpThreeRowModel
import com.litepayapp.app.modules.signupthree.`data`.viewmodel.SignUpThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpThreeActivity :
    BaseActivity<ActivitySignUpThreeBinding>(R.layout.activity_sign_up_three) {
  private val viewModel: SignUpThreeVM by viewModels<SignUpThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val signUpThreeAdapter =
    SignUpThreeAdapter(viewModel.signUpThreeList.value?:mutableListOf())
    binding.recyclerSignUpThree.adapter = signUpThreeAdapter
    signUpThreeAdapter.setOnItemClickListener(
    object : SignUpThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SignUpThreeRowModel) {
        onClickRecyclerSignUpThree(view, position, item)
      }
    }
    )
    viewModel.signUpThreeList.observe(this) {
      signUpThreeAdapter.updateData(it)
    }
    binding.signUpThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSignUpThree(
    view: View,
    position: Int,
    item: SignUpThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_THREE_ACTIVITY"

  }
}
