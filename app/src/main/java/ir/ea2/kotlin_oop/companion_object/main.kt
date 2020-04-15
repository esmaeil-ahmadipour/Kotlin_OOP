package ir.ea2.kotlin_oop.companion_object

fun main() {
Car.remoteOpenDoor()
    Car.turnOnRadio()
}

class Car {
    companion object {
        fun remoteOpenDoor() {
            println("Open Door with Remote!")
        }
    }
    fun keyOpenDoor() {
        println("Open Door with Key!")
    }
    fun startCar() {
        println("Start Car !")
    }

    fun moveCar() {
        println("Move Car !")
    }

    fun breakCar() {
        println("Break Car !")
    }
}

fun Car.Companion.turnOnRadio(){
    println("Turn On Radio with Remote !!!")
}

