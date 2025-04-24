package com.example.myapplication.standart_programlama

fun main() {

    print("Lütfen yas değeri giriniz:")
    val yas = readln().toInt()

    if(yas >= 18){
        println("Büyüksünüz")
    }else{
        println("Küçüksünüz")
    }

    val ka ="admin"
    val s =123456

    if(ka == "admin" && s == 123456){
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş")
    }
    val sayi = 10
    if (sayi == 9 || sayi == 10){
        println("Sayı 9 veya 10'dur")
    }else{
        println("Sayı 9 veya 10 değildir")
    }

    // When diğer dillerde Switch yapısında

    val number = 1

    when(number){
        1-> println("Sayı 1'dir")
        2-> println("Sayı 2'dir")
        3-> println("Sayı 3'tür")
        else -> println("Tanımlanmayan sayı")
    }






}