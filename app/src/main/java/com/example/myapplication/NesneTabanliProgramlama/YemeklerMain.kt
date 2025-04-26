package com.example.myapplication.NesneTabanliProgramlama

fun main() {


    val y1= Yemekler(100,"kofte",249)
    //val durumu değerlerle alakalı değil sadece y1=y3 şeklinde nesne ataması olmaz

    //değer okuma
    println("--------------")
    println("Id:${y1.id}")
    println("Ad:${y1.ad}")
    println("Fiyat:${y1.fiyat}")
    //bunun yerine
    y1.bilgiAl()//bu


    //değer atama/değiştirme
    y1.fiyat = 350// 249 fiyatı 350 oldu
    println("--------------")
    println("Id:${y1.id}")
    println("Ad:${y1.ad}")
    println("Fiyat:${y1.fiyat}")


    println("--------------")
    val y2 = Yemekler(200,"Baklava",300)
    println("Id:${y2.id}")
    println("Ad:${y2.ad}")
    println("Fiyat:${y2.fiyat}")
    //bunun yerine
    y2.bilgiAl()
    //bu

    //değer atama/değiştirme
    y2.ad = "Kadayıf"//baklava oldu kadayıf
    println("--------------")
    println("Id:${y2.id}")
    println("Ad:${y2.ad}")
    println("Fiyat:${y2.fiyat}")





}