package com.litepayapp.app.modules.homescreen.ui

import android.view.View
import androidx.activity.viewModels
import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.base.BaseActivity
import com.litepayapp.app.databinding.ActivityHomeScreenBinding
import com.litepayapp.app.modules.`data`.ui.DataActivity
import com.litepayapp.app.modules.addmoney.ui.AddMoneyBottomsheet
import com.litepayapp.app.modules.airtime.ui.AirtimeActivity
import com.litepayapp.app.modules.betting.ui.BettingActivity
import com.litepayapp.app.modules.educationpintwo.ui.EducationPinTwoActivity
import com.litepayapp.app.modules.electricity.ui.ElectricityActivity
import com.litepayapp.app.modules.homescreen.`data`.model.HomeScreenRowModel
import com.litepayapp.app.modules.homescreen.`data`.viewmodel.HomeScreenVM
import com.litepayapp.app.modules.notification.ui.NotificationActivity
import com.litepayapp.app.modules.referals.ui.ReferalsActivity
import com.litepayapp.app.modules.selectcable.ui.SelectCableActivity
import com.litepayapp.app.modules.signupone.ui.SignUpOneActivity
import com.litepayapp.app.modules.transactionhistory.ui.TransactionHistoryActivity
import com.litepayapp.app.modules.upgradeone.ui.UpgradeOneDialog
import com.litepayapp.app.modules.walletsummary.ui.WalletSummaryActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeScreenActivity : BaseActivity<ActivityHomeScreenBinding>(R.layout.activity_home_screen) {
  private val viewModel: HomeScreenVM by viewModels<HomeScreenVM>()

  private val REQUEST_CODE_AIRTIME_ACTIVITY: Int = 820

  private val REQUEST_CODE_DATA_ACTIVITY: Int = 474

  private val REQUEST_CODE_ADD_MONEY_BOTTOMSHEET: Int = 358

  private val REQUEST_CODE_NOTIFICATION_ACTIVITY: Int = 555

  private val REQUEST_CODE_SELECT_CABLE_ACTIVITY: Int = 780

  private val REQUEST_CODE_BETTING_ACTIVITY: Int = 195

  private val REQUEST_CODE_ELECTRICITY_ACTIVITY: Int = 107

  private val REQUEST_CODE_EDUCATION_PIN_TWO_ACTIVITY: Int = 810

  private val REQUEST_CODE_WALLET_SUMMARY_ACTIVITY: Int = 976

  private val REQUEST_CODE_REFERALS_ACTIVITY: Int = 516

  private val REQUEST_CODE_TRANSACTION_HISTORY_ACTIVITY: Int = 440

  private val REQUEST_CODE_SIGN_UP_ONE_ACTIVITY: Int = 407

  private val REQUEST_CODE_UPGRADE_ONE_DIALOG: Int = 955

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homeScreenAdapter = HomeScreenAdapter(viewModel.homeScreenList.value?:mutableListOf())
    binding.recyclerHomeScreen.adapter = homeScreenAdapter
    homeScreenAdapter.setOnItemClickListener(
    object : HomeScreenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeScreenRowModel) {
        onClickRecyclerHomeScreen(view, position, item)
      }
    }
    )
    viewModel.homeScreenList.observe(this) {
      homeScreenAdapter.updateData(it)
    }
    binding.homeScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBiphone.setOnClickListener {
      val destIntent = AirtimeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_AIRTIME_ACTIVITY)
    }
    binding.frameBiphone.setOnClickListener {
      val destIntent = DataActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DATA_ACTIVITY)
    }
    binding.imageCalculator.setOnClickListener {
      val destFragment = AddMoneyBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, AddMoneyBottomsheet.TAG)
    }
    binding.imageVector.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_NOTIFICATION_ACTIVITY)
    }
    binding.btnArrowleft.setOnClickListener {
      val destIntent = SelectCableActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SELECT_CABLE_ACTIVITY)
    }
    binding.btnSearch.setOnClickListener {
      val destIntent = BettingActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_BETTING_ACTIVITY)
    }
    binding.btnClose.setOnClickListener {
      val destIntent = ElectricityActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ELECTRICITY_ACTIVITY)
    }
    binding.btnThumbsup.setOnClickListener {
      val destIntent = EducationPinTwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_EDUCATION_PIN_TWO_ACTIVITY)
    }
    binding.btnReply.setOnClickListener {
      val destIntent = WalletSummaryActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_WALLET_SUMMARY_ACTIVITY)
    }
    binding.imageMaximize.setOnClickListener {
      val destIntent = ReferalsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_REFERALS_ACTIVITY)
    }
    binding.btnClock.setOnClickListener {
      val destIntent = TransactionHistoryActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_TRANSACTION_HISTORY_ACTIVITY)
    }
    binding.imageLock.setOnClickListener {
      val destIntent = SignUpOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_ONE_ACTIVITY)
    }
  }

  fun onClickRecyclerHomeScreen(
    view: View,
    position: Int,
    item: HomeScreenRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowarrowright ->  {
        val destFragment = UpgradeOneDialog.getInstance(null)
        destFragment.show(this.supportFragmentManager, UpgradeOneDialog.TAG)
      }
    }
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_ACTIVITY"

  }
}
