package com.example.myapplication.NesneTabanliProgramlama

fun main() {
    //Nullabkle,Null Safety Optional(swift)
    //Genellikle mobil uygulama geliştirme dillerinde var
    //null,NaN,nil

    var mesaj : String? = null
    mesaj = "merhaba"//eğer bu olmazsa alttaki metod hata verir boş hatası


    //yöntem 1:
    //sorun yoksa çalışır,sorun varsa uygulama çöker
    println("Yöntem 1 :${mesaj?.uppercase()}")//bu kısımda soru işareti koyarsa çökmez

    //Yöntem 2:
    //Sorun yoksa çalışır sorun varsa uygulama çöker
    //çok emin oldğumuz kodlarda kullanabilriz
    println("Yöntem 2 :${mesaj!!.uppercase()}")

    //Yöntem 3:
    //null kontrol
    if (mesaj != null){
        println("Yöntem 3 :${mesaj.uppercase()}")
    }else{
        println("Değişkende null yer almaktadır")
    }


    //null kontrol
    mesaj?.let {
        println("Yöntem 4 :${mesaj.uppercase()}")
    }

    //lateinit: sonradan değer gireceim demek
    lateinit var info: String //bu şekilde bırakınca sonradan doldurmak için söz veriyoruz


}