package com.litepayapp.app.modules.withdrawbonusfour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListframe627148Binding
import com.litepayapp.app.modules.withdrawbonusfour.`data`.model.Listframe627148RowModel
import kotlin.Int
import kotlin.collections.List

class Listframe627146Adapter(
  var list: List<Listframe627148RowModel>
) : RecyclerView.Adapter<Listframe627146Adapter.RowListframe627148VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListframe627148VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listframe627148,parent,false)
    return RowListframe627148VH(view)
  }

  override fun onBindViewHolder(holder: RowListframe627148VH, position: Int) {
    val listframe627148RowModel = Listframe627148RowModel()
    // TODO uncomment following line after integration with data source
    // val listframe627148RowModel = list[position]
    holder.binding.listframe627148RowModel = listframe627148RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listframe627148RowModel>) {
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
      item: Listframe627148RowModel
    ) {
    }
  }

  inner class RowListframe627148VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListframe627148Binding = RowListframe627148Binding.bind(itemView)
  }
}
