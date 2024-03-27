package laba4

/* *   Четвертая лаба.
 * *   Задание 10: Создайте data class User с двумя свойствами и методом printInfo(),
 * *   который выводит информацию о пользователе.
 * *   Создайте объект User и вызовите его метод printInfo().
 * */

data class User(val name: String, val age: Int) {
    fun printInfo() {
        println("Имя пользователя: $name, возраст: $age")
    }
}

fun main() {
    val kate = User("Kate", 24)
    kate.printInfo()
}