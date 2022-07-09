package com.sangmin.listviewpractice20220709

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    // ArrayList 목록 공간을 만들어주고
    val mStudentList = ArrayList<StudentData>()
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



    }
}