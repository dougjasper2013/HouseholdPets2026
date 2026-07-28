package org.example

class Cat(name: String, age: Int, val breed: String) : Animal(name, age) , Motion  {

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

    override fun walk() {
        println("$name can walk.")
    }

    override fun run() {
        println("$name can run.")
    }

    override fun swim() {
        println("$name does not swim.")
    }

    override fun fly() {
        println("Although $name can leap great distances and" +
                " land on their feet when falling from great " +
                "heights $name can not fly.")
    }

}