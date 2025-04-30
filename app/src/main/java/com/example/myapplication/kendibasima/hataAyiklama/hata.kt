package com.example.myapplication.kendibasima.hataAyiklama

import java.lang.Exception

fun main() {


    val x = 10
    val y = 0 //0 dersek hata verecek istediğimiz de o zaten
    try {
        println("Sonuc : ${x/y} ")
        println("işlem tamamlandı")
    }catch (e: Exception){
        println("İkinci sayı sıfır olamaz")//bu şekilde hata varsa netleştirilir
    }


}