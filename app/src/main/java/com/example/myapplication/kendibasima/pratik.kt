package com.example.myapplication.kendibasima

fun main() {
    var a = 10
    var b = 20
    println("a ve b 'nin değerleri toplamı =${a+b}")

    print("Lütfen adınızı giriniz: ")
    var isim = readln()
    println("Girilen isim : $isim")
    print("Lütfen yaşınızı girin:")
    var yas = readln().toInt()
    println("Girilen yaş değeri: $yas")

    val dizi1 = Array<Int>(10){0}
    val dizi2 = Array<String>(9){""}
    val dizi3 = Array<Char>(10){'A'}
    val dizi4 = Array<Double>(10){1.0}

    dizi1.set(5,10)
    println("dizi değeri  $dizi1[5]")


    print("Lütfen bir sayı değeri giriniz: ")

    var sayi = readln().toInt()
    if (yas >sayi){
        println("Girdiğiniz sayı yaş değerinden küçüktür")
    }else{
        println("Girdiğiniz sayı yaş değerinden büyüktür")
    }

}