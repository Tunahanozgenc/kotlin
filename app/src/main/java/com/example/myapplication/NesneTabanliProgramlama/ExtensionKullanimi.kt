package com.example.myapplication.NesneTabanliProgramlama

fun main() {
    val sonuc = 5 carp 2 // carp(2) infix eklenince bu şekilde olur
    println(sonuc)
}


infix fun Int.carp(sayi:Int): Int{ //başına infix eklersek
    return this*sayi //this(Int)
}

