package laba4

/* *   Четвертая лаба.
 * *   Задание 2: Создайте enum class DayOfWeek, содержащий все дни недели.
 * *   Выведите все дни недели, используя свойства values и name этого enum.
 * */

enum class DayOfWeek(val isWeeknd: Boolean) {
    Sunday(true),
    Monday(false),
    Tuesday(false),
    Wednesday(false),
    Thursday(false),
    Friday(false),
    Saturday(true);
}

fun main() {
    for (day in DayOfWeek.values())
        println("День: ${day.name}, Выходной: ${day.isWeeknd}")
}