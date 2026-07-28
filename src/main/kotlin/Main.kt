package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Welcome to Household Pets 2026")
    println()

    val myCat = Cat("Garfield", 8, "Ginger")

    myCat.info()
    myCat.makeSound()
    myCat.scratch("furniture")
    myCat.climb("fence")
    println()
    myCat.walk()
    myCat.run()
    myCat.swim()
    myCat.fly()

    println()
    println()

    val myDog = Dog("Odie", 5, 20)

    myDog.info()
    myDog.makeSound()
    myDog.fetch("ball")
    myDog.runFullSpeed()
    println()
    myDog.walk()
    myDog.run()
    myDog.swim()
    myDog.fly()

    println()
    println()

}