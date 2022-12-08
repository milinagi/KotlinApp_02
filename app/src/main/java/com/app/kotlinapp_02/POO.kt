package com.app.kotlinapp_02

fun main() {
    newTopic("POO")
    subTopic("class")
    println(School())

    //constructor
    subTopic("constructor")
    val school = School("Harv", "Calle Principal #13")
    println(school)

    //overwrite
    subTopic("override")
    val schoolInactive = School("Harv", "Calle Principal #13", false)
    println(schoolInactive)

    //this
    subTopic("this")
    val highSchool =
        School("Stan", "Independencia #232", mutableListOf(Person("Jose", "Rodriguez")))
    println(highSchool)

    //properties & methods
    subTopic("Métodos y propiedades")
    val person = Person("Pedro", "Alttin")
    println(person.getFullName())
    println(person.showWork())
    person.salary = 1000f
    println(person.salary)

    //set & get
    subTopic("set y get")
    person.tax = 20f
    println(person.salary)

    //herencia
    subTopic("Herencia")
    val teacher = Teacher("Alex", "Castillo", 45)
    highSchool.staff.add(teacher)
    val admin = Admin("Gerardo", "Torres", 1)
    highSchool.staff.add((admin))
    println(highSchool)

    //super
    subTopic("Super")
    println("Teacher: ${teacher.showWork()}")
    println("Admin: ${admin.showWork()}")

    //visibilidad o encapsulación
    subTopic("Encapsulación")
    println(teacher.firstName)
    //println(teacher.lastName)
    println(teacher.students)


    //companion object
    subTopic("Companion Object")
    println(School.ACTIVE)
    val schoolActive = School("Oxf", "Calle Romas #324", School.ACTIVE)
    println(schoolActive)

    //Enum
    subTopic("Enum")
    schoolActive.setType(TypeSchool.PRIVATE)
    println(schoolActive.getType())

    //Nested class
    subTopic("Clase anidada")
    println(teacher.classroom)
    teacher.classroom.key = "4ºA"
    println(teacher.classroom)

    //inner
    subTopic("inner")
    println(teacher.classroom.getInfo())

    //interface
    subTopic("interface")
    teacher.salary = 1000f
    val boss: Boss = teacher
    println(boss.namePerson())
    println("Salario en neto " + boss.netSalary())

    //data class
    subTopic("Data class")
    println(schoolActive)
    println(schoolActive.component1())
    val schoolCopy = schoolActive.copy()
    println(schoolCopy)
    schoolCopy.name = "Ford"
    println(schoolCopy)

    //equal & hashcode
    subTopic("equal & hashcode")
    schoolActive.numCode = "356"
    schoolCopy.numCode = "356"
    println(schoolActive.equals(schoolCopy))

    //Tarea 4: Clase personalizada
    subTopic("Tarea 4: Clase personalizada")
    println("----- Phone 01 -----")
    val phone01 = Phone01("Android", "Samsung", "S21")
    println(phone01.getFullPhoneInfo())
    println("Tamaño del teléfono: " + phone01.phoneSize)
    println("Color: " + phone01.color)

    println("\n----- Phone 02 -----")
    val phone02 = Phone02("IOS", "Iphone", "14 Pro")
    println(phone02.getFullPhoneInfo())
    println("Color: " + phone02.color)
    println("Tamaño del teléfono: " + phone02.phoneSize)
}

