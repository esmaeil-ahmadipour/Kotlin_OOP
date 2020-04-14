package ir.ea2.kotlin_oop.abstracts

fun main() {
    val person1=Nurse("Mina",25,1005)
    val person2=Teacher("Nima",52,5001)
    person1.information()
    person1.privateInformation()

    person2.information()
    person2.privateInformation()

}

abstract class Person(var name: String, var age: Int) {
    abstract var jobId: Int

    abstract fun privateInformation()
}

class Nurse(name: String, age: Int, override var jobId: Int) : Person(name, age) {
    override fun privateInformation() {
        println("Private Information : I am Nurse And My Nurse-ID Is $jobId \n")
    }
    fun information(){
        println("Information : My name Is $name / My Age Is $age")
    }
}

class Teacher(name: String, age: Int, override var jobId: Int) : Person(name, age) {
    override fun privateInformation() {
        println("Private Information : I am Teacher And My -ID Is $jobId \n")
    }
    fun information(){
        println("Information : My name Is $name / My Age Is $age")
    }
}