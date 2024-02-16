package com.litepayapp.app.modules.transactionhistory.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowListairtimeBinding
import com.litepayapp.app.modules.transactionhistory.`data`.model.ListairtimeRowModel
import kotlin.Int
import kotlin.collections.List

class ListairtimeAdapter(
  var list: List<ListairtimeRowModel>
) : RecyclerView.Adapter<ListairtimeAdapter.RowListairtimeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListairtimeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listairtime,parent,false)
    return RowListairtimeVH(view)
  }

  override fun onBindViewHolder(holder: RowListairtimeVH, position: Int) {
    val listairtimeRowModel = ListairtimeRowModel()
    // TODO uncomment following line after integration with data source
    // val listairtimeRowModel = list[position]
    holder.binding.listairtimeRowModel = listairtimeRowModel
  }

  override fun getItemCount(): Int = 14
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListairtimeRowModel>) {
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
      item: ListairtimeRowModel
    ) {
    }
  }

  inner class RowListairtimeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListairtimeBinding = RowListairtimeBinding.bind(itemView)
  }
}
