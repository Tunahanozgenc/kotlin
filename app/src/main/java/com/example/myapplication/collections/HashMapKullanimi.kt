package com.example.myapplication.collections

fun main() {

    //HashMap JSON veri modeline benzemektedir
    //key value şeklinde :JSON
    //Map: swift dilinde dictionary
    //Shared Preferences ,DataStore,UserDefault(swift),benziyor

    val iller = HashMap<Int,String>()

    iller.put(16,"Bursa")
    iller[34] = "İstabul"
    iller[6] = "Ankara"
    println(iller)

    //güncelleme

    iller[16]="yeni Bursa"
    println(iller)

    println("boyut: ${iller.size}")//boyut

    for ((anahtar,deger)in iller){
        println("$anahtar -> $deger")
    }

    //silme

    iller.remove(34)
    println(iller)//istanbul silindi

    iller.clear()
    println()//tümü silindi





}