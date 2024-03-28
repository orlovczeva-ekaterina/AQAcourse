package laba4

/* *   Четвертая лаба.
 * *   Задание 1: Создайте класс Car с полями model, color, year и методом drive().
 * *   Создайте несколько объектов этого класса и вызовите их метод drive().
 * */

class Car (var model: String, var color: String , var year: Int){
    fun drive() {
        println("$model работает работу")
    }
}

fun main() {
    val aqaCar = Car("Vlad","White",1998)
    aqaCar.drive()
    val qaCar = Car("Max","White",1998)
    qaCar.drive()
    val mondayCar = Car("Kate","White",1998)
    mondayCar.drive()
}