package com.litepayapp.app.modules.educationpinsix.ui

import android.content.Intent
import android.content.IntentFilter
import android.view.View
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityEducationPinSixBinding
import com.litepayapp.app.modules.educationpinsix.`data`.model.Listframe627146RowModel
import com.litepayapp.app.modules.educationpinsix.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.educationpinsix.`data`.viewmodel.EducationPinSixVM
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EducationPinSixActivity :
    BaseActivity<ActivityEducationPinSixBinding>(R.layout.activity_education_pin_six) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null


  val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
  ActivityResultCallback {
    val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
    getOtpFromMessage(message!!)
    })


    private val viewModel: EducationPinSixVM by viewModels<EducationPinSixVM>()

    override fun onInitialized(): Unit {
      viewModel.navArguments = intent.extras?.getBundle("bundle")
      viewModel.spinnerFrame627042List.value = mutableListOf(
      SpinnerFrame627042Model("Item1"),
      SpinnerFrame627042Model("Item2"),
      SpinnerFrame627042Model("Item3"),
      SpinnerFrame627042Model("Item4"),
      SpinnerFrame627042Model("Item5")
      )
      val spinnerFrame627042Adapter =
      SpinnerFrame627042Adapter(this,R.layout.spinner_item,viewModel.spinnerFrame627042List.value?:
      mutableListOf())
      binding.spinnerFrame627042.adapter = spinnerFrame627042Adapter
      startSmartUserConsent()
      val listframe627146Adapter =
      Listframe627146Adapter(viewModel.listframe627146List.value?:mutableListOf())
      binding.recyclerListframe627146.adapter = listframe627146Adapter
      listframe627146Adapter.setOnItemClickListener(
      object : Listframe627146Adapter.OnItemClickListener {
        override fun onItemClick(view:View, position:Int, item : Listframe627146RowModel) {
          onClickRecyclerListframe627146(view, position, item)
        }
      }
      )
      viewModel.listframe627146List.observe(this) {
        listframe627146Adapter.updateData(it)
      }
      binding.educationPinSixVM = viewModel
    }

    override fun onStop(): Unit {
      super.onStop()
      unregisterReceiver(otpViewOtpviewBroadcastReceiver)
    }

    override fun onStart(): Unit {
      super.onStart()
      registerBroadcastReceiver()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    private fun startSmartUserConsent(): Unit {
      val client = SmsRetriever.getClient(this)
      client.startSmsUserConsent(null)
    }

    private fun registerBroadcastReceiver(): Unit {
      otpViewOtpviewBroadcastReceiver = OtpViewOtpviewBroadcastReceiver()
      otpViewOtpviewBroadcastReceiver?.otpBroadcastReceiverListener =
      object : OtpViewOtpviewBroadcastReceiver.OtpBroadcastListener {
        override fun onSuccess(intent: Intent?) {
          getActivityResult.launch(intent)
        }
        override fun onFailure() {

        }
      }
      val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
      registerReceiver(otpViewOtpviewBroadcastReceiver, intentFilter)
    }

    private fun getOtpFromMessage(message: String): Unit {
      val otpPattern: Pattern = Pattern.compile("(|^)\\d{4}")
      val matcher: Matcher = otpPattern.matcher(message)
      if (matcher.find()) {
        binding.otpViewOtpview?.setText(matcher.group(0))
      }
    }

    fun onClickRecyclerListframe627146(
      view: View,
      position: Int,
      item: Listframe627146RowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "EDUCATION_PIN_SIX_ACTIVITY"

    }
  }
