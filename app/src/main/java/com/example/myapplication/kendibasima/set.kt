package com.example.myapplication.kendibasima

fun main() {

    //set


    val ornekset= setOf<Int>()//diyip boş bırakabiliriz
    val ornekSet = setOf(10,20,30,40,80,90)//içine eleman koymak zorundayız
    println(ornekset.size)//boyut yazdırır
    ornekSet.first()

    val bosSetOrnegi = HashSet<String>()
    bosSetOrnegi.add("Ali")
    bosSetOrnegi.add("Tuna")
    bosSetOrnegi.add("Tunahan")

    bosSetOrnegi.forEach{
        println(it)
    }//set'inn içindekileri tek tek yazdırdı


}