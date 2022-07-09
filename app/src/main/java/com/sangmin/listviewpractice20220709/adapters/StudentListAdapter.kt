package com.sangmin.listviewpractice20220709.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.sangmin.listviewpractice20220709.R
import com.sangmin.listviewpractice20220709.StudentData

class StudentListAdapter(
    val mContext : Context,  // 화면
    val resId : Int,         //
    val mList : ArrayList<StudentData>

) : ArrayAdapter<StudentData>(mContext, resId, mList) {
    // 한칸의 xml에 나타날 모양을 커스터마이징
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null) // resId 들고 와도 됩니다
        }
        val row = tempRow!!

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)




//      mList[position] => mList의 position번쨰 있는 StudentData
        nameTxt.text = mList[position].name
//        도전과제 ==> String을 가공(${}활용) => 나이부분의 값이 (~~세) 로 표시되도록 가공
//        힌트: 1. 안쪽에서 Text를 던지는 것
        ageTxt.text = mList[position].birthYear.toString()
        addressTxt.text = mList[position].address



        return row
    }



}