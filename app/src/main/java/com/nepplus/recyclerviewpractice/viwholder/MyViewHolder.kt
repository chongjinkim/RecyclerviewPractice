package com.nepplus.recyclerviewpractice.viwholder

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nepplus.recyclerviewpractice.App
import com.nepplus.recyclerviewpractice.model.MyModel
import kotlinx.android.synthetic.main.layout_recycler_item.view.*

//커스텀 뷰홀더
class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var Tag : String = "태그"
//뷰홀더 밖에서 접근 안되게 한다.
    private val clubNameTxt = itemView.clubNameTxt
    private val clubImg = itemView.clubImg

    //기본 생성자
    init {
        Log.d(Tag, "MyViewHolder - init() caller")
    }

    //데이터와 뷰를 묶는다.
    fun bind(myModel: MyModel){
        Log.d(Tag, "MyViewHolder - bind() caller")
        clubNameTxt.text = myModel.name
        Glide.with(App.instance).load(myModel.profileimg).into(clubImg)

    }

}