package com.litepayapp.app.modules.bettingone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowBettingOneBinding
import com.litepayapp.app.modules.bettingone.`data`.model.BettingOneRowModel
import kotlin.Int
import kotlin.collections.List

class BettingOneAdapter(
  var list: List<BettingOneRowModel>
) : RecyclerView.Adapter<BettingOneAdapter.RowBettingOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBettingOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_betting_one,parent,false)
    return RowBettingOneVH(view)
  }

  override fun onBindViewHolder(holder: RowBettingOneVH, position: Int) {
    val bettingOneRowModel = BettingOneRowModel()
    // TODO uncomment following line after integration with data source
    // val bettingOneRowModel = list[position]
    holder.binding.bettingOneRowModel = bettingOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BettingOneRowModel>) {
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
      item: BettingOneRowModel
    ) {
    }
  }

  inner class RowBettingOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBettingOneBinding = RowBettingOneBinding.bind(itemView)
  }
}
