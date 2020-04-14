package ir.ea2.kotlin_oop.inheritance.constructors

fun main() {
    val objectChild = Son("Black","Yellow")
    val objectFather = Father("Green","Green")
    println("--eyeColor--")
    println("Father = ${objectFather.eyeColor}")
    println("Child = ${objectChild.eyeColor}\n")

    println("\n--hairColor--")

    println("Father = ${objectFather.hairColor}")
    println("Child = ${objectChild.hairColor}\n")

    println("\n--Overall--")
    objectChild.printStateSon()
    objectFather.printStateFather()

}

open class Father {
    var eyeColor: String
    var hairColor: String

    constructor(eyeColor: String, hairColor: String) {
        this.eyeColor = eyeColor
        this.hairColor = hairColor
    }

    fun printStateFather(){
        println( "Father => eyeColor: $eyeColor / hairColor: $hairColor" )
    }
}

class Son : Father {


    constructor(eyeColor: String, hairColor: String) : super(eyeColor, hairColor)


    fun printStateSon(){
        println( "Son => eyeColor: $eyeColor / hairColor: $hairColor" )
    }


}