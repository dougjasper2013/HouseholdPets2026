package org.example

class Cat(name: String, age: Int) : Animal(name, age)  {

    override fun makeSound() {
        println("$name meows.")
    }

    fun scratch(item: String) {
        println("$name is scratching $item.")
    }

    fun climb(item: String) {
        println("$name is climbing the $item.")
    }

}