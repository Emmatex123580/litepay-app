package com.litepayapp.app.modules.signuptwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowSignUpTwoBinding
import com.litepayapp.app.modules.signuptwo.`data`.model.SignUpTwoRowModel
import kotlin.Int
import kotlin.collections.List

class SignUpTwoAdapter(
  var list: List<SignUpTwoRowModel>
) : RecyclerView.Adapter<SignUpTwoAdapter.RowSignUpTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSignUpTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sign_up_two,parent,false)
    return RowSignUpTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowSignUpTwoVH, position: Int) {
    val signUpTwoRowModel = SignUpTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val signUpTwoRowModel = list[position]
    holder.binding.signUpTwoRowModel = signUpTwoRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SignUpTwoRowModel>) {
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
      item: SignUpTwoRowModel
    ) {
    }
  }

  inner class RowSignUpTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSignUpTwoBinding = RowSignUpTwoBinding.bind(itemView)
  }
}
