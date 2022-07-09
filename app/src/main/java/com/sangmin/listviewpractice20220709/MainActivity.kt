package com.sangmin.listviewpractice20220709

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sangmin.listviewpractice20220709.adapters.StudentListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // ArrayList 목록 공간을 만들어주고
    val mStudentList = ArrayList<StudentData>()

//    어댑터 클래스 맴버변수화
    lateinit var mStudentListAdapter : StudentListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 학생 데이터 (더미 데이터 생성)
        // StudentData(~~~)라는 학생 데이터 객체들을 생성
        // ArrayList에 추가(mStudentList.add)
        mStudentList.add(StudentData("박상민",1995,"서울시 동대문구"))
        mStudentList.add(StudentData("박상민2",1995,"서울시 동대문구"))
        mStudentList.add(StudentData("박상민3",1995,"서울시 동대문구"))
        mStudentList.add(StudentData("박상민4",1995,"서울시 동대문구"))
        mStudentList.add(StudentData("박상민5",1995,"서울시 동대문구"))
        mStudentList.add(StudentData("박상민6",1995,"서울시 동대문구"))
        mStudentList.add(StudentData("박상민7",1995,"서울시 동대문구"))
        mStudentList.add(StudentData("박상민8",1995,"서울시 동대문구"))
        mStudentList.add(StudentData("박상민9",1995,"서울시 동대문구"))
        mStudentList.add(StudentData("박상민10",1995,"서울시 동대문구"))



//        실제 어댑터와 ArrayList를 연결(어댑터 클래스를 객체화)
        mStudentListAdapter = StudentListAdapter(this, R.layout.student_list_item, mStudentList)
//       엑티비티 화면의 ListView 태그와 adapter를 연결
        mainListView.adapter = mStudentListAdapter


    }
}