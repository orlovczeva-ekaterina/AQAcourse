package laba4

/* *   Четвертая лаба.
 * *   Задание 6: Создайте класс Animal с методом makeSound(),
 * *   затем создайте классы Dog и Cat, наследующие от Animal, и переопределите метод makeSound().
 * *   Создайте объекты Dog и Cat и вызовите их методы makeSound().
 * */

open class Animal {
    open fun sound() {
        println("Звуки природы")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Гав гав гав")
    }
}

class Cat : Animal() {
    override fun sound() {
        println("Мяу мяу мяу")
    }
}

fun main() {
    val cube = Dog()
    cube.sound()
    val mouse = Cat()
    mouse.sound()
}