package com.litepayapp.app.modules.upgradetwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowUpgradeTwoBinding
import com.litepayapp.app.modules.upgradetwo.`data`.model.UpgradeTwoRowModel
import kotlin.Int
import kotlin.collections.List

class UpgradeTwoAdapter(
  var list: List<UpgradeTwoRowModel>
) : RecyclerView.Adapter<UpgradeTwoAdapter.RowUpgradeTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUpgradeTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_upgrade_two,parent,false)
    return RowUpgradeTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowUpgradeTwoVH, position: Int) {
    val upgradeTwoRowModel = UpgradeTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val upgradeTwoRowModel = list[position]
    holder.binding.upgradeTwoRowModel = upgradeTwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<UpgradeTwoRowModel>) {
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
      item: UpgradeTwoRowModel
    ) {
    }
  }

  inner class RowUpgradeTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowUpgradeTwoBinding = RowUpgradeTwoBinding.bind(itemView)
  }
}
