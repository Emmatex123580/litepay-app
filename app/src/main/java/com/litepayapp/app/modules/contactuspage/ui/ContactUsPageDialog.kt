package com.litepayapp.app.modules.contactuspage.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseDialogFragment
import com.litepayapp.app.databinding.DialogContactUsPageBinding
import com.litepayapp.app.modules.contactuspage.`data`.viewmodel.ContactUsPageVM
import kotlin.String
import kotlin.Unit

class ContactUsPageDialog :
    BaseDialogFragment<DialogContactUsPageBinding>(R.layout.dialog_contact_us_page) {
  private val viewModel: ContactUsPageVM by viewModels<ContactUsPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.contactUsPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CONTACT_US_PAGE_DIALOG"

  }
}
