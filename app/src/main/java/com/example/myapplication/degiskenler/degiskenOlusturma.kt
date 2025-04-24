package com.example.myapplication.degiskenler

import kotlin.math.roundToInt

fun main() {
    println("merhaba dünya")
    var id = 1
    var a = 0
    var b = 0
    var isim = "Tunahan"
    var resim ="hello.png"
/*"val" değişmeyen değerler için var değişen değerler için "var" daha kullanışlı
 hafızada
 */

    println("id "+ id)//he iki şekilde de yazılır ama kullanılan 2. olan
    println("id $id")
    println(resim)
    println(isim)

    fun sum(a: Int,b:Int ): Int {
        return (a+1) * (b+2)
    }
    fun cikar(bir:Int,iki:Int){
        println("$bir + $iki toplam = ${bir + iki}")
    }
    println(sum(10,20))
    println(cikar(100,50))

    val x = 98.56
    val cevir =x.toInt()
    println(cevir)
    println(x)

    var yuvarlama = 99.95
    var yuvarlama1 = yuvarlama.roundToInt()
    println(yuvarlama1)

    val stringecevir = 85
    val metin =stringecevir.toString()//stringe çevirdik
    println(metin)

    var count : Int = 0
    if (count == 42) {
        println("I have the answer.")
    } else {
        println("The answer eludes me.")
    }
    var sonuc: Int = 10
    while (sonuc<=43) {
        if (sonuc == 43) {
            println("Değeriniz 43 $sonuc")
        } else {
            println("Lütfen değeri artırın $sonuc")
        }
        sonuc+=10
    }




}