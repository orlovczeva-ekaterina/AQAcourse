package laba2

import java.util.*

/**
 *   Вторая лаба. Третье задание
 *
 *   с) Условие: Вам дана двумерная матрица целых чисел и целевое число.
 *   Напишите программу на Kotlin, чтобы искать целевое число в матрице.
 *   Если целевое число найдено, выведите его позицию (строка и столбец)
 *   и завершите выполнение циклов; если не найдено, выведите сообщение об этом.
 *   (используйте break). Целевое значение должно вводиться пользователем.
 *
 * val matrix = arrayOf(
 *     arrayOf(1, 2, 3, 4, 5),
 *     arrayOf(6, 7, 8, 9, 10),
 *     arrayOf(11, 12, 13, 14, 15),
 *     arrayOf(16, 17, 18, 19, 20),
 *     arrayOf(21, 22, 23, 24, 25)
 *  )
 *
 */


fun main() {
    val scan = Scanner(System.`in`)

    val matrix = arrayOf(
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(11, 12, 13, 14, 15),
        arrayOf(16, 17, 18, 19, 20),
        arrayOf(21, 22, 23, 24, 25)
    )

    println("Введите число")
    val input = scan.nextInt()
    var result: Boolean = false

    for (i in matrix.indices) {

        for (j in matrix[i].indices) {
            if (matrix[i][j] == input) {
                result = true
                print("В матрице найдено число ${matrix[i][j]} на позиции строка ${i + 1} столбец ${j + 1}")
                break
            }

        }
    }

    if (result == false) {
        print("Ваше число в матрице НЕ найдено!")
    }
}




