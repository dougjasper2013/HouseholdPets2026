package org.example

open class Animal(val name: String, val age: Int) {

    open fun makeSound() {
        println("$name makes a sound.")
    }

    open fun info(){
        println("$name is $age year(s),old.")
    }

}