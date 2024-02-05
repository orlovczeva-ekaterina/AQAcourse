package laba4

/* *   Четвертая лаба.
 * *   Задание 5: В классе Person добавьте custom геттеры и сеттеры для свойств name и age.
 * *   Убедитесь, что вы можете управлять доступом к этим свойствам извне класса.
 * *   Например, вы можете реализовать проверку возраста в сеттере,
 * *   чтобы убедиться, что возраст неотрицательный.
 * */

class Person {
    private var _name: String = ""
        var name: String
        set(value) {
            println("Setting name to $value")
            _name = value
        }
        get() {
            println("Getting name")
            return _name
        }
    private var _age: Int = 0
        var age:Int
        set(value) {
            if ((value > 0) and (value < 110)) {
                println("Setting age to $value")
                _age = value
            } else {
                println("Возраст не может быть отрицательным либо нереалистично большим")
            }
        }
        get() {
            println("Getting age")
            return _age
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