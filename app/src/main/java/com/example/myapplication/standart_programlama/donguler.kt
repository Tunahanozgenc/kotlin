package com.example.myapplication.standart_programlama

fun main() {

    //swift de 3 nokta ...
    for (i in 1..3){
        println("Döngü 1: $i")
    }
//10 ile 20 arasında 5 5 artış

    for (x in 10..20 step 5){
        //step 5 artış miktarıdır
        println("Döngü 2: $x")
    }
    for (a in 20 downTo 10 step 5){
        //downTo geriye sayım belirtir
        //20 ile 10 arasında 5 azalma
        println("Döngü 3: $a")
    }
    var sayac = 1
    while (sayac < 4){
        println("Döngü 4: $sayac")
        sayac= sayac+1 // sayac+=1 de olur sayac++ da olur
    }

}