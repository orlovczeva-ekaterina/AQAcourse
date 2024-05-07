package laba5

/* *   Пятая лаба.
 * *   Задание 8: Создайте переменную lazyValue типа String, инициализируемую лениво.
 * *   Проверьте, что инициализация действительно происходит только при первом обращении к переменной.
 * */

val lazyValue: String by lazy {
    println("Значение проинициализировано лениво")
    "press" + " f"
}

fun main() {
    println(lazyValue)
    println("$lazyValue уже инициализирована")
}