package com.litepayapp.app.modules.withdrawbonussix.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListservices1Binding
import com.litepayapp.app.modules.withdrawbonussix.`data`.model.Listservices1RowModel
import kotlin.Int
import kotlin.collections.List

class ListservicesAdapter(
  var list: List<Listservices1RowModel>
) : RecyclerView.Adapter<ListservicesAdapter.RowListservices1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListservices1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listservices1,parent,false)
    return RowListservices1VH(view)
  }

  override fun onBindViewHolder(holder: RowListservices1VH, position: Int) {
    val listservices1RowModel = Listservices1RowModel()
    // TODO uncomment following line after integration with data source
    // val listservices1RowModel = list[position]
    holder.binding.listservices1RowModel = listservices1RowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listservices1RowModel>) {
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
      item: Listservices1RowModel
    ) {
    }
  }

  inner class RowListservices1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListservices1Binding = RowListservices1Binding.bind(itemView)
  }
}
