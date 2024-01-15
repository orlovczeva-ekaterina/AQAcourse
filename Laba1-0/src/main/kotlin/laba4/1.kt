package laba4

/* *   Четвертая лаба.
 * *   Задание 1: Создайте класс Car с полями model, color, year и методом drive().
 * *   Создайте несколько объектов этого класса и вызовите их метод drive().
 * */

class Car {
    var model: String = "Vlad"
    var color: String = "White"
    var year: Int = 1998
    fun drive() {
        println("$model работает работу")
    }
}

fun main() {
    val aqaCar = Car()
    aqaCar.drive()
    val qaCar = Car()
    qaCar.model = "Max"
    qaCar.drive()
    val mondayCar = Car()
    mondayCar.model = "Kate"
    mondayCar.drive()
}