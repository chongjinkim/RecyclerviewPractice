package com.nepplus.recyclerviewpractice.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nepplus.recyclerviewpractice.R
import com.nepplus.recyclerviewpractice.model.MyModel
import com.nepplus.recyclerviewpractice.viwholder.MyViewHolder

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {

    private var modelList = ArrayList<MyModel>()

    //뷰홀더가 생성 되었을 때
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_recycler_item, parent, false))
    }
    //목록의 아이템수
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(this.modelList[position])
    }
    //뷰와 뷰홀더가 묶였을 때
    override fun getItemCount(): Int {
        return 5
    }

    fun submitList(modelList : ArrayList<MyModel>){
        this.modelList = modelList
    }
}