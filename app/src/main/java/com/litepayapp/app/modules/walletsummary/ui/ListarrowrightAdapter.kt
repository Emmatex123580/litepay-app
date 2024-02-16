package com.litepayapp.app.modules.walletsummary.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListarrowright1Binding
import com.litepayapp.app.modules.walletsummary.`data`.model.Listarright1RowModel
import kotlin.Int
import kotlin.collections.List

class ListarrowrightAdapter(
  var list: List<Listarright1RowModel>
) : RecyclerView.Adapter<ListarrowrightAdapter.RowListarrowright1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListarrowright1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listarrowright1,parent,false)
    return RowListarrowright1VH(view)
  }

  override fun onBindViewHolder(holder: RowListarrowright1VH, position: Int) {
    val listarright1RowModel = Listarright1RowModel()
    // TODO uncomment following line after integration with data source
    // val listarright1RowModel = list[position]
    holder.binding.listarright1RowModel = listarright1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listarright1RowModel>) {
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
      item: Listarright1RowModel
    ) {
    }
  }

  inner class RowListarrowright1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListarrowright1Binding = RowListarrowright1Binding.bind(itemView)
  }
}
