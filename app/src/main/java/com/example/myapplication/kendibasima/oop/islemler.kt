package com.example.myapplication.kendibasima.oop

class islemler {//polymorphism: aynı ada sahip birden çok işlem tipi en basit canlandırma örneği

    fun cikarma(x:Int,y:Int):Int{
        return x-y
    }

    fun cikarma(x:Int,y:Int,c:Int):Int{
        return x-(y+c)
    }

    fun cikarma(x:Int,y:Int,c:Int,v:Int):Int{
        return x-(y+c+v)
    }
    //aslında hepsi çıkarma işlemi 'cikarma' fonksiyonu ama içleri farklı bu polymorphism oluyor oopMain dosyasında çalıştıralım sonuca bakalım



}