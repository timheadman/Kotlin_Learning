// Функции области видимости (Scope Functions) — let, run, with, apply, also

data class Person(val name: String, val age: Int)

val person = Person("Alice", 30)
val result1 = person.run {
    println("Имя: $name, Возраст: $age")
    age + 5 // возвращаем результат: возраст + 5
}
println("Результат: $result1") // Выводит: Результат: 35
// ------------------------------------------

val nullableString: String? = "Hello"
val length = nullableString?.let {
    println("Длина строки: ${it.length}")
    it.length // возвращаем результат: длина строки
} ?: -1 // в случае, если строка равна null

println("Длина строки или -1, если строка равна null: $length")
// ------------------------------------------


