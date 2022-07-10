package com.sangmin.listviewpractice20220709

class StudentData (

    // 클래스의 맴버 변수
    val name : String,
    val birthYear : Int,
    val address : String

        ){

    fun getKoreanAge () : Int {
        val KoreanAge = 2022 - birthYear + 1
        return KoreanAge

    }

}