// определение функционального типа
typealias Operation = (Int, Int) -> Int

// использование функционального типа
fun calculate(op: Operation, a: Int, b: Int): Int {
    return op(a, b)
}

// пример вызова функции calculate
val sum: Operation = { x, y -> x + y }
calculate(sum, 10, 5)    // результат: 15