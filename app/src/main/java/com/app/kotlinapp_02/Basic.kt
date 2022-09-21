package com.app.kotlinapp_02


var username = "RC"
const val SPECIES = "Human"
const val SEPARATOR = "==================== "
const val COMMENT = "//"

fun main() {
    print("Testing var in Kotlin ")
    println()
    /*
    val variables = "=============== Variables ==============="
    val variablesGlobales = "=============== Variables Globales ==============="
    val stringTemplate = "=============== String Template ==============="
    val tipoDeDatos = "=============== Tipos De Datos ==============="
    val funciones = "=============== Funciones ==============="
    val sobrecarga = "=============== Sobrecarga/Overload ==============="
    */

    //variables
    // Usamos var cuando queremos re-modificar su valor
    newTopic(topic = "Variables")
    var age = 27
    println(age)
    age = 28
    println(age)

    var age2: Int = 29
    println(age2)

    // Usamos val cuando queremos que su valor sea fijo y no pueda ser modificado
    val name = "Jorge"
    println(name)
    // name = 'Petter' <---- marca error porque no se puedo modificar el valor de una variable de tipo val

    // Podemos declarar una variable sin darle un valor inicial, pero especificando de tipo va a ser
    var job: String
    job = "Developer"
    // job = 27 <---- Conque se trate de una var, al haberle especificado el tipo de valor que contrendrá la variable, no se puede modificar su valor a otro tipo de valor como es Number en este caso
    println(job)

    val language: String
    language = "Kotlin"
    println(language)

    // Variable Global
    newTopic(topic = "Variables Globales")
    println(username)
    // Constantes <---- Es lo mismo que usar una val solo que optimizas más el espacio de almacenamiento
    println(SPECIES) // Usaremos Const siempre que sepamos desde un inicio cual va a ser su valor y no queremos que sea modificado. Si no, utilizaremos val para añadirle el valor más tarde pero que no se pueda modificar. Y si no, utilizamos var sabiendo que su valor puede ser modificado en un futuro



    // String templates
    newTopic(topic = "String Template")
    println("My name is $name")
    println("My username is $username")
    println("I am $SPECIES")
    println("My mane is $name $username and im a $SPECIES")



    // Tipos de datos
    newTopic(topic = "Tipos de Datos")
    val char: Char = 'R'
    val char2: Char = 'C'
    print(char)
    print(char2)
    println()

    val string: String = "RC"
    println(string)

    val boolean: Boolean = true
    println(boolean)
    val boolean2: Boolean = false
    println(boolean2)

    // 8 bit -128 to 127
    val jobs: Byte = 3
    println("$jobs trabajos")
    // 16 bit -32768 to 32767
    val workedDayts: Short = 2000
    println("$workedDayts días trabajados")
    // 32 bit -2,147,483,648 to 2,147,483,647
    val workerMinutes: Int = 2880000
    println("$workerMinutes minutos trabajados")
    // 64 bit -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    val worketInMilliseconds: Long = 172800000000
    println("$worketInMilliseconds milisegundos trabajados")
    // 32 bit 1.40129846432481707e-45 to 3.40282346638528860e+38
    val height: Float = 1.75f
    println("Estatura: ${height}m")
    // 64 bit 4.94065645841246544e-324 to 1.79769313486231570e+308
    val heightDouble: Double = 1.7533333333333
    println("Estatura exacta: ${heightDouble}m")


    // Sobrecarga
    newTopic(topic = "Overload")
    overload(age)
    overload(job)
    overload(job, language)
    overload(language = language)

    // Funciones
    newTopic(topic = "Funtions")
    basic()
    args(name)
    println(returnData())
    homework(newTopic(topic = "Tarea"))

}
fun homework(newTopic: Unit) {
    val name = "Pedrito"
    val username = "Salam"
    val age = 45
    val homeworks = true
    println("Nombre del usuario: $name\nApellidos: $username\nEdad: $age\n¿Ha hecho la tarea?: $homeworks")
}

fun overload(job: String = "Intern", language: String) {
    println("Mi trabajo es: $job con $language")
}

fun overload(job: String) {
    println("Mi trabajo es: $job")
}

fun overload(age: Int) {
    println("Mi edad es: $age")
}

fun returnData(): String {
    return "Datos retornados"
}

fun args(name: String): Unit  {
    println("Hola $name")
}


fun basic() {
    println("Hallo")
}

fun newTopic(topic: String) {
    print("\n$SEPARATOR $topic $SEPARATOR\n")
}

fun subTopic(subTopic: String) {
    print("\n$COMMENT $subTopic\n")
}






