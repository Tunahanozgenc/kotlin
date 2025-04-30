package com.example.myapplication.kendibasima.oop

class sanatci(var isim:String, var yas:Int, val calgi:String) { //encapsulation

    fun sarkiSoyle(){
        println("Şu şarkıcı şarkı söyledi: ${isim}")
    }
    init {//init fonksiyonu her tanımladan önce çalıştırılır mesela veli diye bir kişi tanımlayınca ondan önce de çalışacak
        println("İnit çalıştırıldı")
    }
//init kullanım amacı bir işlem yapmadan önce eğer kesin çalıştırılması istenen bir şey varsa

//************************************************************************************************************-//
    //private: sadece o sınıf içinde kullanılır
    //public: her yerden erişim sağlanır başka bir dosyadan sınıftan
    //protected : bu dosya içinde kullanım başka bir fonksiyon olabilir mesela
    //internal : aynı modül içinde kullanım
    //** bizim için en çok kullanılan private ve public


    private var tur = "insan"//bunu değiştiremeyiz artık private

    fun turYazdir(){
        println(tur)
    }

    var gozRengi = "Mor"
        private set
        public get
    //bu da aynı şekilde değerini değiştirmeye izin vermiyor ama println() ile yazdırabiliriz









}