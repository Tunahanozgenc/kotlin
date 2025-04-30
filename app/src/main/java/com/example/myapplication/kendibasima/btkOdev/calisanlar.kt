package com.example.myapplication.kendibasima.btkOdev

class calisanlar(val isim:String,maas:Int,var departman:String,var yas:Int) {

    private val _maas = maas//ilk maas'a farklı bir isim vermemek için alt tire(_) kullandık

    fun maasGoster(): Int {
        println("Maaş: $_maas")
        return _maas
    }
}
