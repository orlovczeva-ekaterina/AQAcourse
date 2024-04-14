package Laba6

/* *   Шестая лаба.
 * *   Задание 3: Вам дан код: var s: String? = null.
 * *   Преобразуйте его в ненулевое значение с помощью оператора elvis,
 * *   чтобы вместо null было значение "empty".
 * */

fun main() {
    var s: String? = null
    s = s ?: "empty"
    println(s)
}
