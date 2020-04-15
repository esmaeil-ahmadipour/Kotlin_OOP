package ir.ea2.kotlin_oop.extension_function


fun main(){

    val newCar =  Car()
    newCar.startCar()
    newCar.moveCar()
    newCar.breakCar()
    newCar.damageCar()
}

class Car{

    fun startCar(){
        println("Starting !")
    }
    fun moveCar(){
        println("Moving !")
    }
    fun breakCar(){
        println("Break !")
    }
}

fun Car.damageCar(){
    println("Damage Car !")
}