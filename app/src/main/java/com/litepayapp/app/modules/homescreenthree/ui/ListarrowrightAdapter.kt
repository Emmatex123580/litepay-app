package com.litepayapp.app.modules.homescreenthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListarrowright2Binding
import com.litepayapp.app.modules.homescreenthree.`data`.model.Listarright2RowModel
import kotlin.Int
import kotlin.collections.List

class ListarrowrightAdapter(
  var list: List<Listarright2RowModel>
) : RecyclerView.Adapter<ListarrowrightAdapter.RowListarrowright2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListarrowright2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listarrowright2,parent,false)
    return RowListarrowright2VH(view)
  }

  override fun onBindViewHolder(holder: RowListarrowright2VH, position: Int) {
    val listarright2RowModel = Listarright2RowModel()
    // TODO uncomment following line after integration with data source
    // val listarright2RowModel = list[position]
    holder.binding.listarright2RowModel = listarright2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listarright2RowModel>) {
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
      item: Listarright2RowModel
    ) {
    }
  }

  inner class RowListarrowright2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListarrowright2Binding = RowListarrowright2Binding.bind(itemView)
  }
}
