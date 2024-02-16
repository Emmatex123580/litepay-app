package com.litepayapp.app.modules.withdrawbonusfive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListservicesBinding
import com.litepayapp.app.modules.withdrawbonusfive.`data`.model.ListservicesRowModel
import kotlin.Int
import kotlin.collections.List

class ListservicesAdapter(
  var list: List<ListservicesRowModel>
) : RecyclerView.Adapter<ListservicesAdapter.RowListservicesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListservicesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listservices,parent,false)
    return RowListservicesVH(view)
  }

  override fun onBindViewHolder(holder: RowListservicesVH, position: Int) {
    val listservicesRowModel = ListservicesRowModel()
    // TODO uncomment following line after integration with data source
    // val listservicesRowModel = list[position]
    holder.binding.listservicesRowModel = listservicesRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListservicesRowModel>) {
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
      item: ListservicesRowModel
    ) {
    }
  }

  inner class RowListservicesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListservicesBinding = RowListservicesBinding.bind(itemView)
  }
}
