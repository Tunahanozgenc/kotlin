package com.example.myapplication.kendibasima

fun main() {


    //listeler(list) arraylist

    val isimler = arrayListOf("Tunahan","Özgenç","Tuna","Ali")
    isimler.get(3)
    println(isimler[3])
    println(isimler.size)//eleman sayısı
    println(isimler.add("Yusuf"))//dizilerde olmayan şey sonradan eleman ekleme var
    isimler[3] = "Ahmet"
    println(isimler[3])
    isimler.removeAt(2)//2. indisteki elemanı sil
    isimler.remove("Tuna")//string olarak
    val karisikliste = arrayListOf(false,true,"Tunahan",2,3,5,6,78)
    val numara = arrayListOf<Int>()/*bunda boş olarak bırakabiliriz yani ya eleman ver ben türü anlayayım ya da bana türü ver boş bırak */
    val karisikListe= arrayListOf<Any>()//herhangi bir eleman türü demek



}