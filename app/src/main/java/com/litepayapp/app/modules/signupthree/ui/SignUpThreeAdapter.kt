package com.litepayapp.app.modules.signupthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.litepayapp.app.R
import com.litepayapp.app.databinding.RowSignUpThreeBinding
import com.litepayapp.app.modules.signupthree.`data`.model.SignUpThreeRowModel
import kotlin.Int
import kotlin.collections.List

class SignUpThreeAdapter(
  var list: List<SignUpThreeRowModel>
) : RecyclerView.Adapter<SignUpThreeAdapter.RowSignUpThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSignUpThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sign_up_three,parent,false)
    return RowSignUpThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowSignUpThreeVH, position: Int) {
    val signUpThreeRowModel = SignUpThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val signUpThreeRowModel = list[position]
    holder.binding.signUpThreeRowModel = signUpThreeRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SignUpThreeRowModel>) {
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
      item: SignUpThreeRowModel
    ) {
    }
  }

  inner class RowSignUpThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSignUpThreeBinding = RowSignUpThreeBinding.bind(itemView)
  }
}
