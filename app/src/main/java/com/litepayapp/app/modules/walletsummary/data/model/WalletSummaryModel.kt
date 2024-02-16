package com.litepayapp.app.modules.walletsummary.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class WalletSummaryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWalletBalance: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_wallet_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_0_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBonusBalance: String? = MyApp.getInstance().resources.getString(R.string.lbl_bonus_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_0_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddMoney: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_money)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWalletsummary: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_wallet_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionHis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_his)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhattaskwould: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_task_would)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPricing: String? = MyApp.getInstance().resources.getString(R.string.lbl_pricing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReferrals: String? = MyApp.getInstance().resources.getString(R.string.lbl_referrals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
