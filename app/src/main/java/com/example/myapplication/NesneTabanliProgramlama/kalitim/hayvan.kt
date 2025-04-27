package com.example.myapplication.NesneTabanliProgramlama.kalitim

open class hayvan { //open demek özellik aktaran demek
    open fun sesCikar(){//alt sınıflara aktarabilmek için open kullandık
        println("ses çıkar")//super: kalıtım ile üst sınıfı temsil eder memeli sınıfını temsil eder
    }
}