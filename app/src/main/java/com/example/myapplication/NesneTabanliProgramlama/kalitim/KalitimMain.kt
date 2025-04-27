package com.example.myapplication.NesneTabanliProgramlama.kalitim

fun main() {
    val hayvan = hayvan()
    val memeli = memeli()
    val kedi = kedi()
    val kopek= kopek()

    hayvan.sesCikar()//kalıtım çalışmadı kendi metodu zaten
    memeli.sesCikar()//kendinde yok ve üst sınıfın metoduna erişiyorsa kalıtım
    kedi.sesCikar()//
    kopek.sesCikar()

}