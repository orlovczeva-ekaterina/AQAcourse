package Laba6

/* *   Шестая лаба.
 * *   Задание 5: Создайте пользовательское исключение InvalidUserInputException,
 * *   которое выбрасывается, когда пользователь вводит что-то неверное.
 * *   Покажите, как его можно перехватить и обработать.
 * */

class InvalidUserInputException(message: String) : Exception(message)
class Persona() {
    fun mightThrowException() {
        val scan = java.util.Scanner(System.`in`)
        println("Введите свой возраст:")
        val age = scan.nextInt()
        if (age < 0) {
            throw InvalidUserInputException("Исключение отрицательного возраста")
        }
    }
}

fun main() {
    val persona = Persona()
    try {
        persona.mightThrowException()
    } catch (e: Exception) {
        println(e.message)
    }
}
