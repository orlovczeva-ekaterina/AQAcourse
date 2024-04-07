package laba5

/* *   Пятая лаба.
 * *   Задание 6: Используя ленивые операции, создайте последовательность чисел от 1 до 1000,
 * *   затем используйте filter чтобы оставить только числа, делящиеся на 5,
 * *   затем map чтобы умножить каждое число на 2,
 * *   и take чтобы взять первые 20 элементов этой последовательности.
 * */

fun main() {

    val sequence = sequence {
        var num = 1
        while (true) {
            yield(num++)
        }
    }

    val lazyValue: List<Int> by lazy {
        val result = sequence.take(1000).toList()
        result
            .filter {
                it % 5 == 0
            }
            .map {
                it * 2
            }
    }
    println(lazyValue)
}


