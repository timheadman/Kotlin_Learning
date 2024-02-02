interface Printer {
    fun print()
}

class BasicPrinter : Printer {
    override fun print() {
        println("BasicPrinter - print()")
    }
}

class MiddlePrinter(basicPrinter: BasicPrinter) : Printer {
    override fun print() {
        println("MiddlePrinter - print()")
    }
}

class BigPrinter(basicPrinter: BasicPrinter) : Printer by basicPrinter{
    // print() делигорован полученному в конструкторе объекту basicPrinter
}

val basicPrinter = BasicPrinter()
val middlePrinter = MiddlePrinter(basicPrinter)
val bigPrinter = BigPrinter(basicPrinter)

basicPrinter.print()
middlePrinter.print()
bigPrinter.print()

// ---------------------------------------------------------------
// Пример реализации встроенного делегата map
// ---------------------------------------------------------------
class User(properties: Map<String, Any>) {
    val name: String by properties
    val age: Int by properties
    val email: String by properties
}

fun main() {
    val userProperties = mapOf(
        "name" to "John Doe",
        "age" to 25,
        "email" to "john@example.com"
    )

    val user = User(userProperties)

    println("Name: ${user.name}")
    println("Age: ${user.age}")
    println("Email: ${user.email}")
}