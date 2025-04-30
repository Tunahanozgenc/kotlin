package com.example.myapplication.kendibasima

fun main() {

    val kullaniciGirdisi = "tuna"
    val Kullanici = kullaniciGirdisi.toIntOrNull()

    //if else ile kontrol edilen 1.yönten


    //
    var benimDouble : Double? = null

    val kullaniciGirdisiDouble = kullaniciGirdisi.toDoubleOrNull()


    // !! null değer gelmeyeceğini garanti eden yöntem garanti işlemi biz tarafından veriliyor eğer null gelirse çöker
    if (kullaniciGirdisiDouble !=null){
        println(kullaniciGirdisiDouble/2)
    }

    //elvis operatörü
    //bu şekilde kullanmak uygulamayı çökertmez ama null gelirse de bir sonuç döndürmez
    println(kullaniciGirdisiDouble?.div(2) ?: 20)


    //5.yöntem(güzel bence)

    kullaniciGirdisiDouble?.let {
        println(it*2)
    }

    //en mantıklı 2 yöntem var ya if else ile kontrol et ya da 5.yöntemi kullan !!


    //lateinit : değişekene değer ataması şu an için yapmadığımız durumda sonrasında atayacağımıza dair verdiğimiz söz
    //atama yapılmadığında sorun çıkarır! uygulama çöker!






}