package com.litepayapp.app.modules.homescreenone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListarrowrightBinding
import com.litepayapp.app.modules.homescreenone.`data`.model.ListarrightRowModel
import kotlin.Int
import kotlin.collections.List

class ListarrowrightAdapter(
  var list: List<ListarrightRowModel>
) : RecyclerView.Adapter<ListarrowrightAdapter.RowListarrowrightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListarrowrightVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listarrowright,parent,false)
    return RowListarrowrightVH(view)
  }

  override fun onBindViewHolder(holder: RowListarrowrightVH, position: Int) {
    val listarrightRowModel = ListarrightRowModel()
    // TODO uncomment following line after integration with data source
    // val listarrightRowModel = list[position]
    holder.binding.listarrightRowModel = listarrightRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListarrightRowModel>) {
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
      item: ListarrightRowModel
    ) {
    }
  }

  inner class RowListarrowrightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListarrowrightBinding = RowListarrowrightBinding.bind(itemView)
  }
}
