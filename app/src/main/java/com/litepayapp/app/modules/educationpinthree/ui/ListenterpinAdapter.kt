package com.litepayapp.app.modules.educationpinthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListenterpinBinding
import com.litepayapp.app.modules.educationpinthree.`data`.model.ListenterpinRowModel
import kotlin.Int
import kotlin.collections.List

class ListenterpinAdapter(
  var list: List<ListenterpinRowModel>
) : RecyclerView.Adapter<ListenterpinAdapter.RowListenterpinVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListenterpinVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listenterpin,parent,false)
    return RowListenterpinVH(view)
  }

  override fun onBindViewHolder(holder: RowListenterpinVH, position: Int) {
    val listenterpinRowModel = ListenterpinRowModel()
    // TODO uncomment following line after integration with data source
    // val listenterpinRowModel = list[position]
    holder.binding.listenterpinRowModel = listenterpinRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListenterpinRowModel>) {
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
      item: ListenterpinRowModel
    ) {
    }
  }

  inner class RowListenterpinVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListenterpinBinding = RowListenterpinBinding.bind(itemView)
  }
}
