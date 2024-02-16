package com.litepayapp.app.modules.educationpinseven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListframe627147Binding
import com.litepayapp.app.modules.educationpinseven.`data`.model.Listframe627147RowModel
import kotlin.Int
import kotlin.collections.List

class Listframe627146Adapter(
  var list: List<Listframe627147RowModel>
) : RecyclerView.Adapter<Listframe627146Adapter.RowListframe627147VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListframe627147VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listframe627147,parent,false)
    return RowListframe627147VH(view)
  }

  override fun onBindViewHolder(holder: RowListframe627147VH, position: Int) {
    val listframe627147RowModel = Listframe627147RowModel()
    // TODO uncomment following line after integration with data source
    // val listframe627147RowModel = list[position]
    holder.binding.listframe627147RowModel = listframe627147RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listframe627147RowModel>) {
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
      item: Listframe627147RowModel
    ) {
    }
  }

  inner class RowListframe627147VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListframe627147Binding = RowListframe627147Binding.bind(itemView)
  }
}
