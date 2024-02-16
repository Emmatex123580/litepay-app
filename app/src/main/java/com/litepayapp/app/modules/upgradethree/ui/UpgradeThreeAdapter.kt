package com.litepayapp.app.modules.upgradethree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowUpgradeThreeBinding
import com.litepayapp.app.modules.upgradethree.`data`.model.UpgradeThreeRowModel
import kotlin.Int
import kotlin.collections.List

class UpgradeThreeAdapter(
  var list: List<UpgradeThreeRowModel>
) : RecyclerView.Adapter<UpgradeThreeAdapter.RowUpgradeThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUpgradeThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_upgrade_three,parent,false)
    return RowUpgradeThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowUpgradeThreeVH, position: Int) {
    val upgradeThreeRowModel = UpgradeThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val upgradeThreeRowModel = list[position]
    holder.binding.upgradeThreeRowModel = upgradeThreeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<UpgradeThreeRowModel>) {
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
      item: UpgradeThreeRowModel
    ) {
    }
  }

  inner class RowUpgradeThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowUpgradeThreeBinding = RowUpgradeThreeBinding.bind(itemView)
  }
}
