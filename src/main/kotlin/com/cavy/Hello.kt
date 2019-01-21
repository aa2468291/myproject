package com.cavy

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human(66.5f,1.7f);
    println(h.bmi())




}

class Human(var weight:Float,var height:Float){

    fun bmi():Float{
        val bmi = weight/(height*height)
        return bmi
    }


    fun hello(){
        println("Hello kotlin")
    }
}