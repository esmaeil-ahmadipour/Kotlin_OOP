package ir.ea2.kotlin_oop.inheritance.overrides

fun main() {
    val objectChild = Son()
    val objectFather = Father()
    println("objectFather.eyeColor = ${objectFather.eyeColor}")
    println("objectChild.eyeColor = ${objectChild.eyeColor}\n")

    println("objectFather.hairColor = ${objectFather.hairColor}")
    println("objectChild.hairColor = ${objectChild.hairColor}\n")

    objectFather.drivingStyle()
    objectChild.drivingStyle()

}

open class Father {
    var eyeColor: String = "Green"
    open var hairColor: String = "Black"
    open fun drivingStyle() {
        println("Father Driving Style : Fast Driving.\n")
    }
    fun drivingBus(){
        println("Father Can Driving A Bus.\n")

    }
}

class Son : Father() {
    override var hairColor: String = "Yellow"
    override fun drivingStyle() {
    println("Son Driving Style : Slow Driving.\n")
    }
}