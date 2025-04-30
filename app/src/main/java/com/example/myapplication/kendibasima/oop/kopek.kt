package com.example.myapplication.kendibasima.oop

class kopek: hayvan() {

    fun havla(){
        println("Köpek havladı")

    //this kelimesi bulunduğumuz sınıfa referans veriyor
    //super kelimesi kalıtım aldığımız sınıfa referans veriyor yani -> hayvan() bu sınıfa mesela 'super.sesCikar' dersek o fonskiyona erişim sağlanır
    }
    override fun sesCikar(){
        println("Köpek ses cıkardı")

        //hata veriyor 'override olmayınca' çünkü zaten böyle bir fonksiyona erişimin var kalıtım ile neden yine kullanıyorsun diyor bu yüzden override
        //override yazdık yine hata verdi şimdi sorun şu fonksiyonun başına 'open' anahtar kelimesi koyman lazım
    }
}