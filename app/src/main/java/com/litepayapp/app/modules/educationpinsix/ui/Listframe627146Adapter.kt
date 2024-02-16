package com.litepayapp.app.modules.educationpinsix.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListframe627146Binding
import com.litepayapp.app.modules.educationpinsix.`data`.model.Listframe627146RowModel
import kotlin.Int
import kotlin.collections.List

class Listframe627146Adapter(
  var list: List<Listframe627146RowModel>
) : RecyclerView.Adapter<Listframe627146Adapter.RowListframe627146VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListframe627146VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listframe627146,parent,false)
    return RowListframe627146VH(view)
  }

  override fun onBindViewHolder(holder: RowListframe627146VH, position: Int) {
    val listframe627146RowModel = Listframe627146RowModel()
    // TODO uncomment following line after integration with data source
    // val listframe627146RowModel = list[position]
    holder.binding.listframe627146RowModel = listframe627146RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listframe627146RowModel>) {
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
      item: Listframe627146RowModel
    ) {
    }
  }

  inner class RowListframe627146VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListframe627146Binding = RowListframe627146Binding.bind(itemView)
  }
}
