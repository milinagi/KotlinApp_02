package com.app.kotlinapp_02


data class School(var name: String, var address: String, val active: Boolean = true, var numCode: String = "") {

    var staff: MutableList<Person>
    private var typeSchool: TypeSchool = TypeSchool.FEDERAL

    val ACTIVE = true
    val INACTIVE = false

    init {
        staff = mutableListOf()
    }

    constructor(): this("", "")
    constructor(name: String, address: String, staff: MutableList<Person>) : this(name, address) {
        this.staff = staff
    }

    /*override fun toString(): String {
        if(active){
            return if(staff.size > 0) {
                "name: $name at $address, with ${staff.size} members"
            } else {
                "name: $name at $address"
            }
        } else {
            return "Escuela inactiva"
        }
    }*/

    fun setType(typeSchool: TypeSchool) {
        this.typeSchool = typeSchool
    }

    fun getType(): String = typeSchool.type

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as School

        if (numCode != other.numCode) return false

        return true
    }

    override fun hashCode(): Int {
        return numCode.hashCode()
    }


    companion object {
        const val ACTIVE = true
        const val INACTIVE = false
    }
}