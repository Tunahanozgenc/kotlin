package com.example.myapplication.NesneTabanliProgramlama

class fonksiyonlar {
    //void /sadece işlem yapan
    fun selamla(){//Swift dilinde func
        val sonuc = "Merhaba Tunahan"
        println(sonuc)
    }

    //return - hem işlem yapan hem veri transferi yapan
    fun selamla2():String{ //geri döndürülecek verinin türü
        val sonuc = "Merhaba Tunahan"
        return sonuc
    }

    //parametre
    fun selamla3(isim : String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //Overloading:
    //Bir sınıf içerisinde aynı isimde fonksiyonları tekrar kullanmak.
    fun topla(sayi1:Int,sayi2:Int){
        println("Toplama : ${sayi1+sayi2}")
    }

    //hata aldık ama düzeltirsek ancak overloading olur
    //türlerini değiştir bari de hata gitsin
    fun topla(sayi1:Double,sayi2:Double){
        println("Toplama : ${sayi1+sayi2}")
    }
    //veya fazladan parametre gir o zaman da düzelir
    fun topla(sayi1:Double, sayi2:Double, sayi3: Double){
        println("Toplama : ${sayi1+sayi2+sayi3}")
    }





}
