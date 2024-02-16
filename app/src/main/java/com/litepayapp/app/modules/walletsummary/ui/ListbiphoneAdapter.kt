package com.litepayapp.app.modules.walletsummary.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListbiphoneBinding
import com.litepayapp.app.modules.walletsummary.`data`.model.ListbiphoneRowModel
import kotlin.Int
import kotlin.collections.List

class ListbiphoneAdapter(
  var list: List<ListbiphoneRowModel>
) : RecyclerView.Adapter<ListbiphoneAdapter.RowListbiphoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbiphoneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbiphone,parent,false)
    return RowListbiphoneVH(view)
  }

  override fun onBindViewHolder(holder: RowListbiphoneVH, position: Int) {
    val listbiphoneRowModel = ListbiphoneRowModel()
    // TODO uncomment following line after integration with data source
    // val listbiphoneRowModel = list[position]
    holder.binding.listbiphoneRowModel = listbiphoneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbiphoneRowModel>) {
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
      item: ListbiphoneRowModel
    ) {
    }
  }

  inner class RowListbiphoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbiphoneBinding = RowListbiphoneBinding.bind(itemView)
  }
}
