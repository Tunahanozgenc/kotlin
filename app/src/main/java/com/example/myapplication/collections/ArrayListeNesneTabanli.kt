package com.example.myapplication.collections

fun main() {

    val f1 = Filmler( 1,"interstellar",50)
    val f2 = Filmler( 2,"baba",150)
    val f3 = Filmler( 3,"aslan kral",70)


    val filmlerListesi = ArrayList<Filmler>()

    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)


    for (film in filmlerListesi){
        println("${film.id}:${film.ad} ${film.fiyat}TL")
    }




    //sıralama /sorting
    println("----Fiyata göre artan-----")

    println("Fiyatı artan sıralama:")
    val siralama1 = filmlerListesi.sortedWith(compareBy { it.fiyat })//it f1 f2 f3 nesnesi anlamında
    for (film in siralama1){
        println("${film.id}: ${film.ad} ${film.fiyat}")//artan şekilde sıraladı
    }

    println("fiyatı azalan liste:")
    val siralama2 = filmlerListesi.sortedWith(compareByDescending { it.fiyat })
    for (film in siralama2){
        println("${film.id}: ${film.ad} ${film.fiyat}")//artan şekilde sıraladı
    }


    //filtreleme
    println("------filtreleme--------")
    val filtreleme1 = filmlerListesi.filter { it.fiyat > 60 }// fiyatı 60 üstü olanalrı getirecek

    for (film in filtreleme1){
        println("${film.id}: ${film.ad} ${film.fiyat}")//artan şekilde sıraladı
    }

    println("------filtreleme 2--------")


    val filtreleme2 = filmlerListesi.filter { it.ad.contains("ba")}//içinde ba olanları alır
    for (film in filtreleme2){
        println("${film.id}: ${film.ad} ${film.fiyat}")
    }





}