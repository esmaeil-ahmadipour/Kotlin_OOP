package ir.ea2.kotlin_oop.generic_class

fun main(){

    val myClass = MyClass<String>( "One" , "Two")
    myClass.printer()

val carFactory = CarFactory()
    carFactory.carModel<String>("C500","Suv 2020","A300")
}

class MyClass <T>(var valueOne : T , var valueTwo:T){

    fun printer(){
        println("Value One : $valueOne")
        println("Value Two : $valueTwo\n")
    }
}

class CarFactory {

    fun<C>carModel(vararg model:C){
        model.forEach { c: C -> println("Model : $c") }
    }
}