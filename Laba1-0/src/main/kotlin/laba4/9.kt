package laba4

/* *   Четвертая лаба.
 * *   Задание 9: Создайте интерфейс Flyable с методом fly() и интерфейс Navigable
 * *   с методом navigate(), затем создайте классы Bird и Airplane, реализующие эти интерфейсы.
 * *   Создайте объекты Bird и Airplane и вызовите их методы fly() и navigate().
 * */

interface Flyable {
    fun fly()
}

interface Navigable {
    fun navigate()
}

class Bird() : Flyable {
    override fun fly() {
        println("Птица может летать")
    }
}

class Airplane() : Navigable {
    override fun navigate() {
        println("Самолетом можно управлять")
    }
}

fun main() {
    val bird = Bird()
    bird.fly()
    val airplane = Airplane()
    airplane.navigate()
}