package laba4

/* *   Четвертая лаба.
 * *   Задание 5: В классе Person добавьте custom геттеры и сеттеры для свойств name и age.
 * *   Убедитесь, что вы можете управлять доступом к этим свойствам извне класса.
 * *   Например, вы можете реализовать проверку возраста в сеттере,
 * *   чтобы убедиться, что возраст неотрицательный.
 * */

class Person {
    var name: String = ""
        set(value) {
            println("Setting name to $value")
            field = value
        }
        get() {
            println("Getting name")
            return field
        }
    var age: Int = 0
        set(value) {
            if ((value > 0) and (value < 110)) {
                println("Setting age to $value")
                field = value
            } else {
                println("Возраст не может быть отрицательным либо нереалистично большим")
            }
        }
        get() {
            println("Getting age")
            return field
        }
}

fun main() {
    val kate = Person()
    kate.name = "Kate"
    kate.age = 24
    kate.age = 583
    println("Имя: ${kate.name}")
    println("Возраст: ${kate.age}")
}