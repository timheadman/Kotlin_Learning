data class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val studentId: Int) : Person(name, age)

fun main() {
    val student = Student("Alice", 20, 123)
    println(student) // Выведет: Person(name=Alice, age=20)
}
