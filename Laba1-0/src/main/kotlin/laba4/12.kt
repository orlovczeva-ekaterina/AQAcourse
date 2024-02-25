package laba4

/* *   Четвертая лаба.
 * *   Задание 12: Создайте два класса: Mammal и CanFly.
 * *   В классе Mammal определите метод breastfeed(), а в классе CanFly - метод fly().
 * *   Затем создайте класс Bat, который сочетает в себе оба этих поведения (с помощью композиции).
 * */

class Mammal {
    fun breastfeed() {
        println("Это млекопитающее питается молоком")
    }
}
class CanFly {
    fun fly() {
        println("Это животное может летать")
    }
}
class Bat {
    private val mammal = Mammal()
    private val canFly = CanFly()

    fun breastfeed() {
        mammal.breastfeed()
    }

    fun fly() {
        canFly.fly()
    }
}

fun main() {
    val bat = Bat()
    bat.breastfeed()
    bat.fly()
}