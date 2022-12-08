package com.app.kotlinapp_02

open class Phone01(var system: String, var company: String, var model: String) {

    open var phoneSize: Float = 7.2f
    open var color: String = "Negro"

    open fun getFullPhoneInfo(): String = "Telefono $company, modelo $model, sistema operativo $system "
}

open class Phone02(system: String, company: String, model: String): Phone01(system, company, model) {
    override var phoneSize: Float = 8.0f
    override var color: String = "Blanco"
    var precio: String = "700€"

    override fun getFullPhoneInfo(): String {
        return "El " + super.getFullPhoneInfo() + "se encuentra en rebajas por $precio "
    }
}