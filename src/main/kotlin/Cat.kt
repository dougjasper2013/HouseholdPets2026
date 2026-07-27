package org.example

class Cat(name: String, age: Int, val breed: String) : Animal(name, age)  {

    override fun makeSound() {
        println("$name meows.")
    }

    fun scratch(item: String) {
        println("$name is scratching $item.")
    }

    fun climb(item: String) {
        println("$name is climbing the $item.")
    }

    override fun info() {
        super.info()
        println("and $name is a $breed cat.")
    }

}