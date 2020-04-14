package ir.ea2.kotlin_oop.inner_class

fun main() {
    val objectOC = OuterClass()
    objectOC.foo()
    println("objectOC.name is ${objectOC.name} \n")

    val objectIC = OuterClass().InnerClass()
    println("objectIC.name is ${objectIC.name1}")
    objectIC.foo1()

    val objectNC = OuterClass.NestedClass()
    objectNC.foo2()
    println("objectNC.name is ${objectNC.name2}")


}


class OuterClass {
    var name: String = "Outer Class"
    private var idOuterClass: Int = 500

    fun foo() {
        println("my name is $name")
    }

    inner class InnerClass {
        var name1: String = "InnerClass"
        fun foo1() {
            println("my name is $name1 ")
            println("idOuterClass is $idOuterClass \n")
        }
    }

    class NestedClass {
        var name2: String = "Nested Class"
        fun foo2() {
            println("my name is $name2")
            // * We Cn't Access To idOuterClass
            //println("OuterClass ID is $idOuterClass \n")
        }
    }

}