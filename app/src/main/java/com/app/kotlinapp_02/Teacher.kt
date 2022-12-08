package com.app.kotlinapp_02

class Teacher( firstName: String, lastName: String, var students: Short) : Person(firstName, lastName),
    Boss {

    var classroom: Classroom = Classroom(("N/A"))

    override fun showWork(): String {
        return super.showWork() + "\nDando clases..."
    }

    override fun namePerson(): String = getFullName()

    override fun netSalary(): Float = salary

    inner class Classroom(var key: String) {
        override fun toString(): String {
            return "Classroom $key"
        }

        fun getInfo(): String = "Classroom ${key} with teacher $firstName and $students students"
    }


}