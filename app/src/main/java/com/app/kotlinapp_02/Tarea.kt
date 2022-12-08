package com.app.kotlinapp_02

fun main(){
    //Tarea
    subTopic("Tarea Kotlin Advance")
    var num: Any?
    num = 5.0
    safeTask(num)
    num = null
    safeTask(num)
    num = "J"
    safeTask(num)
}

fun safeTask(num: Any?) {
    num.let {
        if (num is Double) {
            println("num: ${num.toDouble()}")
        }
    }
}