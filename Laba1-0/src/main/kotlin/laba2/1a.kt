package laba2
/**
 *   Вторая лаба. Первое задание
 *   Условие: Напишите программу, которая принимает целое число от пользователя и проверяет,
 *   является ли оно положительным, отрицательным или нулем.
 *   Используйте различные варианты условных операторов (if, if-else, when)
 */


fun main() {
    val scan = java.util.Scanner(System.`in`)

    println("Введите число:")

    val a = scan.nextInt()

    if (a > 0) {
        println("a положительное")
    } else if (a < 0) {
        println("a отрицательное")
    } else {
        println("a = 0")
    }

    println("Введите число:")
    val b = scan.nextInt()
    when (b > 0) {
        true -> println("Ваше число положительное")
        false -> if (b < 0) {
            println("Ваше число отрицательное")
        }
            else println("Ваше число равно 0")


    }

}