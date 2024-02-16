package com.litepayapp.app.modules.betting.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowBettingBinding
import com.litepayapp.app.modules.betting.`data`.model.BettingRowModel
import kotlin.Int
import kotlin.collections.List

class BettingAdapter(
  var list: List<BettingRowModel>
) : RecyclerView.Adapter<BettingAdapter.RowBettingVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBettingVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_betting,parent,false)
    return RowBettingVH(view)
  }

  override fun onBindViewHolder(holder: RowBettingVH, position: Int) {
    val bettingRowModel = BettingRowModel()
    // TODO uncomment following line after integration with data source
    // val bettingRowModel = list[position]
    holder.binding.bettingRowModel = bettingRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BettingRowModel>) {
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
      item: BettingRowModel
    ) {
    }
  }

  inner class RowBettingVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBettingBinding = RowBettingBinding.bind(itemView)
  }
}
