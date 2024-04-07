package laba5

/* *   Пятая лаба.
 * *   Задание 7: Создайте класс Car с полями make, model и year.
 * *   Создайте коллекцию из нескольких объектов этого класса и используйте groupBy
 * *   чтобы сгруппировать машины по году выпуска.
 * */

class Car(val make: String, val model: String, val year: Int) {
    override fun toString(): String {
        return "$make, $model, $year"
    }
}

fun main() {
    val fordM1997 = Car("Russia", "Mondeo", 1997)
    val fordF2011 = Car("Russia", "Focus", 2011)
    val fordC2011 = Car("Russia", "Kuga", 2011)
    val familyCar = listOf(fordM1997, fordF2011, fordC2011)
    println(familyCar.toString())
    val familyCarGroup = familyCar.groupBy { if (it.year == 2011) "2011" else "old car" }
    println(familyCarGroup.toString())
}