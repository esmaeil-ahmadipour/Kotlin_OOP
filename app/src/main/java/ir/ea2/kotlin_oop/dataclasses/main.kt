package ir.ea2.kotlin_oop.dataclasses

class MyClass(name: String, age: Int) {}

data class MyDataClass(var name: String, var age: Int) {}

fun main(){
    val myClassObject1=MyClass("Bob",23)
    val myClassObject2=MyClass("Bob",23)
    println("myClassObject1 : $myClassObject1\nmyClassObject2 : $myClassObject2")
    println(myClassObject1 == myClassObject2 )

    val myDataClassObject1=MyDataClass("Bob",23)
    val myDataClassObject2=MyDataClass("Bob",23)
    println("\nmyDataClassObject1 : $myDataClassObject1\nmyDataClassObject2 : $myDataClassObject2")

    println(myDataClassObject1 == myDataClassObject2)

    val myDataClassObject3=myDataClassObject1.copy(name = "Mona")
    println("myDataClassObject3 : $myDataClassObject3")
}