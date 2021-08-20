package com.nepplus.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.nepplus.recyclerviewpractice.adapter.MyAdapter
import com.nepplus.recyclerviewpractice.model.MyModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    val tag : String = "로그"

    //데이터를 담을 그릇 좀 배열
    var modelList = ArrayList<MyModel>()

    private lateinit var mRecyclerAdapter : MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(tag, "MainActivity - onCreate() called")

        Log.d(tag, "MainActivity - this.model.size : ${this.modelList.size}")

       for(i in 1..10){
           var myModel = MyModel(name = "레알마드리드 ${i}", profileimg = "https://www.kyeonggi.com/news/photo/201901/2039613_837397_48.jpg")

           this.modelList.add(myModel)
       }

        //어댑터 인스턴스 생성
        mRecyclerAdapter = MyAdapter()
        mRecyclerAdapter.submitList(this.modelList)

        //리사이클러뷰 설정
        myRecycleView.apply {
            //리사이클러뷰 설정
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            adapter = mRecyclerAdapter
        }
    }
}