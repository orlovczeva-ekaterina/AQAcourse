package laba3

/* *   Третья лаба.
 * *   Задание 1: Создайте функцию maxOfTwo, которая принимает два числа в качестве аргументов
 * *   и возвращает наибольшее число. Затем, используйте эту функцию для поиска максимального
 * *   числа из двух разных пар чисел.
 * *
 * */

fun maxOfTwo(a: Int, b: Int): Int {
    val max: Int
    if (a > b) {
        max = a
    } else if (b > a) {
        max = b
    } else {
        print("Числа одинаковые и равны ")
        max = a
    }
    return max
}

fun main() {
    var d = maxOfTwo(2, 5)
    println(d)
    d = maxOfTwo(4, 88)
    println(d)
}