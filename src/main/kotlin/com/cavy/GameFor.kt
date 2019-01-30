package com.cavy

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1
    println(secret)
    for(i in 1..4){
        println("Please enter a number(${i}/4):")
        var number = scanner.nextInt()
        println("第${i}次$number")
        if(number > secret){
            println("lower")
        }
        else if(number < secret){
            println("higher")
        }
        else{
            println("Great,the number is $secret")
            break
        }

        if(number == -1)
            break;
    }
}