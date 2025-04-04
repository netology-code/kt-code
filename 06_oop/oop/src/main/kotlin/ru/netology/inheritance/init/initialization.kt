package ru.netology.inheritance.init

open class Parent(open val prop: String) {
    val value = prop.uppercase()

    init {
        println(value)
    }
}

class Child: Parent("") {
    override val prop = "Child"
}

fun main() {
    val obj = Child()
}

