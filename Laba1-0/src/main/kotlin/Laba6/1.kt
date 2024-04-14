package Laba6

/* *   Шестая лаба.
 * *   Задание 1: Вам дан код: val a: String? = null.
 * *   Каковы способы, которыми вы можете обратиться к a без вызова исключения NullPointerException?
 * */

fun main() {
    val a: String? = null
    val a1: Int? = a?.length
    println(a1)
    val a2: Int? = a?.length ?: 0
    println(a2)
    val a3: Int?
    if (a != null) {
        a3 = a.length
    } else {
        a3 = 0
    }
    println(a3)
}