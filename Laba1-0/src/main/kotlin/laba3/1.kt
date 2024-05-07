package laba3

/* *   Третья лаба.
 * *   Задание 1: Создайте функцию maxOfTwo, которая принимает два числа в качестве аргументов
 * *   и возвращает наибольшее число. Затем, используйте эту функцию для поиска максимального
 * *   числа из двух разных пар чисел.
 * *
 * */

fun maxOfTwo(a: Int, b: Int): Int {

    if (a > b) {
        return a
    } else if (b > a) {
        return b
    } else {
        print("Числа одинаковые и равны ")
        return a
    }

}

fun main() {
    var d = maxOfTwo(2, 5)
    println(d)
    d = maxOfTwo(44, 8)
    println(d)
}