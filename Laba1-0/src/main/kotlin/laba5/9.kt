package laba5

/* *   Пятая лаба.
 * *   Задание 9: Создайте функцию высшего порядка calculate,
 * *   которая принимает два целых числа и функцию операции.
 * *   Продемонстрируйте использование calculate с разными операциями (сложение, вычитание, умножение).
 * */

fun calculate(a: Int, b: Int, funOperation: (Int, Int) -> Int): Int {
    return funOperation(a, b)
}

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun subtraction(a: Int, b: Int): Int {
    return a - b
}

val multiplication = { a: Int, b: Int ->
    a * b
}
val division = { a: Int, b: Int ->
    if (b != 0) {
        a / b
    } else {
        0
    }
}

fun main() {
    println(calculate(4, 5, ::addition))
    println(calculate(4, 5, ::subtraction))
    println(calculate(4, 5, multiplication))
    println(calculate(4, 0, division))
    println(calculate(4, 2, division))
}
