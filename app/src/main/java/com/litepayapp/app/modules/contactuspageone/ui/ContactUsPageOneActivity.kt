package com.litepayapp.app.modules.contactuspageone.ui

import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityContactUsPageOneBinding
import com.litepayapp.app.modules.contactuspageone.`data`.viewmodel.ContactUsPageOneVM
import kotlin.String
import kotlin.Unit

class ContactUsPageOneActivity :
    BaseActivity<ActivityContactUsPageOneBinding>(R.layout.activity_contact_us_page_one) {
  private val viewModel: ContactUsPageOneVM by viewModels<ContactUsPageOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.contactUsPageOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CONTACT_US_PAGE_ONE_ACTIVITY"

  }
}
