package laba3

/**
 * Задание 4: Создайте рекурсивную функцию generateSequence,
 *  которая принимает целое число n и генерирует последовательность чисел от 1 до n.
 *  Используйте аннотацию tailrec для оптимизации.
 *
 */


tailrec fun generateSequence(n: Int, current: Int = 1, result: MutableList<Int> = mutableListOf()): List<Int> {
    result.add(current)

    return if (current == n) {
        result
    } else if (current > n) {
        generateSequence(n, current - 1, result)
    } else {
        generateSequence(n, current + 1, result)
    }
}

fun main() {


    println(generateSequence(10))
    println(generateSequence(0))
    println(generateSequence(-10))

}