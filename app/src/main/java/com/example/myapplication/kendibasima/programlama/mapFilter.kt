package com.example.myapplication.kendibasima.programlama

//map ve filter
fun main() {

    val listem = arrayOf(1,3,5,7,9,11,13,15,17,19)

    val kucukSayilar = listem.filter { num ->  num < 10 }

    for (numara in kucukSayilar){//uzun versiyon
        println(numara)
    }
    val yeniKucukSayilarlistesi = listem.filter { it<6 }//kısa versiyon


    //map

    val karesiAlinanSayilar = listem.map { it*it }///kısa versiyon
    for (numara in karesiAlinanSayilar){//uzun versiyon
        println(numara)
    }





}





