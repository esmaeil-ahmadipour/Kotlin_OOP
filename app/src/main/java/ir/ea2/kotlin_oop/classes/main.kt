package ir.ea2.kotlin_oop.classes



fun main() {
    useClassCar1()
    useClassCar2()

}

class Car1 {
    var color: String? = null
    var name: String? = null
    var model: String? = null
    fun speed() {
        println("\n my speed is 100km per/second")
    }
}
fun useClassCar1(){
    val objectCar = Car1()
    objectCar.color = "Black"
    objectCar.name = "BMW"
    objectCar.model = "B5"

    objectCar.speed()
    println("objectCar.color = ${objectCar.color}")
    println("objectCar.model = ${objectCar.model}")
    println("objectCar.name = ${objectCar.name}")
}

class Car2 (color: String, name: String, model: String){
    var color = color
    var name = name
    var model = model

    fun speed() {
        println("\n my speed is 200km per/second")
    }
}
fun useClassCar2(){
    val objectCar = Car2("Red","Fiat","C700")

    objectCar.speed()
    println("objectCar.color = ${objectCar.color}")
    println("objectCar.model = ${objectCar.model}")
    println("objectCar.name = ${objectCar.name}")
}