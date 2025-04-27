package com.example.myapplication.kendibasima

fun main() {

    //diziler(btk)
    //diziler sabittir katı kural
    //baştan kapasite ister

    //dizi içinde val yaparsak içeriği değiştirme yapabiliriz
    //var yaprsak referansı da değiştirebiliriz

    val dizim = arrayOf("Tunahan","Özgenç","Tuna","Ali")//arrayOf dizilerde
    println(dizim[0])
    println(dizim[1])
    println(dizim.last())//son elemanı yazar
    println(dizim.first())//ilk elemanı yazdırır

    println(dizim.get(3))//3.indeksi getirir

    val karisikdizi= arrayOf(10,20,30,"Tuna",false,true)

    println(karisikdizi[2])
    println(karisikdizi.get(3))



}