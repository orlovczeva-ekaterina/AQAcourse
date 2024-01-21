package laba4

/* *   Четвертая лаба.
 * *   Задание 7: Создайте класс MathUtils и перегрузите функцию add(),
 * *   чтобы она могла принимать два или три целых числа.
 * */

class MathUtils {
    fun add(a: Int, b: Int): Int {
        val sum: Int
        sum = a + b
        println("Числа: $a и $b дают в сумме $sum")
        return sum
    }

    fun add(a: Int, b: Int, c: Int): Int {
        val sum: Int
        sum = a + b + c
        println("Числа: $a, $b и $c дают в сумме $sum")
        return sum
    }
}

fun main() {
    val s = MathUtils()
    println(s.add(3, 4))
    println(s.add(3, 4, 5))
}