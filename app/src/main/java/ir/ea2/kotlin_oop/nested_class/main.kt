package ir.ea2.kotlin_oop.nested_class

fun main(){
    val objectOC = OuterClass()
    objectOC.foo()
    println("objectOC.name is ${objectOC.name}")

    val objectNC1 = OuterClass.NestedClass1()
    objectNC1.foo1()
    println("objectNC1.name is ${objectNC1.name1}")

    val objectNC2 = OuterClass.NestedClass2()
    objectNC2.foo2()
    println("objectNC2.name is ${objectNC2.name2}")


}



class OuterClass{
    var name:String = "Outer Class"
    fun foo(){
        println("my name is $name \n")
    }

    class NestedClass1{
        var name1 :String = "Nested Class 1"
        fun foo1(){
            println("my name is $name1 \n")
        }
    }

    class NestedClass2 {
        var name2:String = "Nested Class 2"
        fun foo2(){
            println("my name is $name2 \n")
        }
    }

}