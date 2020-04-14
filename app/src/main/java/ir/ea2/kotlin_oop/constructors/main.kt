package ir.ea2.kotlin_oop.constructors

fun main() {
    val objectUser1 = User1("User One", 101)
    println("objectUser1.name : ${objectUser1.name} \nobjectUser1.id : ${objectUser1.id} \n")

    val objectUser2 = User2("User Two", 202)
    println("objectUser2.name : ${objectUser2.name} \nobjectUser2.id : ${objectUser2.id} \n")

    val objectUser3 = User3("User Three", 303)
    val objectUser4 = User4("User Four", 404)

}

class User1(name: String, id: Int) {
    var name = name
    var id = id
}

class User2(var name: String, var id: Int)

class User3(name: String, id: Int) {
    init {
       val name = name
        val id = id
        println("objectUser3.name : ${name} \nobjectUser3.id : ${id} \n")

    }
}
class User4{
    constructor(name: String, id: Int):this(id){
        println("constructor(name: String, id: Int)\nobjectUser4.name : ${name} \nobjectUser4.id : ${id} \n")
    }
    constructor(id: Int){
        println("constructor(id: Int)\nID IS: ${id}")
    }
}