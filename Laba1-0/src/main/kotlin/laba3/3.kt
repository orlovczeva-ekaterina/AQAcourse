package laba3

/* *   Третья лаба.
 *    Задание 3: Создайте инфиксную функцию isGreater ,
 * которая принимает два числа и возвращает true,
 * если первое число больше второго, и false в противном случае.
 * Затем используйте эту функцию, сравнив две пары чисел.
 *
 * */

infix fun Int.isGreater(b: Int): Boolean {
    return this > b
}

fun main() {
    println(6 isGreater 5)
    println(5 isGreater 99)
}