package laba4

/* *   Четвертая лаба.
 * *   Задание 8: Создайте абстрактный класс Shape с абстрактным методом area(),
 * *   затем создайте классы Circle и Rectangle, реализующие этот метод.
 * *   Создайте объекты Circle и Rectangle и выведите их площадь.
 * */

abstract class Shape() {
    abstract fun area(): Double
}

class Circle(val pi: Double, val r: Double) : Shape() {
    override fun area(): Double {
        return pi * r * r
    }
}

class Rectangle(val a: Double, val b: Double) : Shape() {
    override fun area(): Double {
        return a * b
    }
}

fun main() {
    val circle = Circle(3.14 , 5.0)
    println("Площадь круга: ${circle.area()}")
    val rectangle = Rectangle(7.0, 3.0)
    println("Площадь прямоугольника: ${rectangle.area()}")
}