package laba2



/**
 *   Вторая лаба. Второе задание
 *   a) Условие: Создайте массив из 10 чисел. Напишите цикл for,
 *   который будет выводить каждое число и его квадрат.
 *   После этого напишите цикл while, который будет выводить каждое число и его куб.
 *
 *   b) Условие: Используйте функцию repeat для вывода строки “Привет, мир!” 10 раз.
 */

fun main() {
    val numbers: Array<Int> = arrayOf(1, 22, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in numbers) {
        val a = i * i
        println(a)
    }
    var j = 0
    while (j in numbers.indices) { //индексирование в котлине. выражение j in numbers.indices возвращает true, если значение переменной j входит в набор индексов массива
        var result = numbers[j]
        println("Число $result")
        result = result * result * result
        println(" в кубе будет равно: $result")
        j++
    }

    val iterator = numbers.iterator()  //второй вариант

    while (iterator.hasNext()) {
        val number = iterator.next()
        val result = number * number * number
        println("Число: $number, Куб: $result")
    }

    repeat(10) {
        println("Привет, мир!")
    }

    repeat(3) { q ->
        println("Это итерация номер $q")  // вывод итераций на память
    }
}