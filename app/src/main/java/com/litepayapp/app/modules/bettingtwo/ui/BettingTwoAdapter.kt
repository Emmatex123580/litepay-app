package com.litepayapp.app.modules.bettingtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowBettingTwoBinding
import com.litepayapp.app.modules.bettingtwo.`data`.model.BettingTwoRowModel
import kotlin.Int
import kotlin.collections.List

class BettingTwoAdapter(
  var list: List<BettingTwoRowModel>
) : RecyclerView.Adapter<BettingTwoAdapter.RowBettingTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBettingTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_betting_two,parent,false)
    return RowBettingTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowBettingTwoVH, position: Int) {
    val bettingTwoRowModel = BettingTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val bettingTwoRowModel = list[position]
    holder.binding.bettingTwoRowModel = bettingTwoRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BettingTwoRowModel>) {
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
      item: BettingTwoRowModel
    ) {
    }
  }

  inner class RowBettingTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBettingTwoBinding = RowBettingTwoBinding.bind(itemView)
  }
}
