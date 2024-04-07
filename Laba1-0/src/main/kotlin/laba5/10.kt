package laba5

/* *   Пятая лаба.
 * *   Задание 10: Создайте коллекцию чисел и используйте fold или reduce
 * *   чтобы посчитать их сумму, минимальное и максимальное значения.
 * */

val collectionNumbers = listOf(10, 9, 3, 4, 5, 6, 7, 8, 2, 1)

fun main() {
    val sumFold = collectionNumbers.fold(0) { acc, i -> acc + i }
    println(sumFold)
    val sumReduce = collectionNumbers.reduce { acc, i -> acc + i }
    println(sumReduce)
    val maxFold = collectionNumbers.fold(0) { acc, i ->
        if (acc > i) acc else i
    }
    println(maxFold)
    val maxReduce = collectionNumbers.reduce { acc, i ->
        if (acc > i) acc else i
    }
    println(maxReduce)
    val minFold = collectionNumbers.fold(collectionNumbers[0]) { acc, i ->
        if (acc < i + 1) acc else i
    }
    println(minFold)
    val minReduce = collectionNumbers.reduce { acc, i ->
        if (acc < i) acc else i
    }
    println(minReduce)
}