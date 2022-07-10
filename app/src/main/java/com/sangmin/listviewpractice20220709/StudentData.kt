package com.sangmin.listviewpractice20220709

import java.io.Serializable

class StudentData (

    // 클래스의 맴버 변수
    val name : String,
    val birthYear : Int,
    val address : String

        ) : Serializable {

    fun getKoreanAge () : Int {
        val KoreanAge = 2022 - birthYear + 1
        return KoreanAge

    }

}