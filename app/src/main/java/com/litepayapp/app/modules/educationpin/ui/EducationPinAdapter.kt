package com.litepayapp.app.modules.educationpin.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowEducationPinBinding
import com.litepayapp.app.modules.educationpin.`data`.model.EducationPinRowModel
import kotlin.Int
import kotlin.collections.List

class EducationPinAdapter(
  var list: List<EducationPinRowModel>
) : RecyclerView.Adapter<EducationPinAdapter.RowEducationPinVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEducationPinVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_education_pin,parent,false)
    return RowEducationPinVH(view)
  }

  override fun onBindViewHolder(holder: RowEducationPinVH, position: Int) {
    val educationPinRowModel = EducationPinRowModel()
    // TODO uncomment following line after integration with data source
    // val educationPinRowModel = list[position]
    holder.binding.educationPinRowModel = educationPinRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EducationPinRowModel>) {
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
      item: EducationPinRowModel
    ) {
    }
  }

  inner class RowEducationPinVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEducationPinBinding = RowEducationPinBinding.bind(itemView)
  }
}
