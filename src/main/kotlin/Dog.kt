package org.example

class Dog(name: String, age: Int, val maxSpeed: Int) : Animal(name, age) {

    override fun makeSound() {
        println("$name barks.")
    }

    fun fetch(item: String) {
        println("$name is fetching the $item.")
    }

    fun run() {
        println("$name is running at a top speed of $maxSpeed kilometers per hour.")
    }

    override fun info() {
        super.info()
        println("and $name can run at $maxSpeed KPH.")
    }

}