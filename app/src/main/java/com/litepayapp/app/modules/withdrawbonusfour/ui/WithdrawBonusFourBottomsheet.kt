package com.litepayapp.app.modules.withdrawbonusfour.ui

import android.content.Intent
import android.content.IntentFilter
import android.view.View
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.litepayapp.app.databinding.BottomsheetWithdrawBonusFourBinding
import com.litepayapp.app.modules.withdrawbonusfour.`data`.model.Listframe627148RowModel
import com.litepayapp.app.modules.withdrawbonusfour.`data`.viewmodel.WithdrawBonusFourVM
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WithdrawBonusFourBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetWithdrawBonusFourBinding>(R.layout.bottomsheet_withdraw_bonus_four)
    {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null


  val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
  ActivityResultCallback {
    val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
    getOtpFromMessage(message!!)
    })


    private val viewModel: WithdrawBonusFourVM by viewModels<WithdrawBonusFourVM>()

    override fun onInitialized(): Unit {
      viewModel.navArguments = arguments
      startSmartUserConsent()
      val listframe627146Adapter =
      Listframe627146Adapter(viewModel.listframe627146List.value?:mutableListOf())
      binding.recyclerListframe627146.adapter = listframe627146Adapter
      listframe627146Adapter.setOnItemClickListener(
      object : Listframe627146Adapter.OnItemClickListener {
        override fun onItemClick(view:View, position:Int, item : Listframe627148RowModel) {
          onClickRecyclerListframe627146(view, position, item)
        }
      }
      )
      viewModel.listframe627146List.observe(requireActivity()) {
        listframe627146Adapter.updateData(it)
      }
      binding.withdrawBonusFourVM = viewModel
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
      binding.imageClose.setOnClickListener {
        dismiss()
      }
    }

    private fun startSmartUserConsent(): Unit {
      val client = SmsRetriever.getClient(requireActivity())
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
      item: Listframe627148RowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "WITHDRAW_BONUS_FOUR_BOTTOMSHEET"

    }
  }
