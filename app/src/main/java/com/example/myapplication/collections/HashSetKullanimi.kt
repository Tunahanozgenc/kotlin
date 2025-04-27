package com.example.myapplication.collections

fun main() {

    //Hashset
    //tanımlama

    //Any -> en üst sınıf demek
    //bütün türleri kapsar
    //java -> Object

    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)//sıralama çıktı da değişti rastgele olarak -> [Muz, Elma, Kiraz]

    meyveler.add("Elma")
    println(meyveler) //aynısını tekrar eklemedi-> [Muz, Elma, Kiraz]


    val y =meyveler.elementAt(2)
    println(y)

    println("boyut: ${meyveler.size}")




}