package com.example.myapplication.NesneTabanliProgramlama

//sınıfın başına data eklersek : veri tabanın üzerindeki sınıfları böyle yaparız

data class Yemekler(var id: Int, var ad: String,var fiyat: Int) {

    //constructor -- init metodu(fonksiyonu)
    // Bu sınftan nesne oluştuğunda çalışsın. diye bir şey istersek
    init {
        println("*******Nesne Oluştu*******")
    }



    fun bilgiAl(){
        println("--------------")
        println("Id:${id}")
        println("Ad:${ad}")
        println("Fiyat:${fiyat}")
    }
    //this : bulunduğu sınıfı temsil eder. Swift dilinde self kullanılır
    //super: Kaltım ilr bir üst sınıfı temsil eder







}