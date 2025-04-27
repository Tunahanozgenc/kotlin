package com.example.myapplication.kendibasima

fun main() {

    //map - hashmap
    //anahtar - değer eşleşmesi
    //sözlük gibi (python)

    val yemekKaloriMapi = hashMapOf<String, Int>()//anahtar-string değer-Int
    yemekKaloriMapi.put("Elma",100)//içine veri eklemek için
    yemekKaloriMapi.put("Armut",150)
    yemekKaloriMapi.put("Çilek",200)

    println(yemekKaloriMapi.get("Armut"))
    yemekKaloriMapi.put("elma",200)//elma zaten averdı üzerine yazdı



}