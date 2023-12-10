package laba2

/**
 *   Вторая лаба. Третье задание
 *   a) Условие: Напишите функцию, которая принимает массив чисел
 *   и возвращает сумму только тех чисел, которые больше 10.
 *   Если обнаруживается число меньше 0, функция должна немедленно прекратить обработку
 *   и вернуть текущую сумму (используйте return).
 *
 *   b) Условие: Напишите цикл, который выводит числа от 1 до 10,
 *   но пропускает числа 3 и 7 (используйте continue).
 */


fun sum(numbers: Array<Int>): Int {
    var i = 0
    var result: Int
    result = 0
    while (i in numbers.indices) {
        if (numbers[i] > 10)
            result = result + numbers[i]
        i++

        if (numbers[i] == 0)

            break
    }
    println(result)
    return result
}

fun main() {

    val num: Array<Int> = arrayOf(10, 2, 30, 4, 5, 60, 0, 8, 90, 10)

    sum(num)

    for (i in 1..10) {       //заание b
        if (i == 3 || i == 7)  {
            continue
        }
        println(i)
    }




}