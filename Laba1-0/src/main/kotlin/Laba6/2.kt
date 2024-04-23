package Laba6

/* *   Шестая лаба.
 * *   Задание 2: Рассмотрите следующий код:
 * *   fun main() {
 * *       val nullableList: List<Int?> = listOf(1, 2, null, 4)
 * *       val intList: List<Int> = nullableList.filterNotNull()
 * *       println(intList)
 * *   }
 * *   Что будет выведено в результате выполнения этого кода? Почему
 * *
 * *   Ответ:
 * *   Выведется список из значений которе не являются null.
 * *   В первой строке мы создаем коллекцию которая может иметь значения null.
 * *   Во второй строке мы создаем коллекцию которая не может иметь значения null.
 * *   Ей присваиваем отфильтрованную от null значений коллекцию.
 * *   То есть мы можем intList присвоить nullableList только потому что операция filterNotNull()
 * *   отфильтрует все null значения и nullableList.filterNotNull() вернет коллекцию
 * *   которая содержит только те элементы nullableList коллекции, которые не null
 * */

fun main() {
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)
}