package com.example.myapplication.NesneTabanliProgramlama

fun main() {

    val f = fonksiyonlar()// f adında bir nesne yaptık burada

    //void
    f.selamla()


    //return
    val gelenSonuc = f.selamla2()//veri tarnsferi bu şekilde
    // fonksiyon string bir veri getirecek bir o veriyi "gelenSonuc değerine atadık"
    println("Gelen Sonuç : $gelenSonuc")

    //parametre kullanım
    f.selamla3("Tunahan")

    f.topla(10,12)//1.fonksiyon
    f.topla(10.0,13.0)//2.fonksiyon
    f.topla(12.0,20.0,30.0)//3.fonksiyon




}