package com.litepayapp.app.modules.homescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowHomeScreenBinding
import com.litepayapp.app.modules.homescreen.`data`.model.HomeScreenRowModel
import kotlin.Int
import kotlin.collections.List

class HomeScreenAdapter(
  var list: List<HomeScreenRowModel>
) : RecyclerView.Adapter<HomeScreenAdapter.RowHomeScreenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeScreenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_screen,parent,false)
    return RowHomeScreenVH(view)
  }

  override fun onBindViewHolder(holder: RowHomeScreenVH, position: Int) {
    val homeScreenRowModel = HomeScreenRowModel()
    // TODO uncomment following line after integration with data source
    // val homeScreenRowModel = list[position]
    holder.binding.homeScreenRowModel = homeScreenRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeScreenRowModel>) {
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
      item: HomeScreenRowModel
    ) {
    }
  }

  inner class RowHomeScreenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomeScreenBinding = RowHomeScreenBinding.bind(itemView)
    init {
      binding.linearRowarrowright.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HomeScreenRowModel())
      }
    }
  }
}
