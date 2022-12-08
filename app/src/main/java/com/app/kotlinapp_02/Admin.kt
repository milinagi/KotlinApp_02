package com.app.kotlinapp_02

class Admin(firstName: String, lastName: String, var officeNumber: Short) : Person(firstName, lastName) {
    override fun showWork(): String {
        return "Agendando...\n${super.showWork()} at office number $officeNumber"
    }
}