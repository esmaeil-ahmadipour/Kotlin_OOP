package ir.ea2.kotlin_oop.interfaces

interface Mathematics {
    var number1: Int
    var number2: Int

    fun sumNumbers(): Int
    fun minusNumbers(): Int
    fun multiplyingNumbers(): Int

}

class Operations(override var number1: Int, override var number2: Int) : Mathematics {
    private var operate: String? = null

    override fun sumNumbers(): Int {
        operate = "$number1 + $number2 ="
        return number1 + number2
    }

    override fun minusNumbers(): Int {
        operate = "$number1 - $number2 ="

        return number1 - number2
    }

    override fun multiplyingNumbers(): Int {
        operate = "$number1 * $number2 ="

        return number1 * number2
    }

    fun result(result: Int) {
        println("$operate $result")
    }
}

fun main() {
    val x = Operations(8, 5)
    x.result(x.sumNumbers())
    x.result(x.minusNumbers())
    x.result(x.multiplyingNumbers())

}