package laba4

/* *   Четвертая лаба.
 * *   Задание 4: Создайте класс Person с приватными свойствами name, age
 * *   и публичными методами getName() и getAge().
 * *   Проверьте, что прямой доступ к этим свойствам невозможен извне класса.
 * */

class Example {
    private val name = "Kate"
    private val age = 24
    fun getName() {
        println(name)
    }

    fun getAge() {
        println(age)
    }
}

fun main() {
    val person = Example()
//    println (person.name)
//    println (person.age)
    person.getName()
    person.getAge()
}