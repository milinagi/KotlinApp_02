package com.app.kotlinapp_02

    open class Person(val firstName: String, private val lastName: String) {
    var tax: Float = 10.0f
    get() = 1 - (field * 0.01f)

    var salary: Float = 0f
    set(value) {
        field = value 
    }
    get() = field * tax

    fun getFullName(): String = "$firstName $lastName"

    open fun showWork(): String {
        return "Capturando datos..."
    }
}