package com.litepayapp.app.modules.signuptwo.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySignUpTwoBinding
import com.litepayapp.app.modules.signuptwo.`data`.model.SignUpTwoRowModel
import com.litepayapp.app.modules.signuptwo.`data`.viewmodel.SignUpTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpTwoActivity : BaseActivity<ActivitySignUpTwoBinding>(R.layout.activity_sign_up_two) {
  private val viewModel: SignUpTwoVM by viewModels<SignUpTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val signUpTwoAdapter = SignUpTwoAdapter(viewModel.signUpTwoList.value?:mutableListOf())
    binding.recyclerSignUpTwo.adapter = signUpTwoAdapter
    signUpTwoAdapter.setOnItemClickListener(
    object : SignUpTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SignUpTwoRowModel) {
        onClickRecyclerSignUpTwo(view, position, item)
      }
    }
    )
    viewModel.signUpTwoList.observe(this) {
      signUpTwoAdapter.updateData(it)
    }
    binding.signUpTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSignUpTwo(
    view: View,
    position: Int,
    item: SignUpTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_TWO_ACTIVITY"

  }
}
