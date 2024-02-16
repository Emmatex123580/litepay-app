package com.litepayapp.app.modules.bettingthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowBettingThreeBinding
import com.litepayapp.app.modules.bettingthree.`data`.model.BettingThreeRowModel
import kotlin.Int
import kotlin.collections.List

class BettingThreeAdapter(
  var list: List<BettingThreeRowModel>
) : RecyclerView.Adapter<BettingThreeAdapter.RowBettingThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBettingThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_betting_three,parent,false)
    return RowBettingThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowBettingThreeVH, position: Int) {
    val bettingThreeRowModel = BettingThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val bettingThreeRowModel = list[position]
    holder.binding.bettingThreeRowModel = bettingThreeRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BettingThreeRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: BettingThreeRowModel
    ) {
    }
  }

  inner class RowBettingThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBettingThreeBinding = RowBettingThreeBinding.bind(itemView)
  }
}
