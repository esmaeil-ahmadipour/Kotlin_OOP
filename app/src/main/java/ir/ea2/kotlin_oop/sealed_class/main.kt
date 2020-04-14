package ir.ea2.kotlin_oop.sealed_class

sealed class Shape {
    class Circle(private var radius: Float) : Shape() {
        fun drawCircle() {
            println("Drawing Circle with Radius $radius Centimeters")
        }
    }

    class Square(private var length: Int) : Shape() {
        fun drawSquare() {
            println("Drawing Square with Length $length Centimeters")
        }
    }

    object NotShape : Shape()
}

fun checkShape(check: Shape) = when (check) {
    is Shape.Circle -> println("Initialized Circle")
    is Shape.Square -> println("Initialized Square")
    Shape.NotShape -> println("Not A Shape") // We Can Set : Double.NaN , For Doing Nothing !!!
}

fun main() {
    // * We Can't Create Object From sealed class .
    val objCircle = Shape.Circle(12.0f)
    objCircle.drawCircle()
    val objSquare = Shape.Square(120)
    objSquare.drawSquare()

    checkShape(Shape.Square(17))
}