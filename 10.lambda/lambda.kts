// Именованная функция
fun defaultFun(x: Int, y: Int): Int = x + y

// Анонимная функция
val f = fun(x: Int, y: Int): Int = x + y

// Лямбда-выражения всегда окружены фигурными скобками.
val sum = { x: Int, y: Int -> x + y }
println("${sum::class}: ${sum(1, 5)}")

val sum1 = {
    5 + 6
    11 + 8 // Результат
}
println("${sum1::class}: ${sum1()}")
