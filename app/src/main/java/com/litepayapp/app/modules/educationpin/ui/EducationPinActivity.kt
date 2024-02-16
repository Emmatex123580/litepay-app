package com.litepayapp.app.modules.educationpin.ui

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
import com.litepayapp.app.databinding.ActivityEducationPinBinding
import com.litepayapp.app.modules.educationpin.`data`.model.EducationPinRowModel
import com.litepayapp.app.modules.educationpin.`data`.model.SpinnerFrame627042Model
import com.litepayapp.app.modules.educationpin.`data`.viewmodel.EducationPinVM
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EducationPinActivity :
    BaseActivity<ActivityEducationPinBinding>(R.layout.activity_education_pin) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null


  val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
  ActivityResultCallback {
    val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
    getOtpFromMessage(message!!)
    })


    private val viewModel: EducationPinVM by viewModels<EducationPinVM>()

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
      val educationPinAdapter =
      EducationPinAdapter(viewModel.educationPinList.value?:mutableListOf())
      binding.recyclerEducationPin.adapter = educationPinAdapter
      educationPinAdapter.setOnItemClickListener(
      object : EducationPinAdapter.OnItemClickListener {
        override fun onItemClick(view:View, position:Int, item : EducationPinRowModel) {
          onClickRecyclerEducationPin(view, position, item)
        }
      }
      )
      viewModel.educationPinList.observe(this) {
        educationPinAdapter.updateData(it)
      }
      binding.educationPinVM = viewModel
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

    fun onClickRecyclerEducationPin(
      view: View,
      position: Int,
      item: EducationPinRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "EDUCATION_PIN_ACTIVITY"

    }
  }
