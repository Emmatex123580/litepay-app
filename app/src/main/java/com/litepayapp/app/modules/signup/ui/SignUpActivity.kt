package com.litepayapp.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivitySignUpBinding
import com.litepayapp.app.modules.signin.ui.SignInActivity
import com.litepayapp.app.modules.signup.`data`.model.SignUpRowModel
import com.litepayapp.app.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  private val REQUEST_CODE_SIGN_IN_ACTIVITY: Int = 684


  private var auth: FirebaseAuth = Firebase.auth


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val signUpAdapter = SignUpAdapter(viewModel.signUpList.value?:mutableListOf())
    binding.recyclerSignUp.adapter = signUpAdapter
    signUpAdapter.setOnItemClickListener(
    object : SignUpAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SignUpRowModel) {
        onClickRecyclerSignUp(view, position, item)
      }
    }
    )
    viewModel.signUpList.observe(this) {
      signUpAdapter.updateData(it)
    }
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtConfirmation.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_IN_ACTIVITY)
    }
    binding.btnGetStarted.setOnClickListener {
      val email = ""
      val password = ""
      if(email.isNotEmpty() && password.isNotEmpty()) {
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
          if(task.isSuccessful) {
          } else {

          }
        }
      }
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSignUp(
    view: View,
    position: Int,
    item: SignUpRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
