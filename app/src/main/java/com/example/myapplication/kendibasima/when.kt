package com.example.myapplication.kendibasima

fun main() {
    // if else ile yapılabilr ama çok if else olmasın diye
    //veya menü yaparken

    val not= 0
    var notString = ""

    when(not){
        0-> notString ="Kötü"
        1-> notString = "orta"
        2-> notString = "iyi"
        else -> notString = "böyle not yok"
    }
println(notString)

}