package com.app.kotlinapp_02

fun main() {
    newTopic("Sentencias condicionales")
    // if
    subTopic("If")
    if(true) {
        println("Condición exitosa")
    }
    // Equality
    subTopic("Equality")
    if(1 == 1) {
        println("1 es igual a 1")
    }

    // Equals
    subTopic("Equals")
        val jr = "Jorge"
        if(jr.equals("Jorge")) {
            println("Es lo mismo")
        }

    // Operadores Lógicos
    subTopic("Operadores Lógicos")
    if (1 != 2) {   //not
        println("1 es diferente de 2")
    }
    if (1 == 1 || 1 < 2) { //or
        println("1 es igual o menor a 2")
    }
    if (1 != 2 && 1 < 2) { //and
        println("1 es diferente y menor que 2")
    }
    //nested if
    if (1 == 1) { //anidaciones
        if (1 < 2) {
            println("if anidado")
        }
    }

    // if else
    subTopic("If else")
    var a = 15
    val b = 5
    if (a == b) {
        println("a es igual a b")
    } else {
        println("no es igual")
    }

    if (a < b) {
        println("a es menor a b")
    } else if (a == b) {
        println("a es igual a b")
    } else {
        println("a es mayor a b")
    }

    // When
    subTopic("When")
    val name = "Cursos Android ANT"
    if (name.equals("Karina")) {
        println("Hola Karinaa")
    } else if (name.equals("Pablo")) {
        println("Hola Pablito")
    } else if (name.equals("Jorge") || name.equals("Cursos Android ANT")) {
        println("Hola Jorgito")
    } else if (name.equals("Pamela")) {
        println("Hola Pamelita")
    } else {
        println("Hola desconocido")
    }

    when(name) {
        "Karina"                ->  println("Hola Karina")
        "Pablo"                 ->  println("Hola Pablito")
        "Jorge",
        "Cursos Android ANT"    ->  println("Hola Jorgito")
        "Pamela"                ->  println("Hola Pamelita")
        else                    ->  println("Hola desconocido :)")
    }

    // Estructuras de datos
    newTopic("Collections")
    // var arg
    subTopic("vararg")
    multiArguments("Karina", "Pamela", "Pablo", "Pitu")

    // Array Simple
    val array = arrayOf('p', 'a', 'm', 'e', 'l', 'a')
    println(array[0])
    println(array.get(1))
    println(array[2])
    val arrayStr: String = "pamela"
    println(arrayStr[3])

    // listOf
    subTopic("listOf")
    //val readOnlyList = listOf<String>("Jorge", "Ana", "Richard", "Lorem")
    val readOnlyList: List<String>
    readOnlyList = listOf("Jorge", "Ana", "Richard", "Lorem")
    println("Read-Only: $readOnlyList")
    println("Read-Only position 1: ${readOnlyList.get(1)}")

    //mutableListOf
    subTopic("mutableListOf")
    val mutableList = mutableListOf("Jorge", "Ana", "Richard", "Lorem")
    println("Mutable: $mutableList")
    mutableList.add("NewName")                  // Add,     Añade un elemto a la lista
    println("Add new name: $mutableList")
    mutableList.removeAt(2)               // removeAt, Elimina un elemento segun el index marcado
    println("Remove at: $mutableList")
    mutableList.remove("Lorem")         // remove,   Elimina un elemento que hayas especificado
    println("Remove: $mutableList")
    mutableList.set(1, "Anabel")               // set,      Modifica el valor de un elemento
    println("Set: $mutableList")

    // Map
    subTopic("Map")
    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("Jor", "Jorge")
    mutableMap.put("Pam", "Pamela")
    mutableMap.put("Cris", "Cristian")
    println("Map: $mutableMap")
    println("Get by key: ${mutableMap.get("Jor")}")
    mutableMap.remove("Pam")
    mutableMap.set("Cris", "Ramón")
    println("Set: $mutableMap")
    println("All keys: ${mutableMap.keys}")
    println("All values: ${mutableMap.values}")

    // ArrayOfNull
    subTopic("Array of null")
    val nullArray = arrayOfNulls<String>(3)
    nullArray[1] = "Karina"
    println(nullArray[1])
    println(nullArray[0])

    // methods collections
    subTopic("Métodos en colecciones")
    println(readOnlyList)
    println("sort: ${readOnlyList.sorted()}")                         // soreter,  ordena de forma alfabética
    println("reverse: ${readOnlyList.reversed()}")                    // reversed, ordena de atrás alante
    println("indexOf Lorem: ${readOnlyList.indexOf("Lorem")}")        // indexOf,  te muestra la posición del elemento buscado (si no existe el elemento buscado te lo imprime la posición -1


    // loops
    newTopic("Bucles")
    loops("Karina", "Pamela", "Pablo", "Pitu", "Ramiro")

    // tarea
    newTopic("tarea")
    var tastMutableList = mutableListOf("a", 1, "b", 2, "c", 3, "d", 4, "e", 5, "f", 6)
    tastMutableList.forEach {
        if (it == 6) {
            println("!Aquí está el número secreto!")
        } else if (it == 5) {
            println("Estas cerca del número secreto")
        } else {
            println("No es el número secreto ..")
        }
    }
}

fun loops(vararg names: String) {
    // for
    subTopic("for")
    for (i in 0..10 step 2) {
        println(i)
    }
    for (i in 0..names.size -1) {
        println("$i = ${names.get(i)}")  // for,     es un bucle
    }
    for (name in names) {
        println(name)
    }

    // foreach
    subTopic("foreach")          // foreach, no es un bucle y solo puede iterar por arrays y objetos
    names.forEach { name ->
        println(name)
    }
    (1..5).forEach {
        println(it)
    }

    // while
    subTopic("while")
    var index = 0
    println(names.size)
    while (index < names.size) {
        println("index: $index")
        println("name at index: ${names.get(index)}")
        // index = index + 1
        index++
    }

    // do while
    subTopic("do while")
    do {
        index--
        println("index: $index")
        println("name at index: ${names.get(index)}")
        // index = index + 1
    } while (index > 0)

    // return
    subTopic("return")
    (1..5).forEach {
        if (it == 3) {
            return@forEach    // el return@foreach salta la condición
            // return            el return al llegar a la condición sale de la función
        }
        println(it)
    }

    // break
    subTopic("break") // El break finaliza el bloque de código pero sigue ejecutandose la función
    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }
    index = names.size
    do {
        index--
        if (index < 0) {
            break
        }
        println("index: $index")
        println("name at index: ${names.get(index)}")
        // index = index + 1
    } while (index >= 0)
}


fun multiArguments(vararg name: String) {
    println("vararg en la posición 0: ${name[0]}")
}