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

class Bird : Flyable, Navigable {
    override fun fly() {
        println("Птица может летать")
    }

    override fun navigate() {
        println("Птица может ориентироваться в пространстве")
    }
}

class Airplane : Flyable, Navigable {
    override fun fly() {
        println("Самолёт может летать")
    }

    override fun navigate() {
        println("Самолёт может ориентироваться в пространстве")
    }
}

fun main() {
    val goose = Bird()
    println(goose.fly())
    println(goose.navigate())

    val chinaEasternAirlines = Airplane()
    println(chinaEasternAirlines.fly())
    println(chinaEasternAirlines.navigate())
    println("Но как же сложно купить билет на самолёт...")
}