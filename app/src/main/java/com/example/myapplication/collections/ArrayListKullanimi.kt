package com.example.myapplication.collections

fun main() {

    //tanımlama
    val meyveler = ArrayList<String>()


    //veri ekleme
    meyveler.add("elma")//0. indekse
    meyveler.add("armut")//1. indekse
    meyveler.add("çilek")//2.indekse
    println(meyveler)


    //güncelleme
    meyveler[1] = "Muz" // 1.indekse gider armut gider muz gelir
    println(meyveler)


    //insert : istediğimiz indekse
    meyveler.add(1,"Portakal") //kaydırdı -> [elma, Portakal, Muz, çilek]
    println(meyveler)

    //okuma
    val m =meyveler.get(3)//değişkene atama da yapabiliriz
    println(meyveler.get(3))//3.indeksi getirir
    println(meyveler[3])


    //boyut

    println(meyveler.size)//4 eleman var

    //terse çevirme
    meyveler.reverse()
    println(meyveler)


    for(meyve in meyveler){//sadece içerik aldık
        println("sonuc: $meyve")
    }


    meyveler.removeAt(1)
    println(meyveler)

    //silme
    meyveler.clear()
    println(meyveler)


    //mutable diziler okunabilir ve yazılabilir










}