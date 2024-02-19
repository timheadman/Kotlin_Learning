fun defaultFun(x: Int, y: Int): Int = x + y
println("Именованная функция defaultFun(x: Int, y: Int): Int = x + y [print(defaultFun(5, 7))] ${defaultFun(5, 7)}")
// ------------------------------------------

val f = fun(x: Int, y: Int): Int = x + y
println("Анонимная функция val f = fun(x: Int, y: Int): Int = x + y [${f::class}]: ${f(4, 8)}")
// ------------------------------------------

val sum = { x: Int, y: Int -> x + y }
println("Лямбда-выражения всегда окружены фигурными скобками [${sum::class}]: ${sum(1, 5)}")
// ------------------------------------------

val sum1 = {
    val r1 = 5 + 6
    val r2 = 11 + 8
    // Последнее выражение в лямбде считается возвращаемым значением:
    r1
}
println("${sum1::class}: ${sum1()}")
// ------------------------------------------

var sum2 = { x: Int -> x * 2 }
sum2 = { it * 2 + 1 }
println("${sum1::class}: ${sum2(4)}")
// ------------------------------------------

// Эти примеры демонстрируют использование синтаксиса trailing lambda
// для функций высшего порядка map и reduce в Kotlin.
val numbers = listOf(1, 2, 3, 4, 5)
val doubled1 = numbers.map({ it * 2 })
val doubled2 = numbers.map { it * 2 } // лямбда-выражение вынесено за круглые скобки
val sum3 = numbers.reduce { accumulator, current -> accumulator + current } // круглые скобки опущены
println(doubled1)
println(doubled2)
println(sum3)
// ------------------------------------------

// В отличие от обычных функций, в анонимной функции можно опустить тип параметров, если его можно вывести из контекста.
val numbers1 = listOf(1, 2, 3, 4, 5)
val evenNumbers = numbers1.filter(fun(n) = n % 2 == 0)
print(evenNumbers)
// ------------------------------------------

// Пример оператора return с меткой
val list = listOf(1, 2, 3, 4, 5)
list.forEach myLoop@{
    if (it == 3) {
        return@myLoop // Возврат из цикла forEach с меткой myLoop
    }
    println(it)
}
println("Этот код выполнится после цикла")