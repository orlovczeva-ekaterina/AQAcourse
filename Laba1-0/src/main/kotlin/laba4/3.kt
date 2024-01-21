package laba4

/* *   Третья лаба.
 * *   Задание 3: Создайте объект Singleton с методом printMessage(),
 * *   который выводит любое сообщение. Вызовите этот метод.
 * */


object Singleton {
    val teaType: String = "green"
    fun printMessage() {
        println("I love $teaType tea!")
    }
}

fun main() {
    Singleton.printMessage()
}