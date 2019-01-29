package com.cavy.student2

import java.util.*

fun main(args: Array<String>) {
    //userInput()
    val stu = Student("Hank", 99, 88)
    stu.print()
    println("High score : ${stu.highest()}")

}



private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
    var name = scanner.next()
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print()
}

class Student(var name :String, var english :Int , var math :Int){
    fun print(){
        println("$name\t$english\t$math${getAverage()}\t${passOrFailed()}\t${grading()}")
/*        print(name+"\t"+english+"\t"+math+"\t"+getAverage()+"\t"+passOrFailed())
        println  ("\t" + grading())*/

    }

    fun passOrFailed () = if(getAverage()>=60) "PASS" else "FAILED"

    fun grading() : Char{
        var grading:Char =  when (getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }

        return grading;
    }

    fun getAverage() :Int{
        return (english+math)/2
    }

    fun highest() : Int {
        var max = if( english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
       /* if (english > math){
            max = english
        }
        else{
            max = math
        }*/
        return max
    }


}