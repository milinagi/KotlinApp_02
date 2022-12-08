package com.app.kotlinapp_02


private var nullStrGlobal: String? = null

private lateinit var lateinitGlobal: String
private val lazyGlobal: Any by lazy { "gLazyKotlin" }

fun main() {
    newTopic("Métodos de String")
    //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34
    //K o t l i n   c o u r  s  e     b  y     C  u  r  s  o  s     A  n  d  r  o  i  d     A  N  T
    val course = "Kotlin course by Cursos Android ANT"
    val target = "Android"
    println(course.length)
    println(course.compareTo(target))
    println("android".equals(target))
    println(course.contains(target))
    println(course.lowercase())
    println(course.uppercase())
    println(course.subSequence(0, 12))
    println(course.indexOf("n"))
    val empty = " "
    println(empty.isBlank())
    println(empty.isEmpty())
    println(course.lastIndexOf("n"))
    println(course.lowercase().lastIndexOf("n"))
    println(course.replace('c', 'k'))
    println(course.lowercase().replace("an", "os"))
    println(course.replaceBefore("by", "Only "))
    println(course.reversed())
    println(course.slice(20..course.length-1))
    println(course.split(" "))
    println(course.startsWith('K'))
    println(course.substring(17, 23))
    println(course.substring(course.lastIndexOf('A', course.length)))
    println(" Android ".trim())

    //nullable ? !!
    newTopic("Null safety")
    subTopic("?")
    var nullStr: String? = null
    println(nullStr)
    nullStr = "Hola"
    println(nullStr?.get(0))
    println(nullStrGlobal?.reversed())

    subTopic("!!")
    nullStr = null
    showMessage(nullStr)
    nullStrGlobal = null //"Android"
    showMessage("Kotlin")

    //elvis operator ?:
    subTopic("Operador elvis")
    nullStrGlobal = "Kotlin"
    val elvis = nullStrGlobal ?: "Java"
    println("Yo programo en $elvis")

    val noElvis = if(nullStrGlobal != null) {
        nullStrGlobal
    } else {
        "Java"
    }
    println("Yo programo en $noElvis")

    //redLine
    subTopic("RedLine")
    println("Inserte un número: ")
    val first = readLine()
    val a = first!!.toFloat()
    println("a = $a")
    println("Inserte otro número: ")
    val second = readLine()
    val b = second!!.toFloat()
    println("b = $b")

    //operadores matemáticos
    newTopic("Operadores matemáticos")
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    //cast
    newTopic("Safe cast")
    subTopic("Smart cast")
    var obj: Any = "Kotlin course"
    //obj = 3
    //println(obj.toString().toInt() * b)
    val objNum: Any = 3
    if(objNum is Int) {
        println("objNum es un número")
        println(objNum.toString().toInt() * b)
    } else {
        println("objNum no es un número")
    }

    //try catch finally
    subTopic("Try catch finally")
    obj = 3
    try {
        println(obj.toString().toInt() * b)
        println("obj  es un número y esta es la última linea del try")
    } catch (e: Exception) {
        println(e)
        println("Mensaje personalizado para el error en catch")
    } finally {
        println("Try catch finalizado...")
    }

    //unsafe cast & safe cast
    subTopic("Unsafe cast")
    obj = "true"
    val unsafeStr: String = obj as String
    println(unsafeStr)
    subTopic("Safe cast")
    obj = true
    val safeStr = obj as? String
    println(safeStr)

    //throw
    subTopic("throw")
    val job = "Designer"
    checkType(job)
    try {
        checkType(b)
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Tarea finalizada exitosamente")
    }

    //infix(extension)
    subTopic("infix")
    val name = "Android"
    println(name.uppercase())
    println(name.lowercase())
    println(name.toMixCase(true))
    println(name.toMixCase(false))

    //lazy & lateinit
    newTopic("Asignación tardía")
    subTopic("lateinit")
    if (setValueForLateinit()) {
        println(lateinitGlobal)
        println(lateinitGlobal.toMixCase(true))
    }
    subTopic("lazy")
    println(lazyGlobal)

    //scope functions
    newTopic("Funciones de alcande")
    val highSchool =
        School("Stan", "Independencia #232", mutableListOf(Person("Jose", "Rodriguez")))
    val teacher = Teacher("Alex", "Castillo", 45)
    val admin = Admin("Gerardo", "Torres", 1)
    //with
    subTopic("with") //CON este objeto, haz algo...
    with(highSchool) {
        println("Con este objeto, imprime lo siguiente: ")
        println(getType())
        println(toString())
    }

    //apply
    subTopic("apply") //APLICA las siguientes configuraciones...
    teacher.apply {
        classroom.key = "4ºB"
        salary = 2000f
    }
    println(teacher.classroom.key)
    println(teacher.salary)
    println("Valores asignados correctamente con apply")

    //run
    subTopic("run") //CORRE(ejecuta), el siguiente bloque...
    highSchool.run {
        println("Ejecuta el siguiente bloque de código en el objeto: ")
        staff.add(teacher)
        staff.add(admin)
        println("Members: ${staff.size}")
        println(this)
    }

    //let
    subTopic("let") //PERMITE(deja) ejecutar un bloque de código a un objeto no null (verificado con ?) ...
    var school: School? = null
    school = createSchool()
    school?.let {
        school.staff.add(admin)
        println("Si el objeto es diferente de null, permite imprimirlo: $it")
    }

    //also
    subTopic("also") //Y ADEMÁS... ejecuta el siguiente código
    val udemy: School
    udemy = School().apply {
        numCode = "458".also {
            println("y también, notifica que el código de la escuela nuesta es: $it")
        }
    }
}

private fun createSchool(): School? = School("Harv", "Calle Principal #13")

private fun setValueForLateinit(): Boolean {
    lateinitGlobal = "gLateinitKotlin"

    return lateinitGlobal.isNotEmpty()
}

private infix fun String.toMixCase(firstUpper: Boolean): String {
    var mixString = ""
    var i = 0
    var module = 0

    if (firstUpper) {
        this.uppercase()
    } else {
        this.lowercase()
        module = 1
    }

    while (i < this.length) {
        if (i % 2 == module) {
            mixString += this.get(i).uppercase()
        } else {
            mixString += this.get(i).lowercase()
        }
        i++
    }

    return mixString
}

private fun checkType(value: Any) {
    if (value is String) {
        println("String válido")
    } else {
        throw TypeCastException("No es un String")
    }
}


private fun showMessage(msg: String?) {
    println("? ${msg?.get(0)}")

    if(msg != null) {
        println("! ${msg?.get(0)}")
    }

    if(nullStrGlobal != null) {
        println("g!! ${nullStrGlobal!!.get(0)}")
    }
}