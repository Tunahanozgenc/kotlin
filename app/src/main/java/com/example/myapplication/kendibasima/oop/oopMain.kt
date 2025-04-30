package com.example.myapplication.kendibasima.oop

fun main() {

    var tuna= sanatci("tunahan",13,"gitar")
    var veli =sanatci("veli",19,"flüt")

    tuna.sarkiSoyle()
    veli.sarkiSoyle()

    //tuna.calgi: burada buna erişim yok aynı şekilde yaşa da erişim yok 'val' ya da 'var' ile belirtitlmediği için görüntülenmiyor
    tuna.calgi//iç değeri değiştirlmiyor çünkü 'val' olarak yazıldı
    tuna.turYazdir()
    tuna.yas = 25//burada en başta yas'a erişim yoktu ama şimdi 'var' olarak tanımladık ve erişim var hatta değeri değiştirebiliriz bile
    //tuna.tur = "Kedi"// bu çalışmaz hatta tur değişkeni görünmüyor bile
/*private olan değişkenimiz vardı 'tur' onu görebilmek için fonksiyon yazmıştık bu fonksiyon sayesinde içindeki değeri değiştirmeden kullanabiliyoruz */



    //kalıtım(inheritance)


    var muhtesemkahraman = MuhtesemKahraman("batman","")

    muhtesemkahraman.kos()//bu mesela MuhtesemKahraman sınıfında yoktu kahraman sınıfından kalııtm alınca ister istemez buna erişim sağladık
    //muhtesemkahraman.isim ="flash" şeklinde bir değiştirme MÜMKÜN DEĞİL sadece ERİŞİM izni var NEDENİ 'val' olarak tanımlamıştık isim değişkenini
    println(muhtesemkahraman.isim)//batman çıktısı aldık


    //polymorphism*//*/*/*/*/*/*/*/*/


    var islem = islemler()


    //statik polymorphism*/**/*/*///*/*

    println(islem.cikarma(10,2))
    println(islem.cikarma(10,2,3))
    println( islem.cikarma(10,2,3,2))
//aslında hepsi çıkarkma işlemi ama içlerinde aldıkları parametre sayısı farklı bu polymorphism oluyor



    //dinamik polymorphism*/*/*/*/*/*/*/*/*/*/*

    val kedi = hayvan()
    val kopek = kopek()
    val ornekDizi = arrayOf(kedi,kopek)
    ornekDizi.forEach {
        it.sesCikar()
    }



    //Abstraction
    //abstraction class, interface


    //val insan = insan() //soyut sınıftan obje oluşturulmaz!!!!!!













}