package ir.ea2.kotlin_oop.enums.sample_01

enum class status {
    ON, OFF, BURNOUT
}

class Lamp(var status: status)

fun main(){
    val obj = Lamp(status.OFF)
    println(obj.status)
}