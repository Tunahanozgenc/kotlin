package com.example.myapplication.odevler

fun main() {

    print("Lütfen hesaplanması gereken dereceyi giriniz:")
    val derece = readln().toDouble()
    var sonuc = dereceHesap(derece)
    println("$sonuc Fahrenhiet")

    println("---------Kenar hesaplama sorusu----------")

    print("Lütfen Uzun Kenar değerini giriniz: ")
    var uzunKenar = readln().toDouble()
    print("Lütfen Kısa Kenar değerini giriniz: ")
    var kisaKenar = readln().toDouble()
    var sonuc1 = kenarHesap(uzunKenar,kisaKenar)
    println("Dikdörtgen Alanı : $sonuc1")

    println("---------Faktöriyel hesaplama sorusu----------")

    print("Lütfen faktöriyeli hesaplanacak sayıyı giriniz: ")
    var factSayi = readln().toDouble()
    var sonuc2 = factHesap(factSayi)
    println("Faktöriyel değeri :$sonuc2")

    println("---------Girilen Kelime harf hesaplama sorusu----------")

    print("Lütfen bir kelime giriniz: ")
    var kelime = readln()
    var sonuc3 = kelimeHesap(kelime)
    println("$kelime kelimesinde $sonuc3 tane 'a' harfi bulunmaktadır. ")

    println("---------İç açıları toplamı hesaplama sorusu----------")

    print("Lütfen iç açıları toplamı için kenar değeri giriniz: ")
    var kenar = readln().toDouble()
    var sonuc4 = icAcilar(kenar)
    println("Kenar sayısı $kenar olan şeklin iç açıları toplamı $sonuc4")

    println("---------Mesai ücret hesaplama sorusu----------")
    print("Lütfen saat değeri giriniz:")
    var saat = readln().toDouble()
    var sonuc5 = mesaiHesaplama(saat)
    println("Çalıştığınız saate göre alacağınız ücret $sonuc5")

    println("---------Kotaya göre ödeme hesaplama sorusu----------")
    print("Lütfen ne kadar GB kullandığınızı yazınız: ")
    var kullanim = readln().toDouble()
    var sonuc6 = kotaHesap(kullanim)
    println("Kullandığınız GB: $kullanim ödenmesi gereken fiyat :$sonuc6")

}
fun kotaHesap(kullanim:Double):Double{
    var toplam =0.0
    var sabit = 100.0
    if (kullanim > 50){
        toplam = sabit + ((kullanim-50)*4)
    }
    else{
        toplam = sabit
    }
    return toplam
}
fun icAcilar(kenar:Double): Double{
    var toplam =(kenar-2)*180
    return toplam
}
fun mesaiHesaplama(saat:Double):Double{
    var mesai=0.0

    if (saat>=160){
         mesai = (160*10) + ((saat-160)*20)
    }
    else{
        mesai = (saat*10)
    }
    return mesai
}

fun kelimeHesap(kelime:String): Int {
    var sayac =0
    for (harf in kelime){
        if (harf == 'a' || harf == 'A'){
        sayac+=1
        }
    }
    return sayac
}
fun factHesap(factSayi: Double): Double {
    if (factSayi < 0 || factSayi % 1 != 0.0) {
        println("Yanlış değer girdiniz!")
        return -1.0
    }
    var sonuc2 = 1.0
    var sayi = factSayi
    while (sayi > 1) {
        sonuc2 *= sayi
        sayi--
    }
    return sonuc2
}
fun kenarHesap(uzunKenar:Double,kisaKenar: Double): Double {
    var sonuc1 = (uzunKenar*2)+(kisaKenar*2)
    return sonuc1
}

fun dereceHesap(derece:Double): Double {
    var sonuc = (derece*1.8)+32
    return sonuc
}

