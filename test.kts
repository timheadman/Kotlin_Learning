<<<<<<< HEAD
data class Person(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) { city = newCity }
    fun incrementAge() { age++ }
}

val obj : Person = Person("name", 30, "city")
=======
data class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val studentId: Int) : Person(name, age)

fun main() {
    val student = Student("Alice", 20, 123)
    println(student) // Выведет: Person(name=Alice, age=20)
}
>>>>>>> ba3f1f252ff49f01b7803d6806cea2459edbad4d
