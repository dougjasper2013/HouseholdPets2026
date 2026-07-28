package org.example

class Dog(name: String, age: Int, val maxSpeed: Int) : Animal(name, age) , Motion {

    override fun makeSound() {
        println("$name barks.")
    }

    fun fetch(item: String) {
        println("$name is fetching the $item.")
    }

    fun runFullSpeed() {
        println("$name is running at a top speed of $maxSpeed kilometers per hour.")
    }

    override fun info() {
        super.info()
        println("and $name can run at $maxSpeed KPH.")
    }

    override fun walk() {
        println("$name can walk.")
    }

    override fun run() {
        println("$name can run.")
    }

    override fun swim() {
        println("$name can swim but only does the dog paddle.")
    }

    override fun fly() {
        println("$name can not fly.")
    }

}