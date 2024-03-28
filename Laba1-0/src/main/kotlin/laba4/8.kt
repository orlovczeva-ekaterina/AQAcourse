package laba4

/* *   Четвертая лаба.
 * *   Задание 8: Создайте абстрактный класс Shape с абстрактным методом area(),
 * *   затем создайте классы Circle и Rectangle, реализующие этот метод.
 * *   Создайте объекты Circle и Rectangle и выведите их площадь.
 * */

abstract class Sape() {
    abstract fun area()
}

class Circle(val r: Int) : Sape() {
    override fun area() {
        println("Площадь круга равна ${3.14 * r * r}")
    }
}

class Rectangle(val a: Int, val b: Int) : Sape() {
    override fun area() {
        println("Площадь прямоугольника равна ${a * b}")
    }
}

fun main() {
    val k = Circle(5)
    println(k.area())
    val m = Rectangle(5, 6)
    println(m.area())
}