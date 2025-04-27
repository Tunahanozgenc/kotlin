package com.example.myapplication

import java.lang.Exception

fun main() {

    //1.Compile Error: Kodlama yaparken oluşur
    val sayi = 100
    //sayi =500 //bu hata

    //2.RunTime Error (Exceptions)
    val x = 10
    val y = 5 // 0 dersek çöker

    try {
        println("Sonuc : ${x/y} ")
        println("işlem tamamlandı")
    }catch (e:Exception){
        println("İkinci sayı sıfır olamaz")//bu şekilde hata varsa netleştirilir
    }




}