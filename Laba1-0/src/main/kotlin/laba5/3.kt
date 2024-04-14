package laba5

/* *   Пятая лаба.
 * *   Задание 3: Напишите функцию высшего порядка, которая принимает два параметра:
 * *   целое число и функцию, принимающую целое число и возвращающую строку.
 * *   Эта функция должна преобразовывать число в строку с помощью переданной функции
 * *   и возвращать результат.
 * */

fun perform(a: Int, operation: (Int) -> String): String {
    return operation(a)
}

fun toString(a: Int): String {
    return a.toString()
}

val toString = { a: Int -> a.toString() }

fun main() {
    println(perform(5, ::toString))
    println(perform(7, toString))
}