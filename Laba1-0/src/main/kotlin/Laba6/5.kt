package Laba6

/* *   Шестая лаба.
 * *   Задание 5: Создайте пользовательское исключение InvalidUserInputException,
 * *   которое выбрасывается, когда пользователь вводит что-то неверное.
 * *   Покажите, как его можно перехватить и обработать.
 * */

class InvalidUserInputException(message: String) : Exception(message) {
    fun mightThrowException() {
        val scan = java.util.Scanner(System.`in`)
        println("Введите свой возраст:")
        val a = scan.nextInt()
        if (a < 0) {
            throw Exception(message)
        }
    }
}

fun main() {
    val persona = InvalidUserInputException("Исключение отрицательного возраста")
    try {
        persona.mightThrowException()
    } catch (e: Exception) {
        println(e.message)
    }
}