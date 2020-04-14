package ir.ea2.kotlin_oop.enums.sample_02

enum class status(var statusId:Int) {
    ON(0), OFF(1), BURNOUT(2)
}

class Lamp(var status: status)

fun main(){
    val obj = Lamp(status.OFF)
    println(obj.status.statusId)
}