package com.litepayapp.app.modules.transactiondetails.`data`.model

import com.litepayapp.app.R
import com.litepayapp.app.appcomponents.di.MyApp
import kotlin.String

data class TransactionDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionDet: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_det)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMTN: String? = MyApp.getInstance().resources.getString(R.string.lbl_mtn)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtN50000: String? = MyApp.getInstance().resources.getString(R.string.lbl_n500_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccessful: String? = MyApp.getInstance().resources.getString(R.string.lbl_successful)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecipientMobil: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recipient_mobil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt08059941818: String? = MyApp.getInstance().resources.getString(R.string.lbl_08059941818)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionTyp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_typ)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtime: String? = MyApp.getInstance().resources.getString(R.string.lbl_airtime)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalance: String? = MyApp.getInstance().resources.getString(R.string.lbl_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionNum: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_num)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt856709851267431: String? =
      MyApp.getInstance().resources.getString(R.string.msg_856709851267431)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionDat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_dat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_12th_jan_2024)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionTim: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_tim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt122033: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_20_33)

)
