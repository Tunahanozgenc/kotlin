package com.example.myapplication.kendibasima.btkOdev

fun main() {


    val tuna = calisanlar("Tunahan",9000000,"Yazılım",23)
    val veli = calisanlar("veli",200000,"resepsiyon",33)
    val osman = calisanlar("osman",30000,"temizlik",43)
    val yakup = calisanlar("yakup",60000,"havalandırma",53)
    val zeynep = calisanlar("zeynep",40000,"Yazılım",63)
    val betul = calisanlar("betul",80000,"Yazılım",73)
    val lale = calisanlar("lale",30000,"koşu",83)
    val esra = calisanlar("esra",20000,"atlama",93)
    val buket = calisanlar("buket",8000,"zıplama",13)
    val zeki = calisanlar("zeki",9000000,"küsme",113)

    println(tuna.isim)
    tuna.maasGoster()// değerini okuyamıyoruz ve değiştiremiyoruz istediğimiz de buydu zaten

    val calisanlarListesi= arrayListOf(tuna,veli,osman,yakup,zeynep,betul,lale,esra,buket,zeki)

    val filtreOlan = calisanlarListesi.filter { it.yas < 35  }.map { it.isim }

    val karmasikSoru = calisanlarListesi.filter { it.yas < 30 }.filter { it.departman == "Yazılım" }.map { it.maasGoster() }

    println(filtreOlan)
    println(karmasikSoru)




}